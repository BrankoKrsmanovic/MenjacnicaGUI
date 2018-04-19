package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JTextArea statusArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlaz();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/hardDrive.gif")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				int opcija = fc.showOpenDialog(null);

				if (opcija == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();

					statusArea.setText(statusArea.getText() + '\n' + "Otvoren fajl: " + f.getName()
							+ "\t sa apsolutnom putanjom: " + f.getAbsolutePath());
				}
			}
		});
		mntmOpen.setIcon(
				new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				int opcija = fc.showSaveDialog(null);

				if (opcija == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();

					statusArea.setText(statusArea.getText() + '\n' + "Sacuvan fajl: " + f.getName()
							+ "\t sa apsolutnom putanjom: " + f.getAbsolutePath());
				}
			}
		});
		mntmSave.setIcon(new ImageIcon(
				MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izlaz();
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prikaziAboutProzor();
			}
		});
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(140, 10));
		contentPane.add(panel, BorderLayout.EAST);

		JButton DodajKurs = new JButton("Dodaj kurs");
		DodajKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prikaziDodajGUI();
			}
		});
		DodajKurs.setPreferredSize(new Dimension(120, 23));
		panel.add(DodajKurs);

		JButton btnObrisiKurs = new JButton("Obrisi kurs");
		btnObrisiKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prikaziObrisiGUI();
			}
		});
		btnObrisiKurs.setPreferredSize(new Dimension(120, 23));
		panel.add(btnObrisiKurs);

		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.setPreferredSize(new Dimension(120, 23));
		panel.add(btnIzvrsiZamenu);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
				new String[] { "Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(83);

		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);

		JMenuItem menuItem = new JMenuItem("Dodaj kurs");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prikaziDodajGUI();
			}
		});
		popupMenu.add(menuItem);

		JMenuItem menuItem_1 = new JMenuItem("Obrisi kurs");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prikaziObrisiGUI();
			}
		});
		popupMenu.add(menuItem_1);

		JMenuItem menuItem_2 = new JMenuItem("Izvrsi zamenu");
		popupMenu.add(menuItem_2);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(scrollPane_1, BorderLayout.SOUTH);

		statusArea.setRows(3);
		scrollPane_1.setViewportView(statusArea);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	private void prikaziAboutProzor() {
		JOptionPane.showMessageDialog(contentPane, "Autor: Branko Krsmanovic , Verzija 1.0.0", "O programu Menjacnica",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void izlaz() {
		int opcija = JOptionPane.showConfirmDialog(null, "Da li zelite da izadjete?", "Izlaz",
				JOptionPane.YES_NO_CANCEL_OPTION);
		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	private void prikaziDodajGUI() {
		DodajKursGUI prozor = new DodajKursGUI(this);
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	
	private void prikaziObrisiGUI() {
		ObrisiKursGUI prozor = new ObrisiKursGUI(this);
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
}
