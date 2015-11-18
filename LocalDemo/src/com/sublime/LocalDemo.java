package com.sublime;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LocalDemo extends JPanel {
	public LocalDemo() {
		
		final JLabel lblNewLabel = new JLabel("");
		add(lblNewLabel);
		JButton btnOk;
		
		/*JRadioButton rdbtnEng = new JRadioButton("English");
		rdbtnEng.setSelected(true);
		rdbtnEng.setBackground(Color.WHITE);
		rdbtnEng.setBounds(164, 132, 61, 23);
		getRootPane().add(rdbtnEng);
		
		JRadioButton rdbtnBng = new JRadioButton("Bangla");
		rdbtnBng.setBackground(Color.WHITE);
		rdbtnBng.setBounds(236, 132, 61, 23);
		getRootPane().add(rdbtnBng);
		setBounds(100, 100, 385, 290);
		
		final ButtonGroup language = new ButtonGroup();
		language.add(rdbtnEng);
		language.add(rdbtnBng);*/
		
		
		Locale locale = new Locale("en", "US");
		ResourceBundle rb =  ResourceBundle.getBundle("resources.content", locale);
		lblNewLabel.setText(rb.getString("message"));
		lblNewLabel.setFont(new Font("Siyam Rupali",  Font.BOLD, 14));
		CommonUtil.setLocale(locale);
		
		 btnOk = new JButton(rb.getString("title"));
		btnOk.setFont(new Font("Siyam Rupali",  Font.BOLD, 14));
		add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				
				Locale locale = new Locale("bn", "BD");
				ResourceBundle rb =  ResourceBundle.getBundle("resources.content", locale);
				lblNewLabel.setText(rb.getString("message"));
				lblNewLabel.setFont(new Font("Siyam Rupali",  Font.BOLD, 14));
				JButton btnOk = new JButton(rb.getString("title"));
				btnOk.setFont(new Font("Siyam Rupali",  Font.BOLD, 14));
				add(btnOk);
				CommonUtil.setLocale(locale);
			}
		});
	}
	

	
	public static void main(String s[]) {
		JFrame frame = new JFrame("Hello");
		LocalDemo panel = new LocalDemo();
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(panel, "Center");
		frame.setSize(panel.getPreferredSize());
		frame.setVisible(true);
	}

}
