package yoSe20221108;

public class valoracion {
	private int megusta;

	public valoracion() {
		super();
	}

	public valoracion(int megusta) {
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
