package classes.objetos;

public class Aluno {
	
	//Atributos

	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String dataMatricula;
	private String registroGeral;
	private String numeroCpf;
	private String nomePai;
	private String nomeMae;
	private int idade;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

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
	
	//Método de calculo de media das notas
	public double getMediaNota() {
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
		
	}
	
	//Método pra saber se foi aprovado ou nao
	public String resultado() {
		double media = getMediaNota();
		return media >= 7.0 ? "APROVADO" : "REPROVADO";
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	
	
	

}
