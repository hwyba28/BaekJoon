package com.hw.basic12;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);

		
//		int a = sc.nextInt();//472
//		sc.nextLine();//����ĭ �Է� �޾ƾ� ��!//�����̽�(������), ���� �ٸ�
//		String b = sc.nextLine();
//		//String[] str = b.split("");//3 8 5
//		//System.out.println(str[0]);
//		//char int�� ���� ����ȯ�� �ƽ�Ű �ڵ�� �ٲ�
//
//		System.out.println(a*((int)(b.charAt(2)-48)));
//		System.out.println(a*((int)(b.charAt(1)-48)));
//		System.out.println(a*((int)(b.charAt(0)-48)));
//		System.out.println(a*Integer.parseInt(b));
	}
}


//String.join(s,"");
/*
 * 		Scanner sc = new Scanner(System.in);
		String[] str1 = sc.nextLine().split("");
		String[] str2 = sc.nextLine().split("");
		int tmp = 0;
		
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j<str1.length; j++) {
				System.out.print(Integer.parseInt(str2[i])*Integer.parseInt(str1[j])%10+tmp);
				tmp = Integer.parseInt(str2[i])*Integer.parseInt(str1[j])/10;
			}
			System.out.println();
		}
 */