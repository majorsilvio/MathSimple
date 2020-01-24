package SubMenus.Formulas;

import java.util.Scanner;

public class Multiplicacao{

	public Multiplicacao(){
		System.out.println("======= Valores para a multiplicação ================");

		Scanner s = new Scanner(System.in);
		int number1 = s.nextInt();
		int number2 = s.nextInt();
		this.result(number1,number2); 

	}

	public void result(Integer number1,Integer number2){
		Double result = number1 * number2;
		System.out.println("A Multiplicação de "+ number1 + " por " + number2 + " é : " + result);
	}

}