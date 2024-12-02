package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tach_mang {
	public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i < 201; i++) {
            if ((i % 7 == 0) && (i % 5 != 0)) {
                list.add(i);
            }
        }
        String b= "";
        for (int i = 0; i < list.size(); i++) {
			b += list.get(i);
			if (i < list.size() - 1) {
                b += ",";
            }
        }
			
        System.out.println(b);
    }
 
    
	}