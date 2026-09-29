package ch03;

import java.util.Scanner; // Control + Shift + O = 필요한 라이브러리 생성

public class Lab_Random {

	public static void main(String[] args) {
		Scanner User = new Scanner(System.in);
		
		System.out.print("가위(0), 바위(1), 보(2) 중 선택: ");
		int Choose = User.nextInt();
		
		int Computer = (int) (Math.random() * 3);
		System.out.println("컴퓨터의 선택: " + Computer);
		
		if (Choose == 0 && Computer == 2) {
			System.out.println("사용자 승!");
		}
		else if (Choose == 1 && Computer == 0) {
			System.out.println("사용자 승!");
		}
		else if (Choose == 2 && Computer == 1) {
			System.out.println("사용자 승!");
		}
		else if (Choose == Computer) {
			System.out.println("비겼습니다.");
		}
		else {
			System.out.println("컴퓨터 승!");
		}
	User.close();
	}
}
