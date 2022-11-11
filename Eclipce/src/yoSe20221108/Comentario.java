package yoSe20221108;

public class Comentario {
	
	private String texto;

	public Comentario() {
		super();
	}

	public Comentario(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Comentario [texto=" + texto + "]";
	}
	
}
