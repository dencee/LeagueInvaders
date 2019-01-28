import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer timer;

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
	}
	
	void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Tick, tick, tick...");
	}
}
