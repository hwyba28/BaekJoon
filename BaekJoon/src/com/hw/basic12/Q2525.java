package com.hw.basic12;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		//�ʹ� ���� return
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		int result = h*60 + m + t;
		while (result >= 24*60)
			result = result - 24*60;
		if (result == 0) {
			System.out.println("0 0");
			return;
		}
		//������ �ð��̹Ƿ� 24: 00 ��� 0:0 ��ĥ �ɸ� ��쵵 ����
		System.out.println(result/60 + " " + result%60);
	}
}
