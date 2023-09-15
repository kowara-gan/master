package sample;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		while(true) {
			System.out.print("入力をどうg：");
			// TODO 自動生成されたメソッド・スタブ
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			if(!name.matches("^[0-9a-zA-Z]+$")) {
				System.out.println("半角英数字でない");
			}else {
				System.out.println("半角英数字");
			}
		}
	}
	public static int a() {
		return 0;
	}

}
