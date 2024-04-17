package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class Aluno {

	private String Nome;
	private int Rm;
	private LocalDate dataNascimento;
	LocalDate dataAtual = LocalDate.now();
	
	
	
	
//Início Construtores	
	public Aluno() {
		
	}
	
	public Aluno( int rm, String nome, LocalDate dataNascimento) {
		setRM(rm);
		setNome(nome);
		setAnoNascimento(dataNascimento);
		
	} 
//Fim Construtores
	
	
	
//Início métodos Nome
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
		
	}
//Fim métodos Nome
	
	
//Inicios métodos Rm
	public int getRM() {
		return Rm;
	}
	public void setRM(int rm) {
		try {
			
			if(rm >= 95001 & rm <= 552999){
				this.Rm = rm;
			}
			
		}catch(Exception e) {
			throw new IllegalArgumentException("RM INVÁLIDO!");
		}
	}
//Fim métodos Rm
	
	
	
// início Ano de Nascimento
	public LocalDate getAnoNascimento() {
		
		return dataNascimento;
	}
	public void setAnoNascimento(LocalDate dataNascimento) {
		
		LocalDate dataAtual = LocalDate.now();
			
		try {
 
	        if (dataNascimento.getYear() >= 1900 && dataNascimento.isBefore(dataAtual)) {
	            this.dataNascimento =  dataNascimento;
		
	        }
		}catch(Exception e) {
			throw new IllegalArgumentException("Data de Nascimento Inválida");
		}
		
		
	}
//Fim Ano de Nascimento
	
	public String calculoIdade(LocalDate dataAtual) {
	
		Period idade = Period.between (dataNascimento, dataAtual);
			
			int ano = idade.getYears();
			int mes = idade.getMonths();
			int dias = idade.getDays();
			
			return ano + " anos, " + mes + " meses e " + dias + " dias";
		
		
	}
	
	
}
