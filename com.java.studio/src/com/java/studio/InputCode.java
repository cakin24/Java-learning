package com.java.studio;

import java.util.Scanner;

public class InputCode {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������֤�ţ�");
		String line = scanner.nextLine();
		System.out.println("ԭ��������֤������" + line.length() + "λ���ְ�");
	}
}
