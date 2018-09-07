package com.teamsankya.calculatortest;

import com.teamsankya.calculator.Addition;
import com.teamsankya.calculator.AdditionTest;
import com.teamsankya.calculator.Divition;
import com.teamsankya.calculator.Multiplication;
import com.teamsankya.calculator.Subtraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int res1 = Addition.add(10, 20);
        System.out.println( res1 );
        long res5 = Addition.add(20, 30);
        System.out.println(res5);
        int res2 = Subtraction.sub(30, 10);
        System.out.println( res2 );
        int res3 = Multiplication.multi(20, 30);
        System.out.println(res3);
        int res4 = Divition.div(30, 10);
        System.out.println(res4);
        
        
        AdditionTest test = new AdditionTest();
        test.addTest();
        
       /* Result result = JUnitCore.runClasses(TestCases.class);
        List<Failure> failures = result.getFailures();
        for (Failure failure : failures) {
        System.out.println(failure.getMessage());
        }
        System.out.println(result.wasSuccessful());*/
    }
}
