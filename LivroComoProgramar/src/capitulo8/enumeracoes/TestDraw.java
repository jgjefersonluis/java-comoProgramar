package capitulo8.enumeracoes;

import javax.swing.JFrame;

import capitulo4desenhossimples.DrawPanel;

public class TestDraw {

	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);

	}

}
