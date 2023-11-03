package com.bitlabs.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(name="uname")
private String name;
	@Column(name="uemail")
private String email;
	@OneToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	private UserProfile userpro;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email, UserProfile userpro) {
		super();
		this.name = name;
		this.email = email;
		this.userpro = userpro;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserProfile getUserpro() {
		return userpro;
	}
	public void setUserpro(UserProfile userpro) {
		this.userpro = userpro;
	}
	
}
