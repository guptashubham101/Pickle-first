package com.spring.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Email;


@Entity
public class ChefPersonal {

	@Id
	@GeneratedValue
	private Integer chefserid;
	private String cheffname;
	private String cheflname;
	private boolean enabled;
	@Email
	@Column(unique=true)
	private String chefemail;
	private String chefpwd;
	private String chefcontact;

	@ManyToMany
	private List<UserPersonal> userpersonals;
	
	@OneToOne
	private ChefAddress chefAddress;

	@OneToOne
	private ChefKitchen chefKitchen;
	
	@ManyToOne
	private Role crole;

	public Integer getChefserid() {
		return chefserid;
	}

	public void setChefserid(Integer chefserid) {
		this.chefserid = chefserid;
	}

	public String getCheffname() {
		return cheffname;
	}

	public void setCheffname(String cheffname) {
		this.cheffname = cheffname;
	}

	public String getCheflname() {
		return cheflname;
	}

	public void setCheflname(String cheflname) {
		this.cheflname = cheflname;
	}

	public String getChefemail() {
		return chefemail;
	}

	public void setChefemail(String chefemail) {
		this.chefemail = chefemail;
	}

	public String getChefpwd() {
		return chefpwd;
	}

	public void setChefpwd(String chefpwd) {
		this.chefpwd = chefpwd;
	}

	public String getChefcontact() {
		return chefcontact;
	}

	public void setChefcontact(String chefcontact) {
		this.chefcontact = chefcontact;
	}

	public List<UserPersonal> getUserpersonals() {
		return userpersonals;
	}

	public void setUserpersonals(List<UserPersonal> userpersonals) {
		this.userpersonals = userpersonals;
	}

	public ChefAddress getChefAddress() {
		return chefAddress;
	}

	public void setChefAddress(ChefAddress chefAddress) {
		this.chefAddress = chefAddress;
	}

	public ChefKitchen getChefKitchen() {
		return chefKitchen;
	}

	public void setChefKitchen(ChefKitchen chefKitchen) {
		this.chefKitchen = chefKitchen;
	}

	public Role getCrole() {
		return crole;
	}

	public void setCrole(Role crole) {
		this.crole = crole;
	}

	public boolean isEnabled() {
		return enabled;
	}

	

	

	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		this.enabled = enabled;
	}
	
	
}
