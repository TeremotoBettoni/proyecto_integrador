package yoSe20221108;

public class usuario {
	// Creando los atributos
	private String nombre;
	private String apellido;
	private String email;
	private String contraseña;

	// creamos los constructores
	public usuario() {
		super();
	}

	public usuario(String nombre, String apellido, String email, String contraseña) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contraseña = contraseña;
	}

	// creamos los getter an setter
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

	// Y creamos el string
	@Override
	public String toString() {
		return "usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", contraseña="
				+ contraseña + "]";
	}

}
