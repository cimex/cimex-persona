/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timothyyip.persona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.timothyyip.randompersona.RandomPersonaUtil;

/** 
 *
 * @author Timothy
 */
@Controller
public class PersonaController {

    public PersonaController() {
    }

    @RequestMapping(value = "/json/")
    public ModelAndView getJson() {
        return getJsons(5);
    }
    
    @RequestMapping(value = "/json/{count}")
    public ModelAndView getJsons(@PathVariable("count") Integer count) {
        if(count==null)count = 5;
        if(count>500)count = 500;
        ModelAndView mav = new ModelAndView("jsonView", "personas", RandomPersonaUtil.generatePersona(count));
        return mav;
    }
    
    
    @RequestMapping(value = "/xml/")
    public ModelAndView getXML() {
        return getXMLs(5);
    }
    
    @RequestMapping(value = "/xml/{count}")
    public ModelAndView getXMLs(@PathVariable("count") Integer count) {
        if(count==null)count = 5;
        if(count>500)count = 500;
        ModelAndView mav = new ModelAndView("xmlView", "personas", RandomPersonaUtil.generatePersona(count));
        return mav;
    }
}
