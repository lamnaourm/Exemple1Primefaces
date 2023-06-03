package com.jasf.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonneBean {
	
	private String nom;
	private String prenom;
	private int age;
	
	public PersonneBean() {
		super();
		this.nom = "sasasa";
		this.prenom = "sasasa";
		this.age =323;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayInfo() {
		this.nom = "crjj323";
		this.prenom = "tdi3232";
		this.age =33;
		System.out.println(nom  + " " + prenom + " " + age);
	}

}
