package capitulo6.imagensgraficas;

import java.awt.Color;
import java.awt.Graphics;

public class DrawSmiley {

	public void paintComponent(Graphics g) {

		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);

		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);

		g.fillOval(50, 110, 120, 60);

		g.setColor(Color.YELLOW);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);

	}

}
