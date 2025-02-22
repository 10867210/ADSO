package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CuentaBancaria;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class JFrameBanco extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNumerodecuenta;
    ButtonGroup gb = new ButtonGroup();
    private JTextField txtSaldo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameBanco frame = new JFrameBanco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameBanco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a nuestro banco");
		lblNewLabel.setBounds(149, 11, 153, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escriba su nombre");
		lblNewLabel_1.setBounds(25, 45, 112, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(184, 42, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Escriba su apellido");
		lblNewLabel_2.setBounds(25, 82, 97, 14);
		contentPane.add(lblNewLabel_2);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(184, 79, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Escriba su numero de cuenta");
		lblNewLabel_3.setBounds(10, 120, 145, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNumerodecuenta = new JTextField();
		txtNumerodecuenta.setBounds(184, 110, 86, 20);
		contentPane.add(txtNumerodecuenta);
		txtNumerodecuenta.setColumns(10);
		
		JComboBox cbtipodecuenta = new JComboBox();
		cbtipodecuenta.setModel(new DefaultComboBoxModel(new String[] {"AHORROS", "CORRIENTE"}));
		cbtipodecuenta.setBounds(328, 153, 86, 22);
		contentPane.add(cbtipodecuenta);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo de cuenta");
		lblNewLabel_4.setBounds(328, 128, 93, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			
			
			
			
			public void mouseClicked(MouseEvent e) {
				CuentaBancaria cuenta = new CuentaBancaria(txtNombre.getText(),txtApellido.getText(),(txtNumerodecuenta.getText()));
	        List<CuentaBancaria> cuenta1 = null;
			CuentaBancaria.add(cuenta1);
	           for (CuentaBancaria cuentaBancaria : cuenta1) {
				System.out.println("Su usario es"+txtNombre.getText());
				System.out.println("Su apellido es: "+txtApellido.getText());
				System.out.println("Su numero de cuenta es de: "+txtNumerodecuenta.getText());
				
				
			}
	
			}
		});
		btnSiguiente.setBounds(318, 82, 89, 23);
		contentPane.add(btnSiguiente);
		
		JLabel lblNewLabel_5 = new JLabel("Consultar saldo");
		lblNewLabel_5.setBounds(25, 157, 80, 14);
		contentPane.add(lblNewLabel_5);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(184, 154, 86, 20);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
	}
}
