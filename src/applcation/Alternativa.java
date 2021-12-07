package applcation;

public class Alternativa {

	private String enunciado;
	private boolean status;

	public Alternativa(String enunciado, boolean status) {
		this.enunciado = enunciado;
		this.status = status;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public boolean getStatus() {
		return status;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// craiar metodo toString

	public String toString() {
		return this.enunciado + "\n";

	}
}
