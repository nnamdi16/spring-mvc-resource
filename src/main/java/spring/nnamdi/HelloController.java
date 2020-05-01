package spring.nnamdi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DispatcherServlet is a class that receives the incoming request and maps it to the
 * right resource such as controller, model and views.
 * Model - A model contains the data of the application. A data is a single object or a collection of objects
 * Controller: A controller contains the business logic of an application. @Controller annotation is used.
 * View: A view represents the provided information in a particular format.e.g JSP+JSTL, Apache Velocity, Thymeleaf and Freemaker
 * Front Controller:DispatcherServlet acts as the front controller
 * @Controller annotation marks the class as a controller
 * @Requestmapping used to map the class with the specified url name.
 */

@Controller
public class HelloController {
    @RequestMapping("/")
    public String display() {
        return "index";
    }
}
