package com.ab.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Set<String> stringSet = new HashSet<String>();
        List<String> arrayList = new ArrayList<String>(stringSet);
    }
}
