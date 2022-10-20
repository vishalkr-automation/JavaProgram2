package CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemovingDuplicateCharactersFromString {
	
	public static void method1(){
		String str="innndnniiaaaa";
		String output="inda";
		
		char[] chr=str.toCharArray();
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		
		for(int i=0; i<chr.length; i++){
			lhs.add(chr[i]);
		}
		
		for(Character ch:lhs){
			System.out.print(ch);
		}
	}
	
	
	
	public static void method2(){
		String str="innndnniiaaaa";
		String output="inda";
		
		//char[] chr=str.toCharArray();
		char[] chr=str.toCharArray();
		
		ArrayList<Character> list=new ArrayList<Character>();
		
		for(int i=0; i<chr.length; i++){
		Collections.addAll(list, chr[i]);
		}
		
		for(Character ch:list){
			System.out.print(ch);
		}
		
		System.out.println();
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		lhs.addAll(list);
		for(Character ch:lhs){
			System.out.print(ch);
		}
	}
	
	public static void method3(){
		String str="innndnniiaaaa";
		String output="inda";
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++){
			lhs.add(str.charAt(i));
		}
		
		for(Character ch:lhs){
			System.out.print(ch);
		}
	}
	
	
	public static void main(String args[]){
		method3();
	}

}
