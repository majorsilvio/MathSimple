import SubMenus.*;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;



public class App{

	public void menu() throws IOException {
		System.out.println("=============================== MENU ====================================");
		System.out.println("( 1 ) Calculos Simples");
		System.out.println("( 2 ) Bhaskara");

		Scanner s = new Scanner(System.in);

		System.out.println("Escolha qual classe deseja ativar: ");
		int escolha = s.nextInt();
		switch(escolha){
			case 1:		
			new CalcSimple().menu();
   			break;
			case 2:
			new Bhaskara();


		}
	}
	public static void main(String[] args) throws IOException {
		new App().menu();
	}
}