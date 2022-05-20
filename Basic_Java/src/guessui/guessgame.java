package guessui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class guessgame {

	private JFrame frmGuessGame;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	JTextArea textArea;
	int hit, blow;
	JLabel labelchance;
	int count;
	Vector v1, v2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guessgame window = new guessgame();
					window.frmGuessGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guessgame() {

		this.hit = 0;
		this.blow = 0;
		this.v1 = new Vector();
		this.v2 = new Vector();
		start();
		initialize();
	}

	public void start() {
		this.v1.clear();
		Random r = new Random();
		String s;
		while (this.v1.size() < 4) {
			s = String.valueOf(r.nextInt(9) + 1);
			if (!this.v1.contains(s)) {
				this.v1.addElement(s);
			}

		}
		System.out.println(this.v1);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmGuessGame = new JFrame();
		frmGuessGame.setResizable(false);
		frmGuessGame.getContentPane().setBackground(Color.CYAN);
		frmGuessGame.setTitle("Guess Game");
		frmGuessGame.setBounds(100, 100, 348, 413);
		frmGuessGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuessGame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(198, 72, 107, 27);
		frmGuessGame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Enter Number(1~9):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(50, 68, 138, 30);
		frmGuessGame.getContentPane().add(lblNewLabel);

		JLabel texterror = new JLabel("");
		texterror.setFont(new Font("Tahoma", Font.PLAIN, 13));
		texterror.setForeground(Color.RED);
		texterror.setBounds(50, 110, 265, 14);
		frmGuessGame.getContentPane().add(texterror);

		lblNewLabel_2 = new JLabel("Guess Game");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(112, 22, 119, 31);
		frmGuessGame.getContentPane().add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBounds(50, 156, 255, 164);
		frmGuessGame.getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 255, 164);
		panel.add(scrollPane);

		textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textArea.setForeground(Color.BLUE);
		textArea.setEnabled(false);
		textArea.setBounds(0, 0, 255, 164);
		scrollPane.setViewportView(textArea);

		labelchance = new JLabel("You have 5 chance.");
		labelchance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelchance.setBounds(50, 135, 255, 14);
		frmGuessGame.getContentPane().add(labelchance);

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String st;

				Vector v = new Vector();
				Vector vcheck = new Vector();

				String[] st1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
				Collections.addAll(vcheck, st1);

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					st = "";
					v.clear();
					v2.clear();

					st = textField.getText();

					if (st.length() < 4) {
						texterror.setText("Input is too short.");
						return;
					}
					if (st.length() > 4) {
						texterror.setText("Input is too long.");
						return;
					}

					for (int i = 0; i < st.length(); i++) {
						v2.addElement(String.valueOf(st.charAt(i))); // seperate string to vector
					}
					if (v2.contains(" ")) {
						texterror.setText("Space is not Allowed");
						return;
					}

					for (int i = 0; i < v2.size(); i++) {
						if (!vcheck.contains(v2.get(i))) {
							texterror.setText("Only Enter Digit.Not Allowed Character");
							return;
						}
					}

					for (int i = 0; i < v2.size(); i++) { // test duplicate
						if (v.contains(v2.get(i))) {
							texterror.setText("Duplicate is not Allowed");
							return;
						} else
							v.add(v2.get(i));

					}

					texterror.setText("");
					textField.setText("");

					count++;
					labelchance.setText("You have " + (5 - count) + " chance.");
					if (compareVector(v2)) {
						JOptionPane.showMessageDialog(null, "You Win");
						playagin();
					}

					if (count == 5) {
						JOptionPane.showMessageDialog(null, "You Lose");
						playagin();
					}

				}

			}
		});

	}

	public void playagin() {

		if (JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
			start();
			count = 0;
			textArea.setText("");
			labelchance.setText("You have 5 chance.");

		} else {
			System.exit(0);
		}

	}

	public boolean compareVector(Vector v2) {

		this.hit = 0;
		this.blow = 0;

		if (this.v1.equals(v2))
			return true;

		for (int i = 0; i < this.v1.size(); i++) {

			if (this.v1.get(i).equals(v2.get(i)))
				this.hit++;

			for (int j = 0; j < this.v1.size(); j++) {
				if (i != j && this.v1.get(i).equals(v2.get(j)))
					this.blow++;

			}

		}
		textArea.append(count+" Time.  Result :   " + hit + "H ," + blow + "B\n");

		// System.out.println("Result :" + hit + "H," + blow + "B");

		return false;
	}
}
