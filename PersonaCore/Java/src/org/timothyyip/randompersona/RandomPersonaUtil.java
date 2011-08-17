/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timothyyip.randompersona;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Timothy
 */
public class RandomPersonaUtil
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        for (PersonaModel model: generatePersona(1)){
            System.out.println(model);
            System.out.println("\n");
        }
    }

    public static List<PersonaModel> generatePersona(int size)
    {
        List<PersonaModel> personas = new ArrayList<PersonaModel>();

        for (int i = 0; i < size; i++)
        {
            PersonaModel persona = new PersonaModel();
            RandomNameGenerator.createPersonaName(persona);
            RandomBusinessGenerator.createBusiness(persona);
            RandomDateGenerator.populatePersonaDates(persona);
            personas.add(persona);
        }

        return personas;
    }
}
