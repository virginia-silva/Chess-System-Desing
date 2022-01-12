/**
 * 
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Position;

/**
 * @author vlucisil
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("                                  Criado por Virginia Silva !!!                                   ");
		System.out.println();		
		System.out.println("***************************************************************************************************");
		System.out.println("______________________________________ JOGO DE XADREZ _____________________________________________");
		System.out.println();
		System.out.println("***************************************************************************************************");
		System.out.printf("Nome Competidor 1 : ");
		String c1 = sc.nextLine();
		System.out.printf("Nome Competidor 2 : ");
		String c2 = sc.nextLine();
		System.out.println();		
		System.out.println("Sejam bem vindos ao Jogo " + c1 + " e " + c2 + ", " + "sejam hosnestos e não trapassem !!!!");
		
		sc.close();
	}

}
