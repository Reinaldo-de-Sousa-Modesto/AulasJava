package cursopacote.executavel;

//nome da classe
public class FazendoContas {
	//início do método main, não foi declarada nenhuma variável global.
	public static void main(String[] args) {
		//Declarandos as variáveis
		double nota1, nota2, nota3, nota4, soma, media;
		System.out.println("Digite as notas do aluno:");
		
		//guardando valores nas variáveis
		nota1 = 9; nota2 = 8; nota3 = 1; nota4 = 1;
		
		//calculando a soma das variáveis e depois a média
		soma = nota1 + nota2 + nota3 + nota4;
		media = soma / 4;
		
		//imprimindo os resultados, concatenando.
		System.out.println("O aluno recebeu as seguintes notas:");
		System.out.println("Primeira: " + nota1 + " Segunda: " + nota2 + " Terceira: "+ nota3 +" e Quarta: "+ nota4);
		System.out.println("O total das notas é: " + soma);
		System.out.println("A média das notas é de :"+media);
		
		/*estrutura condicional usando if e else, se maior ou igual a 7 foi aprovado senão reprovado
		if (media >= 7) {
			System.out.println("O aluno foi aprovado.");
		} else if (media >= 5 && media < 7){
			System.out.println("O aluno esta em recuperação.");
		}
		 else {
			System.out.println("O aluno foi reprovado.");
		} */
		
		// Operador ternário simples - é recomendado para micro validações
		String resultado = media >= 7 ? "Aprovado" : (media >= 5 && media < 7)? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
