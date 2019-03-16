package com;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Colors {
	private JTextField idField;
	private static JTextField ppsField;
	private static JTextField surnameField;
	private static JTextField firstNameField;
	private static JTextField salaryField;
	private static JComboBox<String> genderCombo;
	private static JComboBox<String> departmentCombo;
	private static JComboBox<String> fullTimeCombo;

	static Color red = new Color(255, 150, 150);
	static Color white = Color.WHITE;
	static Color foreground = new Color(65, 65, 65);
	
	
	public static void setToWhite() {
		ppsField.setBackground(UIManager.getColor("TextField.background"));
		surnameField.setBackground(UIManager.getColor("TextField.background"));
		firstNameField.setBackground(UIManager.getColor("TextField.background"));
		salaryField.setBackground(UIManager.getColor("TextField.background"));
		genderCombo.setBackground(UIManager.getColor("TextField.background"));
		departmentCombo.setBackground(UIManager.getColor("TextField.background"));
		fullTimeCombo.setBackground(UIManager.getColor("TextField.background"));
	}

}
