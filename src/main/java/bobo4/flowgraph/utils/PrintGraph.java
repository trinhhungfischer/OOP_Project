package bobo4.flowgraph.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import bobo4.flowgraph.elements.Graph;

public class PrintGraph extends JFrame {

	private static final long serialVersionUID = 1L;

	public PrintGraph() {
		// TODO Auto-generated constructor stub
		setTitle("Graph Path Demo");
		setForeground(Color.LIGHT_GRAY);
		setFont(new Font("Arial", Font.PLAIN, 14));
		setTitle("Graph");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);

		final Graph graphIllustrate = new Graph();
		graphIllustrate.setBounds(10, 11, 1884, 1019);
		graphIllustrate.init();
		graphIllustrate.saveImage(true);
		getContentPane().setLayout(null);

		JButton btnRETURN = new JButton("RETURN");
		btnRETURN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btnRETURN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRETURN.setBounds(10, 34, 108, 71);
		getContentPane().add(btnRETURN);
		getContentPane().add(graphIllustrate);
	}

}
