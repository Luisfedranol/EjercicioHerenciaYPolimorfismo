package com.generation;

import java.util.HashMap;

import com.generation.classes.Employee;
import com.generation.classes.SalesManager;
import com.generation.classes.SalesRep;

public class Main {

	public static void main(String[] args) {
		
        Employee employeeJohn = new Employee("John", "Doe", 1234, 30, 200, 5, 50000, 5);
        System.out.println("John's time to retirement: " + employeeJohn.timeToRetirement() + " years");
        System.out.println("John's vacation time left: " + employeeJohn.vacationTimeLeft() + " days");
        System.out.println("John's bonus: $" + employeeJohn.calculateBonus());

        
        SalesRep salesRepJane = new SalesRep("Jane", "Smith", 5678, 28, 250, 3, 60000, 4, 100000);
        System.out.println("\nJane commission: $" + salesRepJane.calculateComission());
        System.out.println("Jane's bonus: $" + salesRepJane.calculateBonus());
        
        SalesRep salesRepJohn = new SalesRep(employeeJohn.getFirstName(), employeeJohn.getLastName(), employeeJohn.getRegistration(),
        		employeeJohn.getAge(), employeeJohn.getDaysWorked(), employeeJohn.getVacationDaysTaken(),
        		employeeJohn.getSalary(), employeeJohn.getYearsWorked(), 50000);
        System.out.println("\nJohn commission: $" + salesRepJohn.calculateComission());

        
        HashMap<String, SalesRep> salesTeam = new HashMap<>();
        salesTeam.put("5678", salesRepJane);
        salesTeam.put(String.valueOf(employeeJohn.getRegistration()), salesRepJohn);

        
        SalesManager salesManager = new SalesManager("Alice", "Johnson", 9101, 35, 300, 10, 80000, 10, 15000, salesTeam);
        System.out.println("\nAlice commission: $" + salesManager.calculateComission());
        System.out.println("Alice vacation time left: " + salesManager.vacationTimeLeft() + " days");
        System.out.println("Alice time to retirement: " + salesManager.timeToRetirement() + " years");
        System.out.println("Alice bonus: $" + salesManager.calculateBonus());
        
	}

}
