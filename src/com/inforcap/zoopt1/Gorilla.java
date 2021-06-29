package com.inforcap.zoopt1;

public class Gorilla extends Mammal{	

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void throwSomething() {
		System.out.println("Lanzando cosas a la gente...");
		System.out.println("Energía "+getDecremEnergia());
		getEnergyLevel();
		setEnergyLevel(getEnergyLevel()+getDecremEnergia());
	}
	
	public void eatBananas() {
		System.out.println("Comiendo bananas...");
		System.out.println("Energía +"+getAumentEnergia());
		getEnergyLevel();
		setEnergyLevel(getEnergyLevel()+getAumentEnergia());
	}

	public void climb() {
		System.out.println("Escalando...");
		System.out.println("Energía "+getDecremEnergia()*2);
		getEnergyLevel();
		setEnergyLevel(getEnergyLevel()+getDecremEnergia()*2);
	}		
}
