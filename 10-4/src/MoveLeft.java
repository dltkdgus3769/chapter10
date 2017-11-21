import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class MoveLeft extends JFrame {
	private JLabel la = new JLabel("Love Java");
	public MoveLeft() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MykeyListener());
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();		
	}
	class MykeyListener extends KeyAdapter {
		String a = la.getText();
		public void KeyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
				case KeyEvent.VK_LEFT:
					la.setText(a.substring(1)+a.substring(0,1));
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveLeft();
	}

}
