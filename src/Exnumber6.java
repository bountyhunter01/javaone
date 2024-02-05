
public class Exnumber6 {

    public static void main(String[] args) {
        int dino1weight = 3000; // 공룡1의 체중
        int dino2weight = 3231; // 공룡2의 체중
        int dino3weight = 3977; // 공룡3의 체중

        // 공룡의 체중에 따른 매 끼니마다 필요한 음식의 양을 계산합니다.
        double foodPerMealDino1 = calculateFood(dino1weight);
        double foodPerMealDino2 = calculateFood(dino2weight);
        double foodPerMealDino3 = calculateFood(dino3weight);
//double id [];{
//	if(dino1weigh.equals(args)) {
//		System.out.println(1);
//	} else {
//		System.out.println(2);
//	}
//}
       
        System.out.println("Dino 1 needs " + foodPerMealDino1 + "kg of food per meal."+foodPerMealDino1/2+" 이다" );
        System.out.println("Dino 2 needs " + foodPerMealDino2 + "kg of food per meal."+foodPerMealDino2/2+" 이다" );
        System.out.println("Dino 3 needs " + foodPerMealDino3 + "kg of food per meal."+foodPerMealDino3/2+" 이다" );
    }
 
    // 음식 계산을 위한 메소드
       public static double calculateFood(int weight) {
    	   return weight * 0.05; }
       }

