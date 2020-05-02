package spring.nnamdi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @RequestMapping can be used to map URLs to controller methods
 */
@Controller
@RequestMapping("/access")
public class DemoController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap modelMap) {
        modelMap.addAttribute("message","Spring 3 MVC Hello World !! Thanks to www.howtodoinjava.com");
        return "helloWorld";
    }
}
