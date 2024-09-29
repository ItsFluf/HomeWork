package hw1;

import java.util.*;

public class Hw1 {
    public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int cnt = 1;
		if (!cnt == 1) {
			System.out.println("This Program Will Ask You To Give It 3 Numbers,\nAnd It Will Output All The Possible Combinations of Those 3 Numbers. ");
			System.out.print("Please Enter The First Number: ");
			int FirstNum = reader.nextInt();
			System.out.print("Please Enter The Second Number: ");
			int SecondNum = reader.nextInt();
			System.out.print("Please Enter The Third Number: ");
			int ThirdNum = reader.nextInt();
			System.out.print("The Numbers You've Entered Are: " + FirstNum + ", " + SecondNum + " And " + ThirdNum + ". Are You Sure Those Are The Numbers That You Want? (y/n)");
			String Yn = reader.next() ;
			if (Yn.equals("y")) {
				System.out.println("There Are 6 Possible Combinations For The Numbers You've Entered:");
				System.out.println("The Combinations Are: \n" + "[" + FirstNum + ", " + SecondNum + ", " + ThirdNum + "]");
				System.out.println("[" + FirstNum + ", " + ThirdNum + ", " + SecondNum + "]");
				System.out.println("[" + SecondNum + ", " + FirstNum + ", " + ThirdNum + "]");
				System.out.println("[" + SecondNum + ", " + ThirdNum + ", " + FirstNum + "]");
				System.out.println("[" + ThirdNum + ", " + FirstNum + ", " + SecondNum + "]");
				System.out.println("[" + ThirdNum + ", " + SecondNum + ", " + FirstNum + "]");
				cnt = 1;
			}
		}
		
	}
}
