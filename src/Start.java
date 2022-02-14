import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.file.attribute.AclEntry;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Start {

	private JFrame frame;
	private JTextField caja1;

	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton0;
	private JButton botonC;
	private JButton botonPar;
	private JButton botonIgual;
	private JButton botonSuma;
	private JButton botonResta;
	private JButton botonMulti;
	private JButton botonDivi;

	private String contenidoCaja1;
	private String simbolo;

	private float factor1 = 0;
	private float factor2 = 0;
	private float resultado = 0;
	private String total;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 416, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		caja1 = new JTextField();
		caja1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		caja1.setEnabled(false);
		caja1.setBounds(10, 11, 377, 60);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);

		botonC = new JButton("C");
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText(null);
				boton1.setEnabled(true);
				boton2.setEnabled(true);
				boton3.setEnabled(true);
				boton4.setEnabled(true);
				boton5.setEnabled(true);
				boton6.setEnabled(true);
				boton7.setEnabled(true);
				boton8.setEnabled(true);
				boton9.setEnabled(true);
				boton0.setEnabled(true);
				botonSuma.setEnabled(true);
				botonResta.setEnabled(true);
				botonMulti.setEnabled(true);
				botonDivi.setEnabled(true);
				botonPar.setEnabled(true);
				botonIgual.setEnabled(true);


			}
		});
		botonC.setBounds(10, 101, 75, 40);
		frame.getContentPane().add(botonC);

		botonPar = new JButton("Par");
		botonPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					contenidoCaja1 = caja1.getText().toString();
					factor1 = Float.parseFloat(contenidoCaja1);
					if (factor1 % 2 == 0) {

						caja1.setText("Par");
					} else {
						caja1.setText("Impar");
					}

					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMulti.setEnabled(false);
					botonDivi.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
				} catch (Exception e2) {
					caja1.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMulti.setEnabled(false);
					botonDivi.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
				}

			}

		});
		botonPar.setBounds(103, 101, 95, 40);
		frame.getContentPane().add(botonPar);

		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText(caja1.getText() + boton1.getText());

			}
		});
		boton1.setBounds(10, 180, 61, 40);
		frame.getContentPane().add(boton1);

		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText(caja1.getText() + boton2.getText());

			}
		});
		boton2.setBounds(94, 180, 61, 40);
		frame.getContentPane().add(boton2);

		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText("" + caja1.getText() + boton3.getText());
			}
		});
		boton3.setBounds(177, 180, 61, 40);
		frame.getContentPane().add(boton3);

		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText("" + caja1.getText() + boton4.getText());
			}
		});
		boton4.setBounds(10, 234, 61, 40);
		frame.getContentPane().add(boton4);

		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText("" + caja1.getText() + boton5.getText());
			}
		});
		boton5.setBounds(94, 234, 61, 40);
		frame.getContentPane().add(boton5);

		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText("" + caja1.getText() + boton6.getText());
			}
		});
		boton6.setBounds(177, 231, 61, 40);
		frame.getContentPane().add(boton6);

		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText("" + caja1.getText() + boton7.getText());
			}
		});
		boton7.setBounds(10, 285, 61, 40);
		frame.getContentPane().add(boton7);

		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText("" + caja1.getText() + boton8.getText());
			}
		});
		boton8.setBounds(94, 285, 61, 40);
		frame.getContentPane().add(boton8);

		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText("" + caja1.getText() + boton9.getText());
			}
		});
		boton9.setBounds(177, 282, 61, 40);
		frame.getContentPane().add(boton9);

		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				caja1.setText("" + caja1.getText() + boton0.getText());
			}
		});
		boton0.setBounds(10, 336, 108, 40);
		frame.getContentPane().add(boton0);

		botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					contenidoCaja1 = caja1.getText().toString();
					factor2 = Float.parseFloat(contenidoCaja1);
					if (simbolo == "+") {
						resultado = factor1 + factor2;
						total = String.valueOf(resultado);
						caja1.setText(total);
					}
					if (simbolo == "-") {
						resultado = factor1 - factor2;
						total = String.valueOf(resultado);
						caja1.setText(total);
					}
					if (simbolo == "*") {
						resultado = factor1 * factor2;
						total = String.valueOf(resultado);
						caja1.setText(total);
					}
					if (simbolo == "/") {
						if (factor2 != 0) {
							resultado = factor1 / factor2;
							total = String.valueOf(resultado);
							caja1.setText(total);
						} else {
							caja1.setText("Indeterminación");
						}

					}
					if(simbolo !="+" && simbolo!="-" && simbolo !="*" && simbolo !="/") {
						caja1.setText("Error");
					}
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMulti.setEnabled(false);
					botonDivi.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);

				} catch (Exception e2) {
					caja1.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMulti.setEnabled(false);
					botonDivi.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
				}

			}
		});
		botonIgual.setBounds(130, 336, 108, 40);
		frame.getContentPane().add(botonIgual);

		botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					contenidoCaja1 = caja1.getText().toString();
					factor1 = Float.parseFloat(contenidoCaja1);
					caja1.setText("");
					simbolo = "+";
				} catch (Exception e2) {
					caja1.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMulti.setEnabled(false);
					botonDivi.setEnabled(false);
					botonPar.setEnabled(false);
				}
			}
		});
		botonSuma.setBounds(279, 180, 108, 40);
		frame.getContentPane().add(botonSuma);

		botonResta = new JButton("-");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					contenidoCaja1 = caja1.getText().toString();
					factor1 = Float.parseFloat(contenidoCaja1);
					caja1.setText("");
					simbolo = "-";

				} catch (Exception e2) {
					caja1.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMulti.setEnabled(false);
					botonDivi.setEnabled(false);
					botonPar.setEnabled(false);
				}
			}
		});
		botonResta.setBounds(279, 231, 108, 40);
		frame.getContentPane().add(botonResta);

		botonMulti = new JButton("*");
		botonMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					contenidoCaja1 = caja1.getText().toString();
					factor1 = Float.parseFloat(contenidoCaja1);
					caja1.setText("");
					simbolo = "*";
				} catch (Exception e2) {
					caja1.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMulti.setEnabled(false);
					botonDivi.setEnabled(false);
					botonPar.setEnabled(false);
				}
			}
		});
		botonMulti.setBounds(279, 285, 108, 40);
		frame.getContentPane().add(botonMulti);

		botonDivi = new JButton("/");
		botonDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					contenidoCaja1 = caja1.getText().toString();
					factor1 = Float.parseFloat(contenidoCaja1);
					caja1.setText("");
					simbolo = "/";
				} catch (Exception e2) {
					caja1.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMulti.setEnabled(false);
					botonDivi.setEnabled(false);
					botonPar.setEnabled(false);
				}
			}
		});
		botonDivi.setBounds(279, 336, 108, 40);
		frame.getContentPane().add(botonDivi);
	}

}
