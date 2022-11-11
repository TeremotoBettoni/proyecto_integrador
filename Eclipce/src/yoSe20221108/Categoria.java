package yoSe20221108;

public class Categoria {
	private String detalleCategoria;
	public Categoria() {
		super();
	}
	public Categoria(String detalleCategoria) {
		super();
		this.detalleCategoria = detalleCategoria;
	}
	public String getDetalleCategoria() {
		return detalleCategoria;
	}
	public void setDetalleCategoria(String detalleCategoria) {
		this.detalleCategoria = detalleCategoria;
	}
	@Override
	public String toString() {
		return "Categoria [detalleCategoria=" + detalleCategoria + "]";
	}
}
