package com.codeup.europa.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class MathController {

    @GetMapping("/math")
    @ResponseBody
    public String landingPage() {
        return "Welcome To Math Page";
    }


    @GetMapping("math/add/{number1}/and/{number2}")
    @ResponseBody
    public String add(@PathVariable int number1,
                      @PathVariable int number2) {
        return number1 + " plus number " + number2 + " equals " + (number1+number2) + "!";
    }

//
    @GetMapping("math/subtract/{number1}/and/{number2}")
    @ResponseBody
    public String sub(@PathVariable int number1,
                      @PathVariable double number2) {
        return number1 + " minus number " + number2 + " equals " + (number1-number2) + "!";
    }
//
//
    @GetMapping("math/multiply/{number1}/and/{number2}")
    @ResponseBody
    public String multiply(@PathVariable int number1,
                           @PathVariable int number2) {
        return number1 + " multiply by  number " + number2 + " equals " + (number1*number2) + "!";
    }
//
    @GetMapping("math/divide/{number1}/and/{number2}")
    @ResponseBody
    public String divide(@PathVariable int number1,
                         @PathVariable double number2) {
        return number1 + " divided  by  number " + number2 + " equals " + (number1/number2) + "!";
    }
//
//


    @GetMapping("math/multiply2/{number1}/and/{number2}")
    @ResponseBody
    public String multiply(@PathVariable double number1,
                           @PathVariable double number2) {
        return number1 + " multiply by  number " + number2 + " equals " + (number1*number2) + "!";
    }


    @GetMapping("math/multiply3/{a}/and/{b}")
    @ResponseBody
    public double divide(@PathVariable double a,
                           @PathVariable double b) {
        return a/b;
    }



}

