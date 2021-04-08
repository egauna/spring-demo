package com.fzybun.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @RequestMapping("/basic")
    public String sayHello() {
        return "<h1>hello<h1>";
    }

    @RequestMapping("/proper")
    public String sayProperHello() {
        return "<h1>Hello there, how are you?<h1>";
    }

    @RequestMapping("/user_entry")
    public String userForm() {
        return "<form action=\"/greeting/user_greeting\" method=\"POST\">\n" +
        "<label for=\"fname\">First name:</label><br>\n" +
        "<input type=\"text\" id=\"fname\" name=\"fname\"><br>\n" +
        "<label for=\"lname\">Last name:</label><br>\n" +
        "<input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" +
        "<input type=\"submit\" value=\"Submit\">\n" +
        "</form> ";
    }
    
    @RequestMapping(value = "user_greeting", method = RequestMethod.POST)
    public String printUserGreeting(@RequestParam("fname") String firstname, @RequestParam("lname") String lastname) {
        return "Hello there, " + firstname + " " + lastname;
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    public String getOrder(@PathVariable("id") String id) {
        return "Order ID: " + id;
    }

}
