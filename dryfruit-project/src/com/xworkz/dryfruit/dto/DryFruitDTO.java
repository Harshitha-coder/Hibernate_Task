package com.xworkz.dryfruit.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dryfruit_table")
public class DryFruitDTO implements Serializable {

	@Column(name = "D_ID")
	@Id
	private int id;
	@Column(name = "D_NAME")
	private String name;
	@Column(name = "D_BRAND")
	private String brand;
	@Column(name = "D_COUNTRY")
	private String country;
	@Column(name = "D_COST")
	private double cost;
	@Column(name = "D_DB")
	private String distrubutedBy;

	public DryFruitDTO() {

	}

	public DryFruitDTO(int id, String name, String brand, String country, double cost, String distrubutedBy) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.country = country;
		this.cost = cost;
		this.distrubutedBy = distrubutedBy;
	}

	@Override
	public String toString() {
		return "DryFruitDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", country=" + country + ", cost="
				+ cost + ", distrubutedBy=" + distrubutedBy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		DryFruitDTO other = (DryFruitDTO) obj;
		if (id != other.id)
			return false;
		return true;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDistrubutedBy() {
		return distrubutedBy;
	}

	public void setDistrubutedBy(String distrubutedBy) {
		this.distrubutedBy = distrubutedBy;
	}
}
