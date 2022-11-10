package yoSe20221108;

public class TypePosteo {
	private Integer typeId;
	private String tipo;
	
	public TypePosteo() {
		super();
	}

	public TypePosteo(Integer typeId, String tipo) {
		super();
		this.typeId = typeId;
		this.tipo = tipo;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TypePosteo [typeId=" + typeId + ", tipo=" + tipo + "]";
	}
	
	

}
