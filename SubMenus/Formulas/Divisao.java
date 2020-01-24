package SubMenus.Formulas;

import java.util.Scanner;

public class Divisao{

	public Divisao(){
		System.out.println("======= Valores para a divisão ================");

		Scanner s = new Scanner(System.in);
		int number1 = s.nextInt();
		int number2 = s.nextInt();
		this.result(number1,number2); 

	}

	public void result(Integer number1,Integer number2){
		int result = number1 / number2;
		System.out.println("A divisão de "+ number1 + " por " + number2 + " é : " + result);
	}

}