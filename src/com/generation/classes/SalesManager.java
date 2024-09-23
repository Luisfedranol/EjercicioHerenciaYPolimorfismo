package com.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	HashMap<String, SalesRep> salesTeam;

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade,
			HashMap<String, SalesRep> salesTeam) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = salesTeam;
	}//constructor

	public HashMap<String, SalesRep> getSalesTeam() {
		return salesTeam;
	}

	public void setSalesTeam(HashMap<String, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}

	@Override
	public double calculateComission() {
		double totalSales = 0;
		for (SalesRep rep : salesTeam.values()) {
			totalSales += rep.salesMade;
		}
		return (super.calculateComission())+(0.03 * totalSales);
	}//calculateComission

}//class SalesManager
