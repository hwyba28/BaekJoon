package com.hw.basic12;

import java.util.Scanner;

public class Q1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		if (a < 0)
			return;
		int b = Integer.parseInt(str[1]);
		if (b >= 10)
			return;
		sc.close();
		//float c = a/b;
		System.out.println((double)a/b);
		//double float �Ҽ��� ���� -- > ��Ʈ ����~> 10����
		System.out.printf("%.9f",(double)a/b);//�ڵ�����ȯ
	}
}
