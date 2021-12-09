package applcation;

public class Alternativa {

	// ALTERNATIVA TRUE É A RESPOSTA CORRETA
	private String resposta;
	private boolean status;

	// CONSTRUC PRA ALTERNATIVA FALSA
	public Alternativa(String resposta) {
		this.resposta = resposta;
		this.status = false;
	}

	//CONSTRUC PRA ALTERNATIVA TRUE
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
