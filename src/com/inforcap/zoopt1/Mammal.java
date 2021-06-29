package com.inforcap.zoopt1;

public class Mammal {
	
	private Integer energyLevel = 100;
	private Integer decremEnergia = -5;
	private Integer aumentEnergia = 10;
	
	public void displayEnergy() {
		System.out.println("Total de Energía: "+energyLevel);
	}

	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}

	public Integer getDecremEnergia() {
		return decremEnergia;
	}

	public void setDecremEnergia(Integer decremEnergia) {
		this.decremEnergia = decremEnergia;
	}

	public Integer getAumentEnergia() {
		return aumentEnergia;
	}

	public void setAumentEnergia(Integer aumentEnergia) {
		this.aumentEnergia = aumentEnergia;
	}

}
