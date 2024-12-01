package com.prolog;

import org.jpl7.Query;

public class Main {
	public static void main(String [] args){
		//System.out.println(System.getProperty("java.library.path"));
		String pl = "consult('src/mayorMenor').";
		Query prolog = new Query(pl);
		if(prolog.hasSolution()){
			pl = "mayor(5)";
			prolog = new Query(pl);
			System.out.println("5 es "+(prolog.hasSolution()?"Mayor":"Menor"));
		}
		
	}
}
