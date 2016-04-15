
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println("Summan är: "+calc.addition(5, 5));
		System.out.println("Differensen är: "+calc.subtraction(5, 2));
		System.out.println("Produkten är: "+calc.multiplication(5, 5));
		System.out.println("Kvoten är: "+calc.division(50, 25));
	}

}
