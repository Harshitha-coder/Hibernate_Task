package com.xworkz.bird.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bird_table")
public class BirdEntity implements Serializable{

	@Column(name="B_ID")
	@Id
	private int id;
	@Column(name="B_NAME")
	private String name;
	@Column(name="B_FAMILY")
	private String family;
	@Column(name="B_LIFESPAN")
	private int lifeSpan;
	@Column(name="B_COUNTRY")
	private String country;
	@Column(name="B_HOURSOFFLYING")
	private int hoursOfFlying;
	@Column(name="B_GENUS")
	private String genus;
	@Column(name="B_COLOR")
	private String color;
	@Column(name="B_FOOD")
	private String food;
	@Column(name="B_FEATHERS")
	private String feathers;
	
	public BirdEntity() {
		
	}

	public BirdEntity(int id, String name, String family, int lifeSpan, String country, int hoursOfFlying, String genus,
			String color, String food, String feathers) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
		this.lifeSpan = lifeSpan;
		this.country = country;
		this.hoursOfFlying = hoursOfFlying;
		this.genus = genus;
		this.color = color;
		this.food = food;
		this.feathers = feathers;
	}

	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", family=" + family + ", lifeSpan=" + lifeSpan
				+ ", country=" + country + ", hoursOfFlying=" + hoursOfFlying + ", genus=" + genus + ", color=" + color
				+ ", food=" + food + ", feathers=" + feathers + "]";
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
		BirdEntity other = (BirdEntity) obj;
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

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getHoursOfFlying() {
		return hoursOfFlying;
	}

	public void setHoursOfFlying(int hoursOfFlying) {
		this.hoursOfFlying = hoursOfFlying;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	
}
