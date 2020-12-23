package com.company;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex4Test {

	@Test
	public void testEx4() {
		Ex4 ex4 = new Ex4();
		boolean actual = ex4.judg(1000000000, -999999999, -999999999);
		boolean expect = false;
		boolean expect2 = true;
		assertEquals(expect2,actual);
	}

}
/*
 * 条件１　[1,1,0] 期待値 false テストの結果 false
 * 条件２　[1,0,1] 期待値 false テストの結果 false
 * 条件３　[0,1,1] 期待値 false テストの結果 false
 * 条件４　[0,0,0] 期待値 false テストの結果 false
 * 全角数字でやっても一応エラーは起きずに期待通りの動きをする
 * ex4.judg(num1,num2,num3)に文字を入れるとエラーが起きてコンパイルが通らない
 * numがint型だから11桁になるとエラーがでるs
 */
