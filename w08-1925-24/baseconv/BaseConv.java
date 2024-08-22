import java.util.*;

class BaseConv {
	public static void main(String[] args) {
		// Init scanner and take input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number for conversion: ");
		int num = scan.nextInt();
		int base = 2;
		

		// Store remainders in a string
		String remList = " ";

		while ( (num/base) != 0) {
			String tempStr = String.valueOf((num % base)); 
			remList += tempStr; 
			num = num / base;
		}

		if ( (num/base) == 0) {
			String tempStr = String.valueOf(num % base);
			remList += tempStr;
		}

		// Loop to put remainders into a number
		int out = 0;
		String revList = remList.trim(); //Reverse string then trim
		System.out.println(revList);
		for (int i = revList.length() - 1; i > 0; i--) {	// REVERSE WRONG
			out = out * 10;
			int tempInt = revList.charAt(i);
			out += tempInt;
		}

		System.out.println("The number in binary is: " + out);
	}
}