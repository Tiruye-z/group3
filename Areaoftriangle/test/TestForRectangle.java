/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import areaoftriangle.AreaOfRectangle;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class TestForRectangle {
      AreaOfRectangle areaofRectangle;
    public TestForRectangle()
    {
        
    }
     @Before
    public void setUp() {
       areaofRectangle=new AreaOfRectangle();
    }
    
  
  @Test
   
    public void TestAreaRec1()
    {
        assertEquals("succesful",28.6,areaofRectangle.areaOfRectangle(5.5,5.2),0.00);
         assertEquals("succesful",36.96,areaofRectangle.areaOfRectangle(8.4,4.4),0.00);
        assertEquals("succesful",9.5,areaofRectangle.areaOfRectangle(3.3,6.2),0.00);
        assertEquals("succesful",4.4,areaofRectangle.areaOfRectangle(2.3,2.1),0.00);
       
        
    }
    @Test
    public void TestAreaRec2()
    {
        assertEquals("succesful",25,areaofRectangle.areaOfRectangle(5,5),0);
         assertEquals("succesful",15,areaofRectangle.areaOfRectangle(3,5),0);
          assertEquals("succesful",10,areaofRectangle.areaOfRectangle(2,5),0);
           assertEquals("succesful",30,areaofRectangle.areaOfRectangle(6,5),0);
         
        
    
    
        
    }
    
    @After
    public void tearDown() {
        areaofRectangle=null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
