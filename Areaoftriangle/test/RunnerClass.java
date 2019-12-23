/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
import junit.runner.*;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
public class RunnerClass {
    public static void main(String[] args)
    {
        Result rs=JUnitCore.runClasses(NewEmptyJUnitTest.class,TestForRectangle.class);
     for(Failure f:rs.getFailures())
     {
         System.out.println(f.toString());
     }
     System.out.println("succesfull");
    }
    
}
