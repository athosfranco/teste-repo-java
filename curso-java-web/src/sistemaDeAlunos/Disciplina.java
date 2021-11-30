package sistemaDeAlunos;

import java.util.Objects;
//Servirá para todos os objetos e instancias de notas e disciplinas
public class Disciplina {
	private double nota;
	private String disciplina;

		//GETTER E SETTER
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

		//Constructor
	public Disciplina(String nomeDisciplina, double nota) {
		this.nota = nota;
		this.disciplina = nomeDisciplina;
		
	}
	
	
	//HASHCODE E EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}


	//TO STRING
	 
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	} 
	

	
	
	

}


