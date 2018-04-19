package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
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
	private JButton btnOdustani;
	private JCheckBox chckbxZaisataObrisiKurs;
	private JButton btnObrisi;
	private MenjacnicaGUI glavniProzor;

	/**
	 * Launch the application.
	 */
	/**
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { ObrisiKursGUI frame = new
	 * ObrisiKursGUI(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI glavniProzor) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTextFieldSifra());
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
		contentPane.add(getBtnOdustani());
		contentPane.add(getChckbxZaisataObrisiKurs());
		contentPane.add(getBtnObrisi());
	
		this.glavniProzor = glavniProzor;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setPreferredSize(new Dimension(140, 0));
			lblSifra.setBounds(61, 11, 140, 14);
		}
		return lblSifra;
	}

	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setPreferredSize(new Dimension(140, 0));
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(61, 43, 140, 20);
		}
		return textFieldSifra;
	}

	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setPreferredSize(new Dimension(140, 0));
			textFieldProdajniKurs.setColumns(10);
			textFieldProdajniKurs.setBounds(61, 113, 140, 20);
		}
		return textFieldProdajniKurs;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setPreferredSize(new Dimension(140, 0));
			lblProdajniKurs.setBounds(61, 81, 140, 14);
		}
		return lblProdajniKurs;
	}

	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setPreferredSize(new Dimension(140, 0));
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(251, 43, 140, 20);
		}
		return textFieldNaziv;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setPreferredSize(new Dimension(140, 0));
			lblNaziv.setBounds(251, 11, 140, 14);
		}
		return lblNaziv;
	}

	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setPreferredSize(new Dimension(140, 0));
			textFieldKupovniKurs.setColumns(10);
			textFieldKupovniKurs.setBounds(251, 113, 140, 20);
		}
		return textFieldKupovniKurs;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setPreferredSize(new Dimension(140, 0));
			lblKupovniKurs.setBounds(251, 81, 140, 14);
		}
		return lblKupovniKurs;
	}

	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setPreferredSize(new Dimension(140, 0));
			textFieldSrednjiKurs.setColumns(10);
			textFieldSrednjiKurs.setBounds(61, 183, 140, 20);
		}
		return textFieldSrednjiKurs;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setPreferredSize(new Dimension(140, 0));
			lblSrednjiKurs.setBounds(61, 151, 140, 14);
		}
		return lblSrednjiKurs;
	}

	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setPreferredSize(new Dimension(140, 0));
			textFieldSkraceniNaziv.setColumns(10);
			textFieldSkraceniNaziv.setBounds(251, 183, 140, 20);
		}
		return textFieldSkraceniNaziv;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setPreferredSize(new Dimension(140, 0));
			lblSkraceniNaziv.setBounds(251, 151, 140, 14);
		}
		return lblSkraceniNaziv;
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
			btnOdustani.setBounds(251, 251, 140, 23);
		}
		return btnOdustani;
	}

	private JCheckBox getChckbxZaisataObrisiKurs() {
		if (chckbxZaisataObrisiKurs == null) {
			chckbxZaisataObrisiKurs = new JCheckBox("Zaisata obrisi kurs");
			chckbxZaisataObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (chckbxZaisataObrisiKurs.isSelected())
						btnObrisi.setEnabled(true);
				}
			});
			chckbxZaisataObrisiKurs.setBounds(61, 218, 140, 23);
		}
		return chckbxZaisataObrisiKurs;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String sifra = textFieldSifra.getText();
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
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(61, 251, 140, 23);
		}
		return btnObrisi;
	}
}
