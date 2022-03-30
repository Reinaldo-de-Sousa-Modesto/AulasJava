package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	private String nome;
	private int idade;
	private String numeroCpf;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
	//método set e get
	//set é usado para atribuir valor e get para retornar os dados
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	//toString	@Override
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", numeroCpf=" + numeroCpf + "]";
	}
	
	//equals hastcod
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, numeroCpf);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}
	
	// metodo se maior que 70 retorna verdadeiro
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return "Aluno aprovado.";
		} else {
			return "Aluno em recuperação.";
		}
		} else {
			return "Aluno reprovado.";
		}
	}
	
	//método que retorna media do aluno
	public double getMediaNota() {
		
		double somaNotas = 0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

}