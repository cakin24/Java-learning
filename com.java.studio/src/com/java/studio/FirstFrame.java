package com.java.studio;

import java.awt.Color;
import java.awt.Frame;
import java.awt.HeadlessException;

@SuppressWarnings("serial")
public class FirstFrame extends Frame{
	public FirstFrame()throws HeadlessException{
		super();
	}
	public FirstFrame(String title) {
		super(title);
	}
	public static void main(String[] args) {
		FirstFrame demo = new FirstFrame("�ҵĵ�һ��java�������");
		demo.setBackground(Color.BLUE);
		demo.setSize(300,200);
		demo.setVisible(true);
	}
}
