package week1.Day2;

public class Charactercount {

	public static void main(String[] args) {

		String str = "Testleaf";
		char ch = 'e';
		int count =0;
		char[] car = str.toCharArray();
		
		for(int i = 0; i< car.length; i++) {
			if(car[i] == ch) { 
				count++;
			
			}
		
	}
		System.out.println(count);

}

}