package objeto04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Elevador elev = new Elevador(8, 15);
		
		elev.entrar();
		System.out.println("Quantidade atual: " + elev.getPessoasNoElevador());
		elev.subir();
		System.out.println("Andar atual: " + elev.getAndarAtual());
		
		scan.close();
	}

}
