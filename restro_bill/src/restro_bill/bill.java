package restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class bill {

	private JFrame frame;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(new Color(255, 255, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro bill");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(174, 11, 299, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(33, 112, 109, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(21, 180, 142, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox t1 = new JComboBox();
		t1.setModel(new DefaultComboBoxModel(new String[] {"Select the items", "Biryani-120/-", "Mandi-360/-", "Fish fry-80/-", "Chicken lollipop-200/-", "Mutton Soup-190/-"}));
		t1.setBounds(174, 130, 154, 22);
		frame.getContentPane().add(t1);
		
		JButton c1 = new JButton("Ok");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) t1.getSelectedItem();
				String quantity=t2.getText();
				int q=Integer.parseInt(quantity);
				int bill=0;
				if(item.equals("Biryani-120/-"))
				{
					bill=q*120;
				JOptionPane.showMessageDialog(c1, "Welcome to radha restro!\nSelected Item:"+item+"\nYour Bill is:"+bill);
				}
				else if(item.equals(" Mandi-360/- "))
				{
					bill=q*360;
					JOptionPane.showMessageDialog(c1, "Welcome to radha restro!\nSelected Item:"+item+"\nYour Bill is:"+bill);
				}
				else if(item.equals("Fish fry-80/-"))
				{
					bill=q*80;
					JOptionPane.showMessageDialog(c1, "Welcome to radha restro!\nSelected Item:"+item+"\nYour Bill is:"+bill);
				}
					
				else if(item.equals(" Chicken lollipop-200/-"))
				{
					bill=q*200;
					JOptionPane.showMessageDialog(c1,"Welcome to radha restro!\nSelected Item:"+item+"\nYour Bill is:"+bill );
				}
				else if(item.equals(" Mutton Soup-190/-"))
				{
					bill=q*190;
					JOptionPane.showMessageDialog(c1, "Welcome to radha restro!\nSelected Item:"+item+"\nYour Bill is:"+bill);
				}
			}
		});
		
		c1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		c1.setForeground(new Color(0, 128, 0));
		c1.setBounds(274, 308, 147, 42);
		frame.getContentPane().add(c1);
		
		t2 = new JTextField();
		t2.setBounds(174, 196, 154, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		frame.setBounds(100, 100, 643, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
