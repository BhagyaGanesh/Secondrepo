package excelprogram;

import java.io.IOException;

public class SecondClass {

	public static void main(String[] args) throws IOException {
		
		String o = FirstClass.getStringData(1, 0);
		System.out.println(o);
		//System.out.println(FirstClass.getIntegerData(1, 1));
		System.out.println(FirstClass.getFloatData(1, 1));
		

	}

}
