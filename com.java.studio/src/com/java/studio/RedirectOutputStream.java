package com.java.studio;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
	public static void main(String[] args) {
		PrintStream out = System.out;
		PrintStream ps = null;
		try {
			ps = new PrintStream("./log.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setOut(ps);
		int age  = 18 ;
		System.out.println("��������ɹ����壬��ʼֵΪ18");
		String sex = "Ů";
		System.out.println("�Ա�����ɹ����壬��ʼֵΪŮ");
		String info = "���Ǹ�" + sex + "���ӣ�Ӧ����" + age + "���ˡ�";
		System.out.println("������������Ϊinfo�ַ��������������ǣ�" + info);
		System.setOut(out);
		System.out.println("����������ϣ���鿴��־�ļ���");
		
	}
}
