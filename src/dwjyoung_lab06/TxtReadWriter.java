package dwjyoung_lab06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtReadWriter {
	
	private ArrayList<Integer> sums;
	
	public TxtReadWriter(){
		
	}


	public ArrayList<Integer> txtReader(File filename) {
		
		this.sums = new ArrayList<Integer>();
		
		try {
			
			Scanner in = new Scanner(filename);
			
			while(in.hasNextLine()) {
				
				ArrayList<Integer> nums = new ArrayList<Integer>();
				String line = in.nextLine();
				int sum = 0;
				Scanner sc = new Scanner(line);
				sc.useDelimiter(",");
				
				while(sc.hasNextInt()) {
					nums.add(sc.nextInt());
				}
				
				for(int i = 0; i < nums.size(); i++) {
					sum += nums.get(i);
				    
				}//for loop close
				this.sums.add(sum);
				sc.close();
				
			}//while loop close
			
			in.close();
			
		}//try block close
		
		catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}//catch block close
		
		return this.sums;
	}//txtReader close
	
	public void txtWriter() {
		
		
		try {
			
			FileWriter fw = new FileWriter("Sums.txt");
			BufferedWriter output = new BufferedWriter(fw);
			
			for (int i = 0; i < this.sums.size(); i++) {
				String result = this.sums.get(i).toString();
				output.write(result);
				output.newLine();
			}
			
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}//class close
