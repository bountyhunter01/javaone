package gpt;

public class Aiex {

	public static void main(String[] args) {
		int x=30;
		int y=24;
		
		if ((x&y)>0) {
	System.out.println("Bitwise AND of"+x+" and "+y+" is greater than 0");
		}
		if((x%2)>(y%3)) {
			System.out.println("Remainder of"+x+" divided by 2 is great than remainderof"+y+" divider by 3");
	}
if((x+y)>100) {
	x+=100;
	
	}else {
		y+=100;
	}
	System.out.println("New value of x: "+x+", New value of y:"+y);
	}
	}
