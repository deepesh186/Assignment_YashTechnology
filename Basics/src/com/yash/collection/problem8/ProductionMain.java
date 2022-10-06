package com.yash.collection.problem8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductionFacility> pf=new ArrayList<ProductionFacility>();
		String itemnames1[]= {"car","Bike"};
		ProductionFacility p1=new ProductionFacility(101, "CTS", "Pune", 400, itemnames1, LocalDate.of(2022, 8, 12));
		ProductionFacility p2=new ProductionFacility(101, "CTS", "Pune", 300, itemnames1, LocalDate.of(2022, 8, 13));
		ProductionFacility p3=new ProductionFacility(101, "CTS", "Pune", 200, itemnames1, LocalDate.of(2022, 8, 14));
		
		
		ProductionFacility p4=new ProductionFacility(102, "Infosys", "Pune", 340, itemnames1, LocalDate.of(2022, 8, 12));
		ProductionFacility p5=new ProductionFacility(102, "Infosys", "Pune", 450, itemnames1, LocalDate.of(2022, 8, 13));
		ProductionFacility p6=new ProductionFacility(102, "Infosys", "Pune", 360, itemnames1, LocalDate.of(2022, 8, 14));
		pf.add(p1);
		pf.add(p2);
		pf.add(p3);
		
		pf.add(p4);
		pf.add(p5);
		pf.add(p6);
		System.out.println(pf);

	}

}
