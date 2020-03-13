package com.codeup.europa.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class HelloController {

    // This will return output to  localhost:8080/hello.
    @GetMapping("/")
    @ResponseBody
    public String landingPage() {
        return "Welcome To The Landing Page!";
    }


    // This will return output to  localhost:8080/hello.
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Ruben from CV19!";
    }

    // This will return a response based on the provided parameter (localhost:8080/hello/john)
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
//
//    // Takes in a path variable as int
//    // Example uses REQUESTMAPPING to call a GET method...  make use GetMapping instead....
//    @RequestMapping(path = "math/increment/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOne(@PathVariable int number) {
//        return number + " plus one is " + (number + 1) + "!";
//    }
//
//    // Same as above using a @GetMapping
//    @GetMapping("math/decrement/{number}")
//    @ResponseBody
//    public String SubOne(@PathVariable int number) {
//        return number + " plus one is " + (number - 1) + "!";
//    }
//
//    // Same as above using a @GetMapping
//    @GetMapping("math/multiply/{number}")
//    @ResponseBody
//    public String TimesTwo(@PathVariable double number) {
//        return number + " plus one is " + (number * 2) + "!";
//    }
//

//    @GetMapping("/math/user/{name}")
//    @ResponseBody
//    public String sayHiMath(@PathVariable String name) {
//        return "Hello " + name + "!";
//    }



}
