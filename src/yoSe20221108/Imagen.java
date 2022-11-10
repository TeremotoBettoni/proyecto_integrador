package yoSe20221108;

public class Imagen {
	
	private String ruta;

	public Imagen() {
		super();
	}

	public Imagen(String ruta) {
		super();
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Imagen [ruta=" + ruta + "]";
	}
	
}
