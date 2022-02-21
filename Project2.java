package semes1;

import java.util.Scanner;

public class Project2{
	public static int GettingNumberOfMonths(String month) {

		int monthNumber = 0;

		if (month == null) {
			return monthNumber;
		}

		switch (month.toLowerCase()) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;		default:
			monthNumber = 0;
			break;
		}

		return monthNumber;
	}
	public static void main(String[] args) {

		String firstMonth;
		String secondMonth;
		int firstYear;
		int secondYear;
		Scanner s = new Scanner(System.in);
		System.out.println("For the first date,");
		System.out.print("Enter month: ");
		firstMonth = s.nextLine();
		System.out.print("Enter year: ");
		firstYear = s.nextInt();
		s.nextLine();
		System.out.println("\nFor the second Date");
		System.out.print("Enter month: ");
		secondMonth = s.nextLine();
		System.out.print("Enter year: ");
		secondYear = s.nextInt();

		int MonthOne = GettingNumberOfMonths(firstMonth);
		int MonthTwo  = GettingNumberOfMonths(secondMonth);
		
		int MonthDifference;
		int YearDifference;
		if(firstYear > secondYear) {
			YearDifference =  firstYear - secondYear;
			if(MonthOne >= MonthTwo){
				MonthDifference = MonthOne - MonthTwo;
			}else {
				MonthDifference = MonthTwo - MonthOne;
				YearDifference = YearDifference - 1;
			}
		}else if(secondYear > firstYear){
			YearDifference = secondYear - firstYear;
			if(MonthTwo >= MonthOne) {
				MonthDifference = MonthTwo - MonthOne;
			}else {
				MonthDifference = MonthTwo - MonthOne;
				MonthDifference = 12 - MonthDifference;
				YearDifference = YearDifference - 1;
			}
		}else {
			YearDifference = secondYear -firstYear;
			if(MonthTwo > MonthOne){
				MonthDifference = MonthOne - MonthTwo;
			}else{
				MonthDifference = MonthOne - MonthTwo;
			}
		}
		System.out.println("These dates are " + YearDifference + " years and " + MonthDifference + " months apart.");
		
		}
		static void doQuickSort(int array[], int start, int end) {
		int pivotPoint;
		pivotPoint = partition(array, start, end);
		int pivot = 0;
		doQuickSort(array, pivot+1, end);
		doQuickSort(array, start, pivot-1);
	}
		private static int partition(int[] array, int start, int end) {
			// TODO Auto-generated method stub
			return 0;
		}

}
