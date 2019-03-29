package examenRec;

import java.io.*;
import java.util.Scanner;

public class ejemplo {

	   static int pepe;

	   static{

	       pepe++;

	   }

	    static{

	    	pepe++;

	   }

	   ejemplo(){
		   pepe++;

	   }

	   ejemplo(int i){

		   pepe ++;
		   System.out.println(pepe);

	   }

	   public static void main (String[] args){

	        ejemplo e1= new ejemplo(1);

	        ejemplo e2= new ejemplo(2);

	        ejemplo e3= new ejemplo(3);

	    }

	}