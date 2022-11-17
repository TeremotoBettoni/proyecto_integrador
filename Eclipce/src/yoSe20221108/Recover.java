package yoSe20221108;

public class Recover {
	private String code;
	private String is_used;
	public Recover() {
		super();
	}
	public Recover(String code, String is_used) {
		super();
		this.code = code;
		this.is_used = is_used;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIs_used() {
		return is_used;
	}
	public void setIs_used(String is_used) {
		this.is_used = is_used;
	}
	@Override
	public String toString() {
		return "Recover [code=" + code + ", is_used=" + is_used + "]";
	}
	
	
}
