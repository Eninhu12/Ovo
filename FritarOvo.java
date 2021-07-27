package br.com.enio.beloprojeto;

import java.util.Scanner;

public class FritarOvo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o tamanho do ovo : ");
		Scanner ler = new Scanner(System.in);
		String tamanho = ler.next();
		Integer t = Integer.valueOf(tamanho);
		Ovo ovo = new Ovo(t);
		ovo.quebrar();
		System.out.println("Digite o quanto quer fritar o ovo :");
		String qFrita = "1";
		while(!qFrita.equals("0")) {
			qFrita = ler.next();
			Integer frita=Integer.valueOf(qFrita);
			for(int i=0; i<frita;i++) {
				ovo.fritar();
			}
			System.out.println(ovo.getStatus());
		}
		System.out.println("Obrigado por fritar o seu Ovo!!!!!");
	}

}
