package yoSe20221108;

public class Valoracion {
	private int megusta;

	public Valoracion() {
		super();
	}

	public Valoracion(int megusta) {
		super();
		this.megusta = megusta;
	}

	public int getMegusta() {
		return megusta;
	}

	public void setMegusta(int megusta) {
		this.megusta = megusta;
	}

	@Override
	public String toString() {
		return "valoracion [megusta=" + megusta + "]";
	}

}
