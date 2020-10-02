package dwjyoung_lab06;

import java.io.File;

public class TxtTester {

	public static void main(String[] args) {
		
		File filename = new File("tester.txt");
		TxtReadWriter TxtRW = new TxtReadWriter();
		TxtRW.txtReader(filename);
		TxtRW.txtWriter();

	}

}
