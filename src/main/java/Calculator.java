
public class Calculator {
	
	public double addition(double a, double b){
		return a+b;
	}
	public double subtraction(double a, double b){
		return a-b;
	}
	public double multiplication(double a, double b){
		return a*b;
	}
	public double division(double a, double b){
		if(b == 0){
			System.out.println("You can't divide by 0");
		}else{
		return a/b;
		}
		return 0;
	}
}
