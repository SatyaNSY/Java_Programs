package basics_01_09thDec;

	public class LeapYearChecker {
	    public static void main(String[] args) {
	        int year = 2025; // Replace with the year you want to check
	        boolean isLeapYear = false;

	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            isLeapYear = true;
	        }

	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }
	}
