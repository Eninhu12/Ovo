package br.com.enio.beloprojeto;

import java.util.Scanner;

public class FritarOvo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o tamanho do ovo : ");
		Ovo ovo = new Ovo(null);
		ovo.getTamanho();
		System.out.println("Digite o quanto quer fritar o ovo :");
		Scanner ler = new Scanner(System.in);
		String qFrita = ler.next();
		Integer frita=Integer.valueOf(qFrita);
			for(int i=0; i<frita;i++) {
				ovo.fritar();
			}
			ovo.getStatus();
	}

}
