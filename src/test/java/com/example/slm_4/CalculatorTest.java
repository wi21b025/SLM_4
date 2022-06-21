package com.example.slm_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void sumTest(){
        //ASSERT der INPUT Variablen
        int a = 1;
        int b = 1;

        int expectedResult = 2;
        //ACT

        int result = calc.sum(a,b);
        //assert
        //expected result == result
        assertEquals(expectedResult,result);
    }
    @Test
    void minusTest(){
        //ASSERT der INPUT Variablen
        int a = 1;
        int b = 1;

        int expectedResult = 0;
        //ACT

        int result = calc.minus(a,b);
        //assert
        //expected result == result
        assertEquals(expectedResult,result);
    }
    @Test
    void multTest(){
        //ASSERT der INPUT Variablen
        int a = 1;
        int b = 1;

        int expectedResult = 1;
        //ACT

        int result = calc.mult(a,b);
        //assert
        //expected result == result
        assertEquals(expectedResult,result);
    }
    @Test
    void divisTest(){
        //ASSERT der INPUT Variablen
        int a = 4;
        int b = 2;

        int expectedResult = 2;
        //ACT

        int result = calc.divided(a,b);
        //assert
        //expected result == result
        assertEquals(expectedResult,result);
    }

    @Test
    void potentsTest(){
        //ASSERT der INPUT Variablen
        double a = 2;
        double power = 2;

        double expectedResult = 4;
        //ACT

        double result = calc.potent(a,power);
        //assert
        //expected result == result
        assertEquals(expectedResult,result);
    }
    @Test
    void rootTest(){
        //ASSERT der INPUT Variablen
        double a = 16;

        double expectedResult = 4;
        //ACT

        double result = calc.squareRoot(a);
        //assert
        //expected result == result
        assertEquals(expectedResult,result);
    }

    @Test
    void absolutTest(){
        //ASSERT der INPUT Variablen
        double a = -2;

        double expectedResult = 2;
        //ACT

        double result = calc.absolut(a);
        //assert
        //expected result == result
        assertEquals(expectedResult,result);
    }

}
