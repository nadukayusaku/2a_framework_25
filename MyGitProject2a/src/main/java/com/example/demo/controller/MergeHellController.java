package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	void kadaiB() {
		//ここに課題を書く。メソッド名変えてね。
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println(num + "が出ました");
	}
}