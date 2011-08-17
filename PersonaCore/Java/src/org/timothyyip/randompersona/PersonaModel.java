/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timothyyip.randompersona;

import java.util.Date;
import org.apache.commons.lang.time.DateFormatUtils;

/**
 *
 * @author Timothy
 */
public class PersonaModel
{

    private String title;
    private String firstName;
    private String lastName;
    private String fullName;
    private String companyName;
    private String email;
    private String jobTitle;
    private Date dateOfBirth;
    private boolean male;
    

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public boolean isMale()
    {
        return male;
    }

    public void setMale(boolean male)
    {
        this.male = male;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(this.title).append("\n");
        sb.append("First Name: ").append(this.firstName).append("\n");
        sb.append("Last Name: ").append(this.lastName).append("\n");
        sb.append("Full Name: ").append(this.fullName).append("\n");
        sb.append("Company Name: ").append(this.companyName).append("\n");
        sb.append("Email: ").append(this.email).append("\n");
        sb.append("Job Title: ").append(this.jobTitle).append("\n");
        sb.append("DOB: ").append(DateFormatUtils.format(this.dateOfBirth, "dd/MM/yyyy")).append("\n");
        sb.append("Gender: ").append(this.isMale()?"M":"F").append("\n");
        return sb.toString();
    }
}
