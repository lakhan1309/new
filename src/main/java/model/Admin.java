package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "admin")
public class Admin implements Serializable {

	/**
	 * 
	 */
	public Admin() {
	}

	private static final long serialVersionUID = 1L;
	@Column(name = "username")
	@Id
	private String username;

	@Column(name = "password")
	
	private String password;

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
