package application;

import java.util.Locale;
import java.util.Scanner;

import chess.ChessMatch;

/**
 * @author vlucisil
 */
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("                                  Criado por Virginia Silva !!!                                   ");
		System.out.println();		
		System.out.println("***************************************************************************************************");
		System.out.println("______________________________________ JOGO DE XADREZ _____________________________________________");
		System.out.println();
		System.out.println("***************************************************************************************************");
		System.out.printf("Nome jogador 1 : ");
		String j1 = sc.nextLine();
		System.out.printf("Nome jogador 2 : ");
		String j2 = sc.nextLine();
		System.out.println();		
		System.out.println("Sejam bem vindos ao Jogo " + j1 + " e " + j2 + ", " + "sejam hosnestos e não trapassem !!!!");
		System.out.println();
		System.out.println();
				
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
		sc.close();
	}

}
