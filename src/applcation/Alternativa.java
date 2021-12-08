package applcation;

public class Alternativa {

	private String enunciado;
	private boolean status; // true certa

	public Alternativa(String enunciado) {
		this.enunciado = enunciado;
		this.status = false;
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

	public String toString() {
		return this.enunciado + "\n";

	}
}
