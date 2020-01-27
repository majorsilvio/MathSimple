package SubMenus;

import java.util.Scanner;
import java.util.Locale;
import SubMenus.Formulas.*;


public class CalcSimple{
	public void menu(){
		System.out.println("========================= Calculos Simples ==============================");
		System.out.println("( 1 ) Adição");
		System.out.println("( 2 ) Subtração");
		System.out.println("( 3 ) Divisão");
		System.out.println("( 4 ) Multiplicação");

		Scanner s = new Scanner(System.in);
		System.out.println("Escolha qual classe deseja ativar: ");
		int escolha = s.nextInt();
		switch(escolha){
			case 1:
			new Adicao();
			break;

			case 2:
			new Subtracao();
			break;

			case 3:
			new Divisao();
			break;

			case 4:
			new Multiplicacao();
			break;
		}
	}
	
}