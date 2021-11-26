package classes.objetos;

public class Aluno {
	
	//Atributos

	public String nome;
	public String sobrenome;
	public String dataNascimento;
	public String dataMatricula;
	public String registroGeral;
	public String numeroCpf;
	public String nomePai;
	public String nomeMae;
	int idade;

		//Construtor
	public Aluno(String nomePadrao, String sobrenomePadrao, String dataNascimentoPadrao, String dataMatriculaPadrao, String registroGeralPadrao,
			String numeroCpfPadrao, String nomePaiPadrao, String nomeMaePadrao, int idadePadrao) {
		nome = nomePadrao;
		sobrenome = sobrenomePadrao;
		dataNascimento = dataNascimentoPadrao;
		dataMatricula = dataMatriculaPadrao;
		registroGeral = registroGeralPadrao;
		numeroCpf = numeroCpfPadrao;
		nomePai = nomePaiPadrao;
		nomeMae = nomeMaePadrao;
		idade = idadePadrao;
	}
	
	//Método que imprime no console as informações do aluno
	public void imprimirDados() {
		System.out.println("Nome completo: " + nome + " " + sobrenome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Data da Matrícula: " + dataMatricula);
		System.out.println("Registro geral (RG): " + registroGeral);
		System.out.println("Cadastro de Pessoa Física (CPF): " + numeroCpf);
		System.out.println("Nome do pai: " + nomePai);
		System.out.println("Nome da mãe: " + nomeMae);
		System.out.println("Idade: " + idade);
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

}
