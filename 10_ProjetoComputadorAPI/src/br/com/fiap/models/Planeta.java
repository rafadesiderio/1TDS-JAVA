package br.com.fiap.models;

public class Planeta {
	
	private String name;
	private String diameter;
	private String climate;	

	public Planeta() {
		super();
	}
	
	public Planeta(String name, String diameter, String climate) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.climate = climate;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	@Override
	public String toString() {
		return "Planeta [name=" + name + ", diameter=" + diameter + ", climate=" + climate + "]";
	}

}
