import static org.junit.Assert.*;
import org.junit.*;

public class ProjectTeststuff {
		
		Calculator calc = new Calculator();
		
		   @Test
		   public void add() {
		    assertEquals("Unexepected error addition:", 20.0, calc.addition(10.0,10.0),0.0d);
		   }
		   @Test
		   public void add1() {
		    assertEquals("Unexepected error addition:", 0, calc.addition(0.0,0.0),0.0d);
		   }
		   @Test
		   public void add2() {
		    assertEquals("Unexepected error addition:", 10.0, calc.addition(-10.0,20.0),0.0d);
		   }
		   
		   @Test
		   public void subt(){
			   assertEquals("Unexpected error subtraction:", 10.0, calc.subtraction(10.0,0.0),0.0d);
		   }
		   @Test
		   public void subt1(){
			   assertEquals("Unexpected error subtraction:", 20.0, calc.subtraction(10.0,-10.0),0.0d);
		   }
		   @Test
		   public void subt2(){
			   assertEquals("Unexpected error subtraction:", -10.0, calc.subtraction(10.0,20.0),0.0d);
		   }
		   
		   @Test
		   public void multi(){
			   assertEquals("Unexpected error subtraction:", 10.0, calc.multiplication(5.0,2.0),0.0d);
		   }
		   @Test
		   public void multi1(){
			   assertEquals("Unexpected error subtraction:", 0, calc.multiplication(0.0,2.0),0.0d);
		   }
		   @Test
		   public void multi2(){
			   assertEquals("Unexpected error subtraction:", 56.0, calc.multiplication(8.0,7.0),0.0d);
		   }
		   
		   @Test
		   public void divi(){
			   assertEquals("Unexpected error subtraction:", 2.5, calc.division(5.0,2.0),0.0d);
		   }
		   @Test
		   public void divi2(){
			   assertEquals("Unexpected error subtraction:", 4.0, calc.division(20.0,5.0),0.0d);
		   }
		   @Test
		   public void divi3(){
			   assertEquals("Unexpected error subtraction:", 0.5, calc.division(5.0,10.0),0.0d);
		   }
		   @Test
		   public void divi4(){
			   assertEquals("Unexpected error subtraction:", 0.0, calc.division(5.0,0.0),0.0d);
		   }
	
		}