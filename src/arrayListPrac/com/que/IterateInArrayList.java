package arrayListPrac.com.que;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IterateInArrayList {
	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String choice;
		do {
			System.out.println("Enter a number to add");
			list.add(Integer.parseInt(bf.readLine()));
			System.out.println("Want to add another number");
			choice = bf.readLine();

		} while (choice.equalsIgnoreCase("y"));
		
		System.out.println("Iterate over list");
		for(Integer li:list) {
			System.out.println(li);
		}

	}
}
