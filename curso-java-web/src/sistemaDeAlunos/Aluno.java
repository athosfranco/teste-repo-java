package sistemaDeAlunos;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {

	// Atributos
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String dataMatricula;
	private String registroGeral;
	private String numeroCpf;
	private String nomePai;
	private String nomeMae;
	private int idade;

	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	

	////////////////////////////////////////////////////////////////////////////

	// Construtor
	public Aluno(String nomePadrao, String sobrenomePadrao, String dataNascimentoPadrao, String dataMatriculaPadrao,
			String registroGeralPadrao, String numeroCpfPadrao, String nomePaiPadrao, String nomeMaePadrao,
			int idadePadrao) {
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

	// construtor vazio
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	// Método de calculo de media das notas
	public double getMediaNota() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}

		return somaNotas / disciplinas.size();

	}

	// Método pra saber se foi aprovado ou nao
	public boolean getAlunoAprovado() {
		double media = getMediaNota();
		return media >= 7.0 ? true : false;
	}
	
	//Método para listar todas as disciplinas
	public void listarDisciplinas() {
		System.out.println("----------LISTA DE DISCIPLINAS---------");
		for (Disciplina disciplina : disciplinas) {
			System.out.println("INDEX: " + disciplinas.indexOf(disciplina) + " - DISCIPLINA: " + disciplina.getDisciplina() + " - NOTA: " + disciplina.getNota());			
		}
	}

	// Métodos getters and setters
	
	public void setAllInfo(String nomePadrao, String sobrenomePadrao, String dataNascimentoPadrao, String dataMatriculaPadrao,
			String registroGeralPadrao, String numeroCpfPadrao, String nomePaiPadrao, String nomeMaePadrao,
			int idadePadrao) {
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

	// Método que imprime no console as informações do aluno
	public void getInfo() {
		System.out.println("-----------------[DADOS PESSOAIS]------------------");
		System.out.println("Nome completo: " + this.nome + " " + this.sobrenome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Data de Matrícula: " + this.dataMatricula);
		System.out.println("CPF: " + this.numeroCpf);
		System.out.println("RG: " + this.registroGeral);
		System.out.println("Nome do pai: " + this.nomePai);
		System.out.println("Nome da mãe: " + this.nomeMae);
		System.out.println("-----------------[NOTAS DO PERÍODO]-----------------");
		for (Disciplina disciplina : disciplinas) {
			System.out.println("Disciplina: " + disciplina.getDisciplina() + " - Nota: " + disciplina.getNota());

		}

		System.out.println("A média do período é: " + this.getMediaNota() + ", o aluno está "
				+ (this.getAlunoAprovado() ? "Aprovado!" : "Reprovado!"));
	}

	// .toString();

	@Override
	public int hashCode() {
		return Objects.hash(numeroCpf);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento
				+ ", dataMatricula=" + dataMatricula + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf
				+ ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", idade=" + idade;
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
