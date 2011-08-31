/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timothyyip.persona.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
        
        ModelAndView mav = new ModelAndView("jsonView", BindingResult.MODEL_KEY_PREFIX + "books", RandomPersonaUtil.generatePersona(5));
        return mav;
    }
    
    @RequestMapping(value = "/xml/")
    public ModelAndView getAllBooks() {
        
        ModelAndView mav = new ModelAndView("xmlView", BindingResult.MODEL_KEY_PREFIX + "books", RandomPersonaUtil.generatePersona(5));
        return mav;
    }
}
