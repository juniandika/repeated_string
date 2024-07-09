package repeated_string;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		String str = scan.nextLine();
		double num = scan.nextDouble();
		scan.nextLine();
		
		String[] array_str = str.split("");
		int pivot = 0;
		int i = 0;
		int count = 0;
		while(i < num) {
			if (array_str.length <= pivot) pivot = 0;
			if (array_str[pivot].equals("a")) count++;
			pivot++;
			i++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
