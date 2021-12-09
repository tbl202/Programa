package applcation;

public class Alternativa {

	private String resposta;
	private boolean status; // true certa

	public Alternativa(String resposta) {
		this.resposta = resposta;
		this.status = false;
	}		

	public Alternativa(String resposta, boolean status) {
		this.resposta = resposta;
		this.status = status;
	}

	public String getResposta() {
		return resposta;
	}

	public boolean getStatus() {
		return status;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String toString() {
		return this.resposta;
	}
}
