package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();

	}

	void kadaiB() {
		//ここに課題を書く。メソッド名変えてね。
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println(num + "が出ました");
	}

	void kadaiA() {
		//ここに課題を書く。メソッド名変えてね。
		for (int i = 1; i <= 10; i++) {
			System.out.println("現在" + i + "回目のループです。");
		}

	}
}