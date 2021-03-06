package com.revature.models.database;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.revature.models.database.associations.RecipeIngrediants;

@Entity
//@JsonIdentityInfo(
//		generator = ObjectIdGenerators.PropertyGenerator.class, 
//		property = "ingrediant_id")
@Table(name= "ingrediants")
public class Ingrediants {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ingrediant_id")
	private int ingrediant_id;
	
	@Column(name = "ingrediant")
	private String ingrediant;
	
	@Column(name = "ammount")
	private String ammount;
	
//	//list of ingrediants mapped to association table recipe_ingediants
//	@OneToMany(mappedBy = "ingrediant_id", targetEntity = RecipeIngrediants.class)
//	private List<RecipeIngrediants> recipeIngrediants = new ArrayList();
//
//	
	
	//boiler plate
	public Ingrediants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ingrediants(String ingrediant, String ammount) {
		super();
		this.ingrediant = ingrediant;
		this.ammount = ammount;
	}

	@Override
	public String toString() {
		return "Ingrediants [ingrediant_id=" + ingrediant_id + ", ingrediant=" + ingrediant + ", ammount=" + ammount
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ammount == null) ? 0 : ammount.hashCode());
		result = prime * result + ((ingrediant == null) ? 0 : ingrediant.hashCode());
		result = prime * result + ingrediant_id;
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
		Ingrediants other = (Ingrediants) obj;
		if (ammount == null) {
			if (other.ammount != null)
				return false;
		} else if (!ammount.equals(other.ammount))
			return false;
		if (ingrediant == null) {
			if (other.ingrediant != null)
				return false;
		} else if (!ingrediant.equals(other.ingrediant))
			return false;
		if (ingrediant_id != other.ingrediant_id)
			return false;
		return true;
	}

	public int getIngrediant_id() {
		return ingrediant_id;
	}

	public void setIngrediant_id(int ingrediant_id) {
		this.ingrediant_id = ingrediant_id;
	}

	public String getIngrediant() {
		return ingrediant;
	}

	public void setIngrediant(String ingrediant) {
		this.ingrediant = ingrediant;
	}

	public String getAmmount() {
		return ammount;
	}

	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}
	
	
}
