package loop;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
    //formula of for loop:
		//for(int i=starting value; stopping point     ;i++(endingvalue)){}
		
		
		for(int i=0;i<5;i++) {
			//System.out.println(i);
			//System.out.println("x");
			
		}
		char[] vowel= {'a','e','i','o','u'};
		System.out.println(vowel[0]);
		System.out.println(vowel[1]);
		System.out.println(vowel[2]);
		System.out.println(vowel[3]);
		System.out.println(vowel[4]);
		for (int i=0;i<5;i++) {      //when we rgt down stopping point with number like i<5 that 5 is hard quoted number.
			System.out.println(vowel[i]);
			System.out.println("hello hello hello");
			
		}

		char[] letters= {'a','e','t','t','d','v','d','l'};
		for(int i=0;i<letters.length;i++) {    //.length is for what ever comes changes on chararray letters its print the whole length
			System.out.println(letters[i]);
		}
//		System.out.println("give me some numbers");
//		Scanner userinput=new Scanner(System.in);
//		int x =userinput.nextInt();
//		
		String[] names= {"ram","sita","hanuman"};
		for(int i=1;i<names.length;i++) {
	System.out.println(names[i]);
		}
//		
//		//Given N,print out the multiplication table for the number:
//		//3,6,9,12,15,18,21,24,27,30
		int s=5;
		for (int i=5;i<=s*10;i=i+s) {
			System.out.println(i);
		}
		//to print table:
		
		for(int i=1;i<=10;i++) {
			System.out.println("5x"+i+"="+s*i);
		}
		//if we need to print whole sentence:
		String[] employees= {"ram","sita","hanuman"};
		for(int i=0;i<employees.length;i++) {
			
			System.out.println("this is my car "+employees[i]);
			
			
			//given Y,print out all the even numbers up to that given Y-starting at 0:
			
			int Y=7;
			//2,4,6
			for(int i1=2;i1<Y;i1=i1+2) {
				System.out.println(i1);
			}
			//given Y,print out backward all the way to 0:
			int Y1=10;  //10,9,8,7...
			for(int a=Y1;a>=0;a--) {
			
			System.out.println(a);
			String[] staff= {"ram","sita","smiti","priya"};
			for(int x=1;x<staff.length;x++) {
			System.out.println("this is my home "+staff[x]);
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}

}
		
}


