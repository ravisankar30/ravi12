package org.sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task4 {
	public static void main(String[] args) {
		List li =new ArrayList();
		int d [] =new int [5];
		d[0]=50;
		d[1]=20;
		d[2]=30;
		d[3]=40;
		d[4]=10;
		
		System.out.println(Arrays.toString(d));
		int length = d.length;
		System.out.println(length);
		for(int i=0;i<length;i++) {
			
			System.out.println(d[i]);
			
			li.add(d[i]);
		}
		
		li.add(40);
		li.add(55);
		li.add(45);
		li.add(30);
		
		System.out.println(li);
	Set<Integer>si=new LinkedHashSet<Integer>();	
	si.add(25);
	si.add(56);
	si.add(32);
	
	
	si.addAll(li);
	
	System.out.println(si);
	Map<List<Integer>,Set<Integer>> ma=new LinkedHashMap<List<Integer>,Set<Integer>>();
	ma.put(li,si);
	
		System.out.println(ma);
			}
	
		
		
		
		
		
		
		
		
		
		
		
		}
	


