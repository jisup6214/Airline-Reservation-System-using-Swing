package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travelling {

	private JFrame frame;
	private JTextField textTax;
	private JTextField textSubTotal;
	private JTextField textTotal;
	private JTextField textClass;
	private JTextField textTicket;
	private JTextField textAdult;
	private JTextField textChild;
	private JTextField textFrom;
	private JTextField textTo;
	private JTextField textDate;
	private JTextField textTime;
	private JTextField textTicketNo;
	private JTextField textPrice;
	private JTextField textRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
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
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(61, 21, 1114, 101);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Airline Reservation System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(308, 6, 549, 88);
		panel.add(lblNewLabel);
		
		JLabel lblTicketType = new JLabel("Ticket Type");
		lblTicketType.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblTicketType.setBounds(174, 120, 182, 55);
		frame.getContentPane().add(lblTicketType);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnEconomy.setBounds(90, 197, 118, 30);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnBusiness = new JRadioButton("Business");
		rdbtnBusiness.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnBusiness.setBounds(90, 262, 118, 30);
		frame.getContentPane().add(rdbtnBusiness);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnFirstClass.setBounds(90, 323, 131, 30);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnSingleTicket.setBounds(215, 197, 155, 30);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnReturnTicket.setBounds(215, 262, 160, 30);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnAdult.setBounds(384, 197, 84, 30);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnChild.setBounds(384, 262, 83, 30);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox cmbDestination = new JComboBox();
		cmbDestination.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Chicago", "New_York", "Los_Angeles", "Austin"}));
		cmbDestination.setBounds(232, 323, 165, 27);
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(69, 173, 429, 12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(69, 370, 429, 12);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTax.setBounds(100, 399, 61, 16);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblSubtotal.setBounds(100, 448, 89, 23);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTotal.setBounds(100, 506, 61, 21);
		frame.getContentPane().add(lblTotal);
		
		textTax = new JTextField();
		textTax.setBounds(288, 389, 130, 42);
		frame.getContentPane().add(textTax);
		textTax.setColumns(10);
		
		textSubTotal = new JTextField();
		textSubTotal.setBounds(288, 439, 130, 46);
		frame.getContentPane().add(textSubTotal);
		textSubTotal.setColumns(10);
		
		textTotal = new JTextField();
		textTotal.setBounds(288, 499, 130, 40);
		frame.getContentPane().add(textTotal);
		textTotal.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(69, 558, 429, 12);
		frame.getContentPane().add(separator_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double tax = 0.07;
				double Chicago = 169.00;
				double New_York = 168.00;
				double Los_Angeles = 279.00;
				double Austin = 177.00;
				double totalCost;
				double business = 1.50;
				double fclass = 3.00;
				double child = -50;
				
				// CHICAGO
				if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				// Business Class
				else if((rdbtnBusiness.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago * business);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago * business + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago * business + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago * business + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago * business);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago * business + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago * business + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago * business + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				// First Class
				else if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago * fclass);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago * fclass + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago * fclass + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago * fclass + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago * fclass);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago * fclass + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Chicago"))
					{
						totalCost = (tax * Chicago);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Chicago * fclass + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Chicago * fclass + child+ totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				
				// NEW YORK
				else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				// Business Class
				else if((rdbtnBusiness.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York * business);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York * business + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York * business + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York * business + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York * business);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York * business + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York * business + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York * business + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				// First Class
				else if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York * fclass);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York * fclass + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York * fclass + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York * fclass + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York * fclass);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York * fclass + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("New_York"))
					{
						totalCost = (tax * New_York);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",New_York * fclass + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", New_York * fclass + child+ totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}

				// LOS ANGELES
				else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				// Business Class
				else if((rdbtnBusiness.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles * business);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles * business + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles * business + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles * business + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles * business);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles * business + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles * business + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles * business + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				// First Class
				else if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles * fclass);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles * fclass + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles * fclass + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles * fclass + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles * fclass);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles * fclass + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Los_Angeles"))
					{
						totalCost = (tax * Los_Angeles);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Los_Angeles * fclass + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Los_Angeles * fclass + child+ totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}

				// AUSTIN
				else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnEconomy.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Economy");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				// Business Class
				else if((rdbtnBusiness.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin * business);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin * business + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin * business + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin * business + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin * business);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin * business + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnBusiness.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin * business + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin * business + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("Business");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				
				// First Class
				else if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin * fclass);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin * fclass + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin * fclass + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin * fclass + child + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin * fclass);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin * fclass + totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("ONE");
						textChild.setText("");
				}
				else if((rdbtnFirstClass.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Austin"))
					{
						totalCost = (tax * Austin);
						String sTax = String.format("$%.2f",totalCost);
						textTax.setText(sTax);
						String SubTotal = String.format("$%.2f",Austin * fclass + child);
						textSubTotal.setText(SubTotal);
						String Total = String.format("$%.2f", Austin * fclass + child+ totalCost);
						textTotal.setText(Total);
						textPrice.setText(Total);
						textClass.setText("FirstClass");
						textTicket.setText("ONE WAY");
						textAdult.setText("");
						textChild.setText("ONE");
				}
				}
		});
		btnTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnTotal.setToolTipText("Total Cost of Ticket");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//=====================Time=====================
					Calendar timer = Calendar.getInstance();
					timer.getTime();
					SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
					textTime.setText(tTime.format(timer.getTime()));
					
				//=====================Date=====================
					SimpleDateFormat tDate = new SimpleDateFormat("dd:MMM:yyyy");
					textDate.setText(tDate.format(timer.getTime()));
					
					textFrom.setText("Atlanta *");
					textTo.setText((String) cmbDestination.getSelectedItem()+ " *");
				
				//=====================Random Number Generator=====================
					int num1;
					String q1 = "";
					num1 = 1325 + (int)(Math.random()*4238);
					q1 += num1 + 1325;
					textTicketNo.setText(q1);
					
				//=================================================================
					textRoute.setText("ANY");

			}
		});
		btnTotal.setBounds(100, 582, 93, 33);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTax.setText(null);
				textSubTotal.setText(null);
				textTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnBusiness.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				textFrom.setText(null);
				textTo.setText(null);
				textDate.setText(null);
				textTime.setText(null);
				textClass.setText(null);
				textTicket.setText(null);
				textAdult.setText(null);
				textChild.setText(null);
				textTicketNo.setText(null);
				textPrice.setText(null);
				textRoute.setText(null);
				
			}
		});
		btnReset.setBounds(215, 582, 96, 33);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Ticketing Systems", 
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnExit.setBounds(329, 582, 80, 33);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(497, 120, 12, 520);
		frame.getContentPane().add(separator_3);
		
		JLabel lblSubtotal_1 = new JLabel("Class");
		lblSubtotal_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblSubtotal_1.setBounds(568, 150, 51, 25);
		frame.getContentPane().add(lblSubtotal_1);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTicket.setBounds(738, 150, 59, 25);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblAdult.setBounds(904, 150, 52, 25);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblTicket_1 = new JLabel("Child");
		lblTicket_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTicket_1.setBounds(1061, 150, 51, 25);
		frame.getContentPane().add(lblTicket_1);
		
		textClass = new JTextField();
		textClass.setColumns(10);
		textClass.setBounds(537, 214, 130, 36);
		frame.getContentPane().add(textClass);
		
		textTicket = new JTextField();
		textTicket.setColumns(10);
		textTicket.setBounds(707, 214, 130, 36);
		frame.getContentPane().add(textTicket);
		
		textAdult = new JTextField();
		textAdult.setColumns(10);
		textAdult.setBounds(868, 214, 130, 36);
		frame.getContentPane().add(textAdult);
		
		textChild = new JTextField();
		textChild.setColumns(10);
		textChild.setBounds(1028, 214, 130, 36);
		frame.getContentPane().add(textChild);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblFrom.setBounds(536, 326, 50, 25);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTo.setBounds(538, 399, 25, 25);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDate.setBounds(537, 475, 44, 25);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTime.setBounds(537, 558, 49, 25);
		frame.getContentPane().add(lblTime);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(505, 190, 656, 12);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(505, 262, 656, 12);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(846, 271, 12, 369);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(1163, 120, 12, 520);
		frame.getContentPane().add(separator_7);
		
		textFrom = new JTextField();
		textFrom.setColumns(10);
		textFrom.setBounds(656, 317, 130, 42);
		frame.getContentPane().add(textFrom);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTicketNo.setBounds(945, 357, 101, 16);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPrice.setBounds(945, 441, 53, 16);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblRoute.setBounds(945, 523, 61, 16);
		frame.getContentPane().add(lblRoute);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(71, 634, 1098, 12);
		frame.getContentPane().add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(61, 120, 12, 520);
		frame.getContentPane().add(separator_9);
		
		textTo = new JTextField();
		textTo.setColumns(10);
		textTo.setBounds(656, 389, 130, 42);
		frame.getContentPane().add(textTo);
		
		textDate = new JTextField();
		textDate.setColumns(10);
		textDate.setBounds(656, 469, 130, 42);
		frame.getContentPane().add(textDate);
		
		textTime = new JTextField();
		textTime.setColumns(10);
		textTime.setBounds(656, 548, 130, 42);
		frame.getContentPane().add(textTime);
		
		textTicketNo = new JTextField();
		textTicketNo.setColumns(10);
		textTicketNo.setBounds(945, 389, 130, 42);
		frame.getContentPane().add(textTicketNo);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(945, 469, 130, 42);
		frame.getContentPane().add(textPrice);
		
		textRoute = new JTextField();
		textRoute.setColumns(10);
		textRoute.setBounds(945, 548, 130, 42);
		frame.getContentPane().add(textRoute);
	}
}
