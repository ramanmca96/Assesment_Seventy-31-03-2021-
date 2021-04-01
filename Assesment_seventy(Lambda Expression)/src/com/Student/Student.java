package com.Student;

import java.util.ArrayList;
import java.util.Collections;

class StudentInfo {
	Integer studentId;
	String studentName;
	Float studentMark;

	public StudentInfo(Integer studentId, String studentName, float  studentMark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMark = studentMark;
	}
}

public class Student {

	public static void main(String[] args) {
		ArrayList<StudentInfo> list = new ArrayList<>();

		list.add(new StudentInfo(18461, "Richard", 1111));
		list.add(new StudentInfo(18462, "WillSmith", 1010));
		list.add(new StudentInfo(18463, "Hitler", 1210));
		list.add(new StudentInfo(18464, "Scott", 1241));

		System.out.println("Sorting By The Student Name:");

		Collections.sort(list, (a, b) -> {
			return a.studentName.compareTo(b.studentName);
		});

		for (StudentInfo Info : list) {

			System.out.println("Student ID:" +Info.studentId + " " +"StudentName:" +Info.studentName + " " +" Student Mark:"  +Info.studentMark);
		}

		System.out.println(" ");
		System.out.println("Sorting By The Student ID");

		Collections.sort(list, (a, b) -> {
			return a.studentId.compareTo(b.studentId);
		});

		for (StudentInfo Info : list) {

			System.out.println("Student ID:" +Info.studentId + " " +"StudentName:" +Info.studentName + " " +" Student Mark:"  +Info.studentMark);
		}

		System.out.println(" ");
		System.out.println("Sorting By The Student Mark");

		Collections.sort(list, (a, b) -> {
			return a.studentMark.compareTo(b.studentMark);
		});

		for (StudentInfo Info : list) {

			System.out.println("Student ID:" +Info.studentId + " " +"StudentName:" +Info.studentName + " " +" Student Mark:"  +Info.studentMark);
		}
	}
}
