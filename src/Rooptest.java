import java.util.Scanner;

public class Rooptest {
	public static void main(String[] args) {
		int count=0; //count는 이력된 정주의 개수
		int sum=0; //sum은 합
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수는 입력하고 마지막에 -1을 이력하세요.");
		
		int n = scanner.nextInt(); //정수입력
		while(n != -1) {//-1이입력되면 while 문을 벗어남
			sum += n;
			count++;
			n = scanner.nextInt();
			}
		if(count == 0)
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는" + count + "개이며");
			System.out.println("평균은" + (double)sum/count + "입니다.");
		}
		scanner.close();
	}
}
