package program;

import java.util.Scanner;

import pessoas.Nomes;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Nomes nomes = new Nomes();
		Nomes nomeGenero = new Nomes();
		
		System.out.println("Digite os nome separados por virgula: ");
		System.out.println("Exemplo: renata,cassiano");
		System.out.print("Nomes: ");
		nomes.setNome(sc.next());
		nomes.splitNome(nomes.getNome());
		for(String nome : nomes.getNomeSplit()) {
			System.out.println(nome);
		}
		
		System.out.println("===============================================");
		System.out.println("Digite os nomes e generos separados por virgula");
		System.out.println("Exemplo: renata-f,cassiano-m");
		System.out.print("Nomes: ");
		nomeGenero.setNome(sc.next());
		nomeGenero.splitNomeGeneros(nomeGenero.getNome());
		System.out.println(nomeGenero.getMasculino());
		System.out.println(nomeGenero.getFeminino());
	
		sc.close();
	}

}
