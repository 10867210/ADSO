package RepasoJava;

import java.util.Iterator;
import java.util.List;

public class ejemplo {

	public static void main(String[] args) {
		
		int num=10;
		int suma=0;
		
		for (int i = 1; i <= num; i++) {
			suma +=i;
			System.out.println(suma + "");
	
		
	     }
       System.out.println();  	
       
       int [] array = {27,78,5,36,8};
       for (int i = 1; i < array.length; i++) {
		System.out.println(i+ "");
	}
       System.out.println();
       
       for (int i : array) {
		
	    }
       System.out.println();
       
       
       List<String> frutas = List.of("pera", "mango", "manzanas", "fresas");
       for (String i : frutas) {
		System.out.println(i+"");
	}
	}
}
