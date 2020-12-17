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

        scanner.close();

        //falseになる条件を考える
        boolean result = true;
        if(num1 > 0 && num2 >0) {
        	result = false;
        }else if(num1 > 0 && num3 > 0) {
        	result = false;
        }else if(num2 > 0 && num3 > 0) {
        	result = false;
        }else if(num1 > 0 && num2 > 0 && num3 >0) {
        	result = false;
        }else if(num1 <= 0 && num2 <= 0 && num3 <=0) {
        	result = false;
        }else {
        	result = true;
        }

        //trueになる条件を考える
        boolean result2 = false;
        if(num1 > 0 && num2 <= 0 && num3 <= 0) {
        	result2 = true;
        }else if(num1 <= 0 && num2 > 0 && num3 <= 0) {
        	result2 = true;
        }else if(num1 <= 0 && num2 <= 0 && num3 > 0) {
        	result2 = true;
        }else {
        	result2 = false;
        }


        System.out.println(result);
        System.out.println(result2);


    }
}
