package Character;

import java.util.Scanner;
// ���̸�
public class Charmander extends Main_character {

	public int attack() {
		int damage =0;
		
		if (pp>=0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1.���� ������");
			System.out.println("2. ���� �г�");
			System.out.println("3. ȭ�� ���");
			System.out.print("���� ���� >>");
			int num = scan.nextInt();
			
			if (num==1) {
			
				damage += power+6;
			
				System.out.println("�������� -"+damage);
				System.out.println();
				return damage;
			}
			else if (num==2) {
				
				damage += power+8;
				
				System.out.println("�������� -"+damage);
				System.out.println();
				pp = pp-3;
				return damage;
			}
			else if (num==3) {
				
				damage += power+5;
				
				System.out.println("�������� -"+damage);
				System.out.println();
				pp = pp-5;
				return damage;
			}
			System.out.println("�������� -"+damage);
			System.out.println();
			return damage;
		}
		else {
			System.out.println("PP�� 0�Դϴ�");
			System.out.println();
			return damage;
		}
	}
	public void attacked(int damage ) {
		if (defense>=power) {
			hp = hp-0;
			defense = defense - damage;
		}else {
			hp= hp+defense-damage;
		}
	}
}