package com.demo.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	String id;
	String number;
	String measuring_unit;
	String name;
	String Descripiton;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripiton() {
		return Descripiton;
	}

	public void setDescripiton(String descripiton) {
		Descripiton = descripiton;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMeasuring_unit() {
		return measuring_unit;
	}

	public void setMeasuring_unit(String measuring_unit) {
		this.measuring_unit = measuring_unit;
	}

	public Topic(String id, String number, String measuring_unit, String name, String descripiton) {
		super();
		this.id = id;
		this.number = number;
		this.measuring_unit = measuring_unit;
		this.name = name;
		Descripiton = descripiton;
	}

	public Topic() {
		
	}
}
