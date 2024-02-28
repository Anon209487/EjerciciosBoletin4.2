/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practicas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author fiero
 */
public class act1 {
 
	public static void main(String[] args) {
   int n=4;
   int y=0;
   String cadena ="tu puta madre me cago en todo";
   int n2=cadena.length();
   int longitud=(n2/4)+1;
   String ccadenas[] = new String [longitud]; 
 
        for (int i = 0; i < longitud; i++) {
        	  ccadenas[i]=cadena.substring(y,n);  
y=y+4;
n=n+4;  
if (n>cadena.length()) {
	n=cadena.length();
}
		}
               
         
System.out.print(Arrays.toString(ccadenas)+n2+longitud);
   
}
}