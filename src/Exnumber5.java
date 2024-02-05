
public class Exnumber5 {

	public static void main(String[] args) {
	    int safety = 450;
	    
	    int thresholdA = 500;
	    int thresholdB = 400;
	    int thresholdC = 300;

	    char rating = safety >= thresholdA ? 'A' :
	                  (safety >= thresholdB ? 'B' :
	                  (safety >= thresholdC ? 'C' : 'D')); // 'D'는 기본 등급을 의미함

	    System.out.println("Safety rating: " + rating);
	}
}