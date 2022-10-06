package com.yash.stream.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Items> l=new ArrayList<Items>();
        l.add(new Items(101,"deepesh",LocalDate.of(2022, 8, 12),LocalDate.of(2022, 9, 12),1200));
        l.add(new Items(102,"lokesh",LocalDate.of(2022, 8, 12),LocalDate.of(2022, 9, 12),1100));
        l.add(new Items(103,"hitesh",LocalDate.of(2022, 8, 12),LocalDate.of(2022, 9, 12),1100));
        l.add(new Items(104, "Water_Bottle", LocalDate.of(2021,5,11),null, 670));
        l.add(new Items(105, "Dress", LocalDate.of(2020,5,10),null, 900));
		System.out.println("Average price:");
        Double averagePrice1=l.stream().mapToDouble(e->e.getPrice()).average().getAsDouble();
       System.out.println(averagePrice1); 
       System.out.println("highest salary record");
       Optional<Items> emp = l.stream()
    	        .sorted(Comparator.comparingDouble(Items::getPrice).reversed()).findFirst();
      System.out.println(emp);
      
      System.out.println("lowest salary record");
      Optional<Items> emp1 = l.stream()
   	        .sorted(Comparator.comparingDouble(Items::getPrice)).findFirst();
     System.out.println(emp1);
     System.out.println("highest item with without expriy");
     Optional<Items> maxPriceWithoutExpiry=l.stream().filter(d -> d.getDate_of_expiry()==null).sorted(Comparator.comparingDouble(Items::getPrice).reversed()).findFirst();
     System.out.println(maxPriceWithoutExpiry);
     System.out.println("remove duplicate price from list");
     List<Items> modified = l.stream().collect(Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Items::getPrice)))).stream().collect(Collectors.toList());
     System.out.println(modified);
		
	}

}
