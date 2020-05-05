package spring.nnamdi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import spring.nnamdi.model.SignUpForm;

/**
 * SignUpController class for User sign up form processing
 *
 * @author Nwabuokei Nnamdi
 */
@Controller
public class SignUpController {
    /**
     * Create new SignUpForm object for empty form
     *
     * @return
     */
    @ModelAttribute("showSignUpForm")
    public SignUpForm setSignUpForm() {
        return new SignUpForm();
    }

    /**
     * Method to show the initial HTML form
     * @return
     */
    @GetMapping("/showSignUpForm")
    public String showForm() {
        return "signup-form";
    }

    /**
     * Save User sign up form
     * @param signUpForm
     * @param model
     * @return
     */
    @PostMapping("/saveSignUpForm")
    public String saveUser(@ModelAttribute("signUpForm") SignUpForm signUpForm, Model model) {
        //Implement business logic to save user details into a database.

        System.out.println("FirstName: " + signUpForm.getFirstName());
        System.out.println("LastName: " + signUpForm.getLastName());
        System.out.println("Username: " + signUpForm.getUsername());
        System.out.println("Password: " + signUpForm.getPassword());
        System.out.println("Email: " + signUpForm.getEmail());
        model.addAttribute("message","User SignUp successful");
        model.addAttribute("user",signUpForm);
        return "signup-success";
    }
}
