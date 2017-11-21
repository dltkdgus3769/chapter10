import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventEx extends JFrame {	
	public MouseEventEx() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		// 마우스 리스너 달기
		label.addMouseListener(new MyMouseListener());
		setSize(250,150);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) { //마우스 올리면
			JLabel la = (JLabel)e.getSource();
			la.setText("Love Java");
		}			
		public void mouseExited(MouseEvent e) {// 마우스 내리면
			JLabel la = (JLabel)e.getSource();
			la.setText("사랑해");
		}			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventEx();
	}

}
