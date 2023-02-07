import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class InterfazDados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField numRandom;	
	public JTextField acumulador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazDados frame = new InterfazDados();
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
	public InterfazDados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonTirar = new JButton("TIRAR");
		botonTirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Escribir codigo
				int acumuladorPoints = 0; 
				int numeroRamdom = (int)(Math.random() * 6 + 1);
				numRandom.setText(String.valueOf(numeroRamdom));
				
				for (int i = 0; i < numeroRamdom; i++) {
					acumuladorPoints += numeroRamdom;
					if(numeroRamdom == 1)
					{
						String perdiste = "Perdiste";
						numRandom.setText(numeroRamdom + " : " + perdiste);
					}
					else 
					{
						String ganaste = "Ganaste";
						numRandom.setText(numeroRamdom + " : " + ganaste);
					}
					
				}
				
				acumulador.setText(String.valueOf(acumuladorPoints));
				
			}
		});
		botonTirar.setBounds(186, 409, 89, 23);
		contentPane.add(botonTirar);
		
		JTextArea txtrTiraElDado = new JTextArea();
		txtrTiraElDado.setBackground(new Color(0, 128, 0));
		txtrTiraElDado.setFont(new Font("Consolas", Font.BOLD, 13));
		txtrTiraElDado.setEditable(false);
		txtrTiraElDado.setText("TIRA EL DADO");
		txtrTiraElDado.setBounds(142, 131, 177, 22);
		contentPane.add(txtrTiraElDado);
		
		numRandom = new JTextField();
		numRandom.setFont(new Font("Consolas", Font.BOLD, 17));
		numRandom.setBackground(new Color(255, 0, 0));
		numRandom.setEditable(false);
		numRandom.setBounds(164, 182, 127, 34);
		contentPane.add(numRandom);
		numRandom.setColumns(10);
		numRandom.toString();
		
		acumulador = new JTextField();
		acumulador.setFont(new Font("Consolas", Font.BOLD, 17));
		acumulador.setEditable(false);
		acumulador.setBounds(30, 217, 107, 34);
		contentPane.add(acumulador);
		acumulador.setColumns(10);
	}
}
