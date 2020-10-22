package com.nttdata.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import java.util.List;

public class Hashset {
public static void main(String[] args) {
	HashSet<Employe> set=new HashSet<>();
	TreeSet<Employe> set1=new TreeSet<>(new EmployeSortbyeAge());
	set.add(new Employe("tanu","ap",12));
	set.add(new Employe("manu","ap",32));
	set.add(new Employe("anu","ap",22));
	set.add(new Employe("tanu","ap",35));
	set1.add(new Employe("tanu","ap",12));
	set1.add(new Employe("manu","ap",32));
	set1.add(new Employe("anu","ap",22));
	set1.add(new Employe("tanu","ap",35));
	System.out.println("the representation of hashset");
	for (Employe employe : set) {
		System.out.println(employe);
	}
	System.out.println("the reprresentation of treeset");
	for (Employe employe : set1) {
	System.out.println(employe);	
	}
}
}
