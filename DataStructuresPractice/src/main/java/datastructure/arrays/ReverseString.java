package main.java.datastructure.arrays;

public class ReverseString {

	static void reverseString(String str) {
		// check on input.
		if (str == null || str.length() == 0) {
			System.out.println("Provide String");
		} else {
			String outputString = "";
			char[] outarray = new char[str.length()];
			for (int i = str.length() - 1; i >= 0; i--) {
				outputString = outputString + str.charAt(i);
				outarray[(str.length() - 1) - i] = str.charAt(i);
			}
			System.out.println("Output String :" + outputString);
			System.out.println("Output of array:" + new String(outarray));

		}

	}

}
