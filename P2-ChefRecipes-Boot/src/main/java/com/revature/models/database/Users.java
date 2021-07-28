//Author: Justin Wallace
//Date: 7/24/2021
package com.revature.models.database;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//database model for users
@Entity
@Table(name = "users")
public class Users {
	
	//primary SERIAL key column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	//column for usernames
	@Column(name = "username", nullable = false)
	private String username;
	
	//column for passwords
	@Column(name = "password", nullable = false)
	private String password;
	
	//column for first names
	@Column(name = "first_name", nullable = false)
	private String first_name;
	
	//column for lastnames
	@Column(name = "last_name", nullable = false)
	private String last_name;
	
	//for key column referencing role_id in user_roles table
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = UserRoles.class)
	@JoinColumn(name = "role_id")
	private UserRoles role_id;

	//boilerplate
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String username, String password, String first_name, String last_name, UserRoles role_id) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role_id = role_id;
	}

	public Users(String username, String password, String first_name, String last_name, UserRoles role_id) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role_id = role_id;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + ", role_id=" + role_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role_id == null) ? 0 : role_id.hashCode());
		result = prime * result + userId;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role_id == null) {
			if (other.role_id != null)
				return false;
		} else if (!role_id.equals(other.role_id))
			return false;
		if (userId != other.userId)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public UserRoles getRole_id() {
		return role_id;
	}

	public void setRole_id(UserRoles role_id) {
		this.role_id = role_id;
	}
	
	
	

	
}
