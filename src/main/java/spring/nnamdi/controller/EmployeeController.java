//package spring.nnamdi.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.bind.support.SessionStatus;
//import spring.nnamdi.model.EmployeeVO;
//import spring.nnamdi.service.EmployeeManager;
///**
// * DispatcherServlet is a class that receives the incoming request and maps it to the
// * right resource such as controller, model and views.
// * Model - A model contains the data of the application. A data is a single object or a collection of objects
// * Controller: A controller contains the business logic of an application. @Controller annotation is used.
// * View: A view represents the provided information in a particular format.e.g JSP+JSTL, Apache Velocity, Thymeleaf and Freemaker
// * Front Controller:DispatcherServlet acts as the front controller
// * @Controller annotation marks the class as a controller
// * @Requestmapping used to map the class with the specified url name.
// */
//@Controller
//@RequestMapping("/employee-module/addNew")
//@SessionAttributes("employee")
//public class EmployeeController {
////    @Autowired
//    public EmployeeManager manager;
//
//
//    @Autowired
//    public void setManager(EmployeeManager manager) {
//        this.manager = manager;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String setupForm(Model model) {
//        EmployeeVO employeeVO = new EmployeeVO();
//        model.addAttribute("employee",employeeVO);
//        System.out.println("Welcome");
//        return "addEmployee";
//
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String submitForm(@ModelAttribute("employee")EmployeeVO employeeVO, BindingResult result, SessionStatus status) {
//
//       //Validation code starts
//
//        boolean error = false;
//        System.out.println(employeeVO);
//        if (employeeVO.getFirstName().isEmpty()) {
//            result.rejectValue("firstName","error.firstName");
//            error = true;
//        }
//
//        if (employeeVO.getLastName().isEmpty()) {
//            result.rejectValue("lastName","error.lastName");
//            error = true;
//        }
//
//        if (employeeVO.getEmail().isEmpty()) {
//            result.rejectValue("email","error.email");
//            error = true;
//        }
//
//        if (error) {
//            return "addEmployee";
//        }
//        status.setComplete();
//        return "redirect:addSuccess";
//    }
//
//    @RequestMapping( value = "/success" ,method = RequestMethod.GET)
//    public String success() {
//        return "addSuccess";
//    }
//
//    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
//    public String getAllEmployees(Model model) {
//        model.addAttribute("employees", manager.getAllEmployees());
//        return "employeesListDisplay";
//    }
//}
