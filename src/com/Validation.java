package com;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validation {
	
	private JTextField idField, ppsField, surnameField, firstNameField, salaryField;
	private long currentByteStart = 0;
	
	
	private boolean checkInput() {
		boolean valid = true;
		if (ppsField.isEditable() && ppsField.getText().trim().isEmpty()) {
			ppsField.setBackground(Color.red);
			valid = false;
		} 
		if (ppsField.isEditable() && correctPps(ppsField.getText().trim(), currentByteStart)) {
			ppsField.setBackground(Color.red);
			valid = false;
		} 
		if (surnameField.isEditable() && surnameField.getText().trim().isEmpty()) {
			surnameField.setBackground(Color.red);
			valid = false;
		} 
		if (firstNameField.isEditable() && firstNameField.getText().trim().isEmpty()) {
			firstNameField.setBackground(Color.red);
			valid = false;
		} 
		if (genderCombo.getSelectedIndex() == 0 && genderCombo.isEnabled()) {
			genderCombo.setBackground(Color.red);
			valid = false;
		} 
		if (departmentCombo.getSelectedIndex() == 0 && departmentCombo.isEnabled()) {
			departmentCombo.setBackground(Color.red);
			valid = false;
		} 
		try {
			Double.parseDouble(salaryField.getText());
			if (Double.parseDouble(salaryField.getText()) < 0) {
				salaryField.setBackground(Color.red);
				valid = false;
			} 
		} 
		catch (NumberFormatException num) {
			if (salaryField.isEditable()) {
				salaryField.setBackground(Color.red);
				valid = false;
			} 
		} 
		if (fullTimeCombo.getSelectedIndex() == 0 && fullTimeCombo.isEnabled()) {
			fullTimeCombo.setBackground(Color.red);
			valid = false;
		} 
			
		if (!valid)
			JOptionPane.showMessageDialog(null, "Wrong values or format! Please check!");
		if (ppsField.isEditable())
			setToWhite();

		return valid;
	}

}
