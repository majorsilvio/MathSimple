package SubMenus.Formulas;

import java.util.Scanner;
import java.util.Locale;


public class Divisao{

	public Divisao(){
		System.out.println("======= Valores para a divisão ================");

		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.ENGLISH);

		Double number1 = s.nextDouble();
		Double number2 = s.nextDouble();
		this.result(number1,number2); 

	}

	public void result(Double number1,Double number2){
		Double result = number1 / number2;
		System.out.println("A divisão de "+ number1 + " por " + number2 + " é : " + result);
	}

}