package com.company;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex4Test {
	@Test
	public void testCase1() {
		Ex4 ex4 = new Ex4();
		boolean actual = ex4.judg(1, 1, 0);
		assertEquals(false,actual);
	}
	@Test
	public void testCase2() {
		Ex4 ex4 = new Ex4();
		boolean actual = ex4.judg(1, 0, 1);
		assertEquals(false,actual);
	}
	@Test
	public void testCase3() {
		Ex4 ex4 = new Ex4();
		boolean actual = ex4.judg(0, 1, 1);
		assertEquals(false,actual);
	}
	@Test
	public void testCase4() {
		Ex4 ex4 = new Ex4();
		boolean actual = ex4.judg(0, 0, 0);
		assertEquals(false,actual);
	}

	//trueが返ってくるかテスト
	@Test
	public void testCaseTrue() {
		Ex4 ex4 = new Ex4();
		boolean actual = ex4.judg(3, 0, 0);
		assertEquals(true,actual);
	}
	@Test
	public void testCaseTrue2() {
		Ex4 ex4 = new Ex4();
		boolean actual = ex4.judg(0, 5, 0);
		assertEquals(true,actual);
	}
	@Test
	public void testCaseTrue3() {
		Ex4 ex4 = new Ex4();
		boolean actual = ex4.judg(0, 0, 13);
		assertEquals(true,actual);
	}

}
/*
 * そのほかに試したこと
 * ex4.judg(num1,num2,num3)に文字(ローマ字やひらがな)を入れるとエラーが起きてコンパイルが通らない
 * numがint型だから11桁になるとエラーがでる
 * 小数でもエラーがでる
 */
