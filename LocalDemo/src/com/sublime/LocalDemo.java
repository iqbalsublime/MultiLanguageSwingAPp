package com.sublime;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class LocalDemo extends JPanel {
	public LocalDemo() {
		
		JLabel lblNewLabel = new JLabel("");
		add(lblNewLabel);
		
		Locale local = new Locale("bn", "BD");
		ResourceBundle rb =  ResourceBundle.getBundle("resources.content", local);
		lblNewLabel.setText(rb.getString("message"));
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
