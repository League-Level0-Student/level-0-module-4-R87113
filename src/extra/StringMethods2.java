package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
      String k = "rAnDoM";
		// 2. Print your String to the console in upper case.
		System.out.println(k.toUpperCase());
		// 3. Print your String to the console in lower case.
     System.out.println( k.toLowerCase());
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		System.out.println(k.substring(0, 3));
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		System.out.println(k.substring(3,4));
		
	}
}
