package com.yash.collection.problem7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem7 {
	static Map<Student, Double> map = new HashMap<Student, Double>();
	public Double totelMarks = 0.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno;
		String sname, classname;
		Double totalmarks;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of student:");
		int size = sc.nextInt();
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < size; i++) {

			System.out.println("enter roll no");
			rollno = sc.nextInt();
			System.out.println("enter student name ");
			sname = sc.next();
			System.out.println("enter class name ");
			classname = sc.next();
			System.out.println("enter totel marks ");
			totalmarks = sc.nextDouble();
			list.add(new Student(rollno, sname, classname, totalmarks));
		}

		Collections.sort(list, new MarksComparotor());
		Collections.reverse(list);
		System.out.println("name of top 3 student basis of marks");
		for (int i = 0; i < 3; i++) {
			System.out.println(list.get(i).sname);
		}

		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), list.get(i).totalmarks / list.size());
		}

		sortedByValue();
		System.out.println("Details of student basis on name:");
		for (Student name : map.keySet()) {
			String key = name.toString();
			Double value = map.get(name);

			System.out.println(key + " percentage" + value);
		}

	}

	private static void sortedByValue() {
		// TODO Auto-generated method stub
		Double averageMarks = 0.0;
		ArrayList<Double> arr = new ArrayList<>(map.values());
		Collections.sort(arr);
		System.out.println("Student whose marks are below 50%");

		for (Double s : arr) {
			if (s < 50) {
				getKeyByValue(s);
			}
		}
		System.out.println("Student whose marks are below 35%");

		for (Double s : arr) {
			if (s < 35) {
				getKeyByValue(s);
			}
		}
		System.out.println("name of the Student whose Average  marks are highest below:");

		for (Double s : arr) {
			averageMarks += s * map.size();
		}

		Double totelAverageMarks = averageMarks / arr.size();
		System.out.println("totel average marks" + totelAverageMarks);
		for (Double s : arr) {
			if ((s * map.size()) > totelAverageMarks)
				getKeyByValue(s);

		}
	}

	private static void getKeyByValue(Double mark) {
		for (Entry<Student, Double> entry : map.entrySet()) {
			if (entry.getValue() == mark) {
				System.out.println(entry.getKey().sname);
				break;
			}
		}

	}
}
