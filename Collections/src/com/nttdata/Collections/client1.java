package com.nttdata.Collections;
import java.util.*;

public class client1 {

public static void main(String[] args) {
	List<Employe> list=new ArrayList<>();
	list.add(new Employe("tanu","ap",12));
	list.add(new Employe("manu","ap",32));
	list.add(new Employe("anu","ap",22));
	list.add(new Employe("tanu","ap",35));
	Collections.sort(list,new EmployeSortbyeAge());
	System.out.println("the sorted age list is");
	ListIterator<Employe> itr=list.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
