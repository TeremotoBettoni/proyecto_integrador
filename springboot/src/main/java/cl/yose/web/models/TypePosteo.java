package cl.yose.web.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
<<<<<<< HEAD
=======
import javax.validation.constraints.NotNull;
>>>>>>> IvanZ

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "typeposteos")
public class TypePosteo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdTipo;
	
<<<<<<< HEAD
=======
	
	private String tipo;
	
>>>>>>> IvanZ
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;

	public TypePosteo() {
		super();
	}

	public TypePosteo(Long idTipo, Date createdAt, Date updatedAt) {
		super();
		IdTipo = idTipo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(Long idTipo) {
		IdTipo = idTipo;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
<<<<<<< HEAD
	}	
	
=======
	}
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

>>>>>>> IvanZ
	// atributos de control
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
		}
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
		}
	
}
