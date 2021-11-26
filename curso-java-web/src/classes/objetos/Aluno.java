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
	
	//Métodos getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
