import SubMenus.*;

import java.util.Scanner;


public class App{

	public void menu(){
		System.out.println("=============================== MENU ====================================");
		System.out.println("( 1 ) Calculos Simples");

		Scanner s = new Scanner(System.in);
		System.out.println("Escolha qual classe deseja ativar: ");
		int escolha = s.nextInt();
		switch(escolha){
			case 1:		
			new CalcSimple().menu();
   			break;

		}
	}
	public static void main(String[] args) {
		new App().menu();
	}
}