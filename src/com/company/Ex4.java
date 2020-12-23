package com.company;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
        /*
        問. ３つの整数を標準入力で受け取り、"どれか一つ" が0より大きかったらtrue
            どれも0より小さければfalse となるようなプログラムを書いてください。

         例. 入力: 1 0 -1
             出力: true
             入力: 1 1 1
             出力: false
         */
        System.out.println("３つの数字を入力してください 数字はそれぞれスペースで区切ること。");
        Scanner scanner = new Scanner(System.in);

        // Let's coding!!
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean result = judg(num1,num2,num3);

        scanner.close();
        System.out.println(result);
    }

	public static boolean judg(int num1, int num2, int num3) {
		if (num1 > 0 && num2 > 0) {//条件１
			return false;
		} else if (num1 > 0 && num3 > 0) {//条件２
			return false;
		} else if (num2 > 0 && num3 > 0) {//条件３
			return false;
		} else if (num1 <= 0 && num2 <= 0 && num3 <= 0) {//条件４
			return false;
		} else {
			return true;
		}
	}
}