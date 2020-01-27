package SubMenus.Formulas;

import java.util.Scanner;
import java.util.Locale;

public class Adicao{

	public Adicao(){
		System.out.println("======= Valores para a soma =============== use \",\" como separador decimal");

		Scanner input= new Scanner(System.in);
		
		Double number1 = input.nextDouble();
		Double number2 = input.nextDouble();
		this.result(number1,number2); 

	}

	public void result(Double number1,Double number2){
		Double result = number1 + number2;
		System.out.println("A soma de "+ number1 + " e " + number2 + " é : " + result);
	}

}