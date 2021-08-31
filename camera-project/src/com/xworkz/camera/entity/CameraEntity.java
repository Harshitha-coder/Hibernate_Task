package com.xworkz.camera.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="camera_table")
public class CameraEntity implements Serializable {

	@Column(name="C_ID")
	@Id
	private int id;
	@Column(name="C_BRAND")
	private String brand;
	@Column(name="C_MODEL")
	private String model;
	@Column(name="C_COLOR")
	private String color;
	@Column(name="C_MU")
	private String materialUsed;
	@Column(name="C_MEGAPIXEL")
	private double megaPixel;
	@Column(name="C_FRAMEPERSEC")
	private double framePerSec;
	@Column(name="C_CONNECTIVITY")
	private boolean connectivity;
	@Column(name="C_LENSTYPE")
	private String lensType;
	@Column(name="C_WEIGHT")
	private double weight;
	
	public CameraEntity() {
		
	}

	public CameraEntity(String brand, String model, String color, String materialUsed, double megaPixel,
			double framePerSec, boolean connectivity, String lensType, double weight) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.materialUsed = materialUsed;
		this.megaPixel = megaPixel;
		this.framePerSec = framePerSec;
		this.connectivity = connectivity;
		this.lensType = lensType;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "CameraEntity [id=" + id + ", brand=" + brand + ", model=" + model + ", color=" + color
				+ ", materialUsed=" + materialUsed + ", megaPixel=" + megaPixel + ", framePerSec=" + framePerSec
				+ ", connectivity=" + connectivity + ", lensType=" + lensType + ", weight=" + weight + "]";
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
		CameraEntity other = (CameraEntity) obj;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterialUsed() {
		return materialUsed;
	}

	public void setMaterialUsed(String materialUsed) {
		this.materialUsed = materialUsed;
	}

	public double getMegaPixel() {
		return megaPixel;
	}

	public void setMegaPixel(double megaPixel) {
		this.megaPixel = megaPixel;
	}

	public double getFramePerSec() {
		return framePerSec;
	}

	public void setFramePerSec(double framePerSec) {
		this.framePerSec = framePerSec;
	}

	public boolean isConnectivity() {
		return connectivity;
	}

	public void setConnectivity(boolean connectivity) {
		this.connectivity = connectivity;
	}

	public String getLensType() {
		return lensType;
	}

	public void setLensType(String lensType) {
		this.lensType = lensType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
