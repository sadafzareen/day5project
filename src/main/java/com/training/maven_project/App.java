package com.training.maven_project;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	TreeMap<Integer,String>treemap=new TreeMap<Integer,String>();
    	treemap.put(4,"Monday");
    	treemap.put(3,"Tuesday");
    	treemap.put(2,"Wednesday");
    	treemap.put(1,"Thursday");
        System.out.println( "Descending map:"+treemap.descendingMap());
    }
}
