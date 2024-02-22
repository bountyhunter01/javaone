package projact;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 공룡 정보를 저장할 객체 배열
		Dinosour_parent_class[] dinos = new Dinosour_parent_class[100];
		int index = 0;

		while (true) {

			System.out.println("1.공룡정보 입력 | 2.전체정보 보기 | 3.프로그램 종료");   
            System.out.print("선택 > ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				// 정보 입력받아 객체 생성 후 배열에 저장
				System.out.print("이름, 종류, 나이, 키, 몸무게 > ");
				String info = sc.nextLine();
				String[] arr = info.split(",");
				

				Dinosour_parent_class d = new Dinosour_parent_class(arr[0], arr[1], Integer.parseInt(arr[2]),
						Integer.parseInt(arr[3]), Integer.parseInt(arr[4]));
				dinos[index++] = d;
				break;

			case 2:
				// 배열의 정보 전체 출력
				System.out.println(Arrays.toString(dinos));
				break;

			case 3:
				System.out.print("삭제할 인덱스 > ");
				int idx = sc.nextInt();

				if (idx < 0 || idx >= index) {
					System.out.println("잘못된 인덱스 입니다");
				} else {
					// 삭제 로직
					for (int i = idx; i < index - 1; i++) {
						dinos[i] = dinos[i + 1];
					}
					index--;
					System.out.println(idx + "번 인덱스 원소 삭제 완료");
				}
				break;

			default:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}