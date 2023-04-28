package exercicio19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] matriz = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
		
		int x = scan.nextInt();
		
		for(int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if(j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if(i > 0) {
						System.out.println("Em cima:" + matriz[i - 1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		
		scan.close();
	}

}
