package br.com.fiap;

import java.time.LocalDate;
import java.util.Scanner;

public class UsaAluno {

	
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			LocalDate dataAtual = LocalDate.now();
			
//Inicio Construtores Vazios			
		//Inicio set de Nomes 		
			Aluno alunoId1 = new Aluno();
				alunoId1.setNome("Kayky Oliveira Schunck");
				alunoId1.setRM(99756);
				alunoId1.setAnoNascimento(LocalDate.of(2004, 9, 10));

		
				Aluno alunoId2= new Aluno();
					alunoId2.setNome("Guilherme Alves");
					alunoId2.setRM(99755);
					alunoId2.setAnoNascimento(LocalDate.of(2004, 9, 20));
        
				
			
//Fim Construtores Vazios
//Inicio Construtores com Parâmetros		
			System.out.println("- Bem Vindo a Registro de Alunos Fiap, somente mais duas Vagas restantes!");
			System.out.println("- Os dois objetos Aluno já foram definidos Gilbertão");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("As datas devem ser inseridas da Seguinte Forma: \n \nAno: XXXX (4 Casas decimais e Anos maiores que 1900) \nMês: X ou XX (1 até 12) \nDia: XX (1 ou 31)");
			System.out.println("------------------------------------------------------------------------------");
			
			Aluno alunoId3;
			System.out.println("Digite o Rm do Aluno 3");
			int rmAluno3 = scan.nextInt();
				scan.nextLine();
			System.out.println("Digite o Nome do Aluno 3");
			String nomeAluno3 = scan.nextLine();
			
			System.out.println("Digite seu Ano de Nascimento: ");
			 int anoAluno3 = scan.nextInt();
			System.out.println("Digite seu Mês de Nascimento: ");
			int mesAluno3 = scan.nextInt();
			System.out.println("Digite seu Dia de Nascimento: ");
			int diaAluno3 = scan.nextInt();
			
			alunoId3 = new Aluno(rmAluno3, nomeAluno3,LocalDate.of(anoAluno3, mesAluno3, diaAluno3));
			 
				
			Aluno alunoId4;
			
			System.out.println("Digite o Rm do Aluno 4");
			int rmAluno4 = scan.nextInt();
			scan.nextLine();
			System.out.println("Digite o Nome do Aluno 4");
			String nomeAluno4 = scan.nextLine();
			
			
			System.out.println("Digite seu Ano de Nascimento: ");
			 int anoAluno4 = scan.nextInt();
			System.out.println("Digite seu Mês de Nascimento: ");
			int mesAluno4 = scan.nextInt();
			System.out.println("Digite seu Dia de Nascimento: ");
			int diaAluno4 = scan.nextInt();
			
			alunoId4 = new Aluno(rmAluno4, nomeAluno4,LocalDate.of(anoAluno4, mesAluno4, diaAluno4));
			
			
		
//Fim Construtores com Parametros
			
			System.out.println("Aluno N°1");
			System.out.println("Rm: "+ alunoId1.getRM());
			System.out.println("Nome: "+ alunoId1.getNome());
			System.out.println("Idade Completa: "+ alunoId1.calculoIdade(dataAtual));
			
			System.out.println();
			
			System.out.println("Aluno N°2");
			System.out.println("Rm: "+ alunoId2.getRM());
			System.out.println("Nome: "+ alunoId2.getNome());
			System.out.println("Idade Completa: " +alunoId2.calculoIdade(dataAtual));
			
			System.out.println();
			
			System.out.println("Aluno N°3");
			System.out.println("Rm: "+ alunoId3.getRM());
			System.out.println("Nome: "+ alunoId3.getNome());
			System.out.println("Idade Completa: "+ alunoId3.calculoIdade(dataAtual));
			
			System.out.println();
			
			System.out.println("Aluno N°4");
			System.out.println("Rm: "+ alunoId4.getRM());
			System.out.println("Nome: "+ alunoId4.getNome());
			System.out.println("Idade Completa: " +alunoId4.calculoIdade(dataAtual));
				
				
				
			
				
			
			
			
			
			
			
		
			
	}

}
