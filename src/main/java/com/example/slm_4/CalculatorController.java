package com.example.slm_4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    Calculator calc = new Calculator();

    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {

        return calc.sum(a, b);
    }

    @RequestMapping("/mult")
    public int mult(@RequestParam int a, @RequestParam int b) {

        return calc.mult(a, b);
    }

    @RequestMapping("/minus")
    public int minus(@RequestParam int a, @RequestParam int b) {

        return calc.minus(a, b);
    }

    @RequestMapping("/divided")
    public int divided(@RequestParam int a, @RequestParam int b) {

        return calc.divided(a, b);
    }

    @RequestMapping("/potent")
    public double potent(@RequestParam double a, @RequestParam double power) {

        return calc.potent(a, power);

    }

    @RequestMapping("/root")
    public double squareRoot(@RequestParam double a) {

        return calc.squareRoot(a);

    }

    @RequestMapping("/absolut")
    public double absolut(@RequestParam double a) {

        return calc.absolut(a);
    }


}
