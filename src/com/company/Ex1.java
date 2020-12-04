package com.company;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String str = scan.nextLine();
        //TODO 問1. 標準出力に Hello World と出力してください。
    	System.out.println(str);


        //TODO 問2. 変数 str に 文字列"Hello world"を代入し、標準出力で、Hello のみを出力してください。
    	String substr = str.substring(0,4);
    	System.out.println(substr);

        //TODO 問3. 以下の浮動小数点型の変数PIを、整数型にして標準出力に出力してください。
        double PI = 3.14;
        int iPI =(int)PI;
        System.out.println(iPI);


        //TODO 問4. 以下の配列を、for文を使って、偶数の要素のみ標準出力で出力してください。
        String[] sweets = {"Anko", "Banana", "Cupcake", "Donut", "Eclair", "Froyo"};
        for(int i = 0; i < sweets.length; i++) {
        	if(i % 2 == 0) {
        		System.out.println(sweets[i]);
        	}
        }

        //お片づけ
        scan.close();
    }
}
