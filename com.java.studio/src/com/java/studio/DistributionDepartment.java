package com.java.studio;

import java.util.Scanner;

public class DistributionDepartment {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ա����������");
		String name = scan.nextLine();
		System.out.println("��������Ա����ӦƸ�ı�����ԣ�");
		String language= scan.nextLine();
		switch (language) {
		case "Java":
			System.out.println("Ա��" + name + "�����䵽Java���򿪷����š�");
			break;
		case "C#":
			System.out.println("Ա��" + "�����䵽C#��Ŀά���顣");
			break;
		case "ASP.NET":
			System.out.println("Ա��" + name + "�����䵽ASP.NET������Բ��š�");
			break;
			default:
				System.out.println("����˾����Ҫ" + language + "���Եĳ��򿪷���Ա��");
		}
		
	}

}
