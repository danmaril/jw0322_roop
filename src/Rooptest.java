import java.util.Scanner;

public class Rooptest {
	public static void main(String[] args) {
		int count=0; //count�� �̷µ� ������ ����
		int sum=0; //sum�� ��
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �̷��ϼ���.");
		
		int n = scanner.nextInt(); //�����Է�
		while(n != -1) {//-1���ԷµǸ� while ���� ���
			sum += n;
			count++;
			n = scanner.nextInt();
			}
		if(count == 0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.print("������ ������" + count + "���̸�");
			System.out.println("�����" + (double)sum/count + "�Դϴ�.");
		}
		scanner.close();
	}
}
