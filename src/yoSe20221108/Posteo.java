package yoSe20221108;

public class Posteo {
	private Integer postId;
	private String titulo;
	private String texto;
	private String url;
	
	public Posteo() {
		super();
	}

	public Posteo(Integer postId, String titulo, String texto, String url) {
		super();
		this.postId = postId;
		this.titulo = titulo;
		this.texto = texto;
		this.url = url;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Posteo [postId=" + postId + ", titulo=" + titulo + ", texto=" + texto + ", url=" + url + "]";
	}
	
	
	
	
	
}
