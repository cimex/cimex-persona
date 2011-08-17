/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timothyyip.randompersona;

import java.util.Date;
import org.apache.commons.lang.math.RandomUtils;
import org.joda.time.LocalDate;

/**
 *
 * @author Timothy
 */
public class RandomDateGenerator
{

    public static void populatePersonaDates(PersonaModel personaModel)
    {
        personaModel.setDateOfBirth(getRandomDOB(25, 65));
        
    }

    private static Date getRandomDOB(int minAge, int maxAge)
    {
        LocalDate todayDt = new LocalDate();
        LocalDate dt = new LocalDate(todayDt.getYear(), RandomUtils.nextInt(12) + 1, 1);
        int maxDayForMonth = dt.dayOfMonth().getMaximumValue();
       dt= dt.minusDays(-(maxDayForMonth - 1));

        //if not past birthday
        if (todayDt.getDayOfYear() < dt.getDayOfYear())
        {
            minAge++;
        }

        dt = dt.minusYears(RandomUtils.nextInt(maxAge - minAge) + minAge);
        return dt.toDateTimeAtStartOfDay().toDate();
    }
}
