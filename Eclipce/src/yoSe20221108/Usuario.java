package yoSe20221108;

public class Usuario {
	// Creando los atributos
	// cambiando algo
	private String nombre;
	private String apellido;
	private String email;
	private String contraseña;
	private String contraseñaconfirm;
	// creamos los constructores
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String apellido, String email, String contraseña, String contraseñaconfirm) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contraseña = contraseña;
		this.contraseñaconfirm = contraseñaconfirm;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getContraseñaconfirm() {
		return contraseñaconfirm;
	}
	public void setContraseñaconfirm(String contraseñaconfirm) {
		this.contraseñaconfirm = contraseñaconfirm;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", contraseña="
				+ contraseña + ", contraseñaconfirm=" + contraseñaconfirm + "]";
	}
	

}
