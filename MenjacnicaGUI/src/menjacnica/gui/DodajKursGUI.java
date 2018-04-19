package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField txtFieldSifra;
	private JTextField textFieldProdajniKurs;
	private JLabel lblProdajniKurs;
	private JTextField textFieldNaziv;
	private JLabel lblNaziv;
	private JTextField textFieldKupovniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textFieldSrednjiKurs;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private JLabel lblSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private MenjacnicaGUI glavniProzor;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { DodajKursGUI frame = new
	 * DodajKursGUI(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI glavniProzor) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setPreferredSize(new Dimension(300, 300));
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 359, 300);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTxtFieldSifra());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());

		this.glavniProzor = glavniProzor;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setPreferredSize(new Dimension(140, 0));
			lblSifra.setBounds(10, 18, 140, 14);
		}
		return lblSifra;
	}

	private JTextField getTxtFieldSifra() {
		if (txtFieldSifra == null) {
			txtFieldSifra = new JTextField();
			txtFieldSifra.setPreferredSize(new Dimension(140, 0));
			txtFieldSifra.setBounds(10, 50, 140, 20);
			txtFieldSifra.setColumns(10);
		}
		return txtFieldSifra;
	}

	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setPreferredSize(new Dimension(140, 0));
			textFieldProdajniKurs.setColumns(10);
			textFieldProdajniKurs.setBounds(10, 120, 140, 20);
		}
		return textFieldProdajniKurs;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setPreferredSize(new Dimension(140, 0));
			lblProdajniKurs.setBounds(10, 88, 140, 14);
		}
		return lblProdajniKurs;
	}

	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setPreferredSize(new Dimension(140, 0));
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(200, 50, 140, 20);
		}
		return textFieldNaziv;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setPreferredSize(new Dimension(140, 0));
			lblNaziv.setBounds(200, 18, 140, 14);
		}
		return lblNaziv;
	}

	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setPreferredSize(new Dimension(140, 0));
			textFieldKupovniKurs.setColumns(10);
			textFieldKupovniKurs.setBounds(200, 120, 140, 20);
		}
		return textFieldKupovniKurs;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setPreferredSize(new Dimension(140, 0));
			lblKupovniKurs.setBounds(200, 88, 140, 14);
		}
		return lblKupovniKurs;
	}

	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setPreferredSize(new Dimension(140, 0));
			textFieldSrednjiKurs.setColumns(10);
			textFieldSrednjiKurs.setBounds(10, 190, 140, 20);
		}
		return textFieldSrednjiKurs;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setPreferredSize(new Dimension(140, 0));
			lblSrednjiKurs.setBounds(10, 158, 140, 14);
		}
		return lblSrednjiKurs;
	}

	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setPreferredSize(new Dimension(140, 0));
			textFieldSkraceniNaziv.setColumns(10);
			textFieldSkraceniNaziv.setBounds(200, 190, 140, 20);
		}
		return textFieldSkraceniNaziv;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setPreferredSize(new Dimension(140, 0));
			lblSkraceniNaziv.setBounds(200, 158, 140, 14);
		}
		return lblSkraceniNaziv;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						String sifra = txtFieldSifra.getText();
						String naziv = textFieldNaziv.getText();
						String skraceniNaziv = textFieldSkraceniNaziv.getText();
						Double prodajniKurs = Double.parseDouble(textFieldProdajniKurs.getText());
						Double srednjiKurs = Double.parseDouble(textFieldSrednjiKurs.getText());
						Double kupovniKurs = Double.parseDouble(textFieldKupovniKurs.getText());

						String zaIspis = "Sifra: " + sifra + "\t Naziv: " + naziv + "\t Skraceni naziv: "
								+ skraceniNaziv + "\t Prodajni Kurs: " + prodajniKurs + "\t Srednji Kurs: "
								+ srednjiKurs + "\t Kupovni Kurs: " + kupovniKurs;

						glavniProzor.statusArea.setText(glavniProzor.statusArea.getText() + '\n' + zaIspis);

					} catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane, e1.getMessage(), "Greska",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnDodaj.setPreferredSize(new Dimension(140, 0));
			btnDodaj.setBounds(10, 228, 140, 23);
		}
		return btnDodaj;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setPreferredSize(new Dimension(140, 0));
			btnOdustani.setBounds(200, 228, 140, 23);
		}
		return btnOdustani;
	}
}
