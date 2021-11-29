package classes.objetos;

import java.util.Objects;

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
	private String disciplina1; 
	
	private double nota2;
	private String disciplina2;
	
	
	private double nota3;
	private String disciplina3;
	
	private double nota4;
	private String disciplina4;
	////////////////////////////////////////////////////////////////////////////
	
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
	
	//construtor vazio	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	//Método de calculo de media das notas
	public double getMediaNota() {
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
		
	}
	
	//Método pra saber se foi aprovado ou nao
	public boolean getAlunoAprovado() {
		double media = getMediaNota();
		return media >= 7.0 ? true : false;
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
	
	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	
	
	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}


	
	public String getDisciplina2() {
		return disciplina2;
	}


	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	
	public double getNota3() {
		return nota3;
	}


	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public String getDisciplina3() {
		return disciplina3;
	}


	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}


	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public String getDisciplina4() {
		return disciplina4;
	}

	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}

	
	
	
	//Método que imprime no console as informações do aluno
	public void getInfo() {
		System.out.println("---------------[DADOS PESSOAIS]----------------");
		System.out.println("Nome completo: " + this.nome + " " + this.sobrenome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Data de Matrícula: " + this.dataMatricula);
		System.out.println("CPF: " + this.numeroCpf);
		System.out.println("RG: " + this.registroGeral);
		System.out.println("Nome do pai: " + this.nomePai);
		System.out.println("Nome da mãe: " + this.nomeMae);
		System.out.println("---------------[NOTAS DO PERÍODO]----------------");
		System.out.println("Nota #1: " + this.nota1);
		System.out.println("Nota #2: " + this.nota2);
		System.out.println("Nota #3: " + this.nota3);
		System.out.println("Nota #4: " + this.nota4);
		System.out.println("A média do período é: "+ this.getMediaNota() + ", o aluno está " + (this.getAlunoAprovado() ? "Aprovado!" : "Reprovado!"));
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCpf);
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
		return Objects.equals(numeroCpf, other.numeroCpf);
	}


	

	
}
