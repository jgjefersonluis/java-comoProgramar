package capitulo7array.imagensgraficas;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawRainbow extends JPanel {

	// define as cores indigo e violeta
	private final static Color VIOLET = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);

	// a utilizar no arco-iris, iniciando da parte mais interna
	// As duas entradas em branco resultam em um arco vazio no centro
	private Color[] colors = { Color.WHITE, Color.WHITE, VIOLET, INDIGO,
			Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

	// construtor
	public DrawRainbow() {
		setBackground(Color.WHITE);
	}

	// desenha um arco-iris utilizando arcos concêntricos
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int radius = 20; // raio de um arco

		// desenha o arco-iris perto da parte central inferior
		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;

		// desenha arcos preenchidos com o mais externo
		for (int counter = colors.length; counter > 0; counter--) {
			g.setColor(colors[counter - 1]);

			g.fillArc(centerX - counter * radius, centerY - counter * radius,
					counter * radius * 2, counter * radius * 2, 0, 180);
		}

	}

}
