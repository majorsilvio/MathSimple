package SubMenus.Formulas;

import java.util.Scanner;

public class Adicao{

	public Adicao(){
		System.out.println("======= Valores para a soma ================");

		Scanner s = new Scanner(System.in);
		int number1 = s.nextInt();
		int number2 = s.nextInt();
		this.result(number1,number2); 

	}

	public void result(Integer number1,Integer number2){
		int result = number1 + number2;
		System.out.println("A soma de "+ number1 + " e " + number2 + " é : " + result);
	}

}