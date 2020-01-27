package SubMenus.Formulas;

import java.util.Scanner;
import java.util.Locale;


public class Subtracao{

	public Subtracao(){
		System.out.println("======= Valores para a subtração ================");

		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.ENGLISH);

		Double number1 = s.nextDouble();
		Double number2 = s.nextDouble();
		this.result(number1,number2);  

	}

	public void result(Double number1,Double number2){
		Double result = number1 - number2;
		System.out.println("A Subtração em "+ number1 + " de " + number2 + " é : " + result);
	}

}