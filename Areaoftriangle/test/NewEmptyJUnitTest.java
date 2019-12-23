/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import areaoftriangle.Areaoftriangle;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class NewEmptyJUnitTest {
      Areaoftriangle areaoftriangle;
    public NewEmptyJUnitTest()
    {
        
    }
     @Before
    public void setUp() {
       areaoftriangle=new Areaoftriangle();
    }
    
  
  @Test
   
    public void TestAreaTri1()
    {
        assertEquals("succesful",14.3,areaoftriangle.areaOftriangle(5.5,5.2),0.00);
        assertEquals("succesful",18.48,areaoftriangle.areaOftriangle(8.4,4.4),0.00);
        assertEquals("succesful",9.5,areaoftriangle.areaOftriangle(3.3,6.2),0.00);
        assertEquals("succesful",4.4,areaoftriangle.areaOftriangle(2.3,2.1),0.00);
        
    }
    @Test
    public void TestAreaTri2()
    {
        assertEquals("succesful",12.5,areaoftriangle.areaOftriangle(5,5),0.00);
        assertEquals("succesful",16,areaoftriangle.areaOftriangle(8,4),0.000);
        assertEquals("succesful",9,areaoftriangle.areaOftriangle(3,6),0.00);
        assertEquals("succesful",30,areaoftriangle.areaOftriangle(12,5),0.0);
    }
    
    @After
    public void tearDown() {
        areaoftriangle=null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
