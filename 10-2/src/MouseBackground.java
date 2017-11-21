import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseBackground extends JFrame {
	JPanel j = new JPanel();
	public MouseBackground() {
		setTitle("드래깅하는 동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(j);
		
		j.addMouseMotionListener(new MouseMotionListener());
		j.setBackground(Color.GREEN); // 초기 컬러 설정
		
		setSize(300,200);
		setVisible(true);		
	}
	public class MouseMotionListener extends MouseAdapter {
		public void mouseDragged(MouseEvent e) { //드래그 하는 동안
			j = (JPanel)e.getSource();
			j.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) { //마우스 움직이는 동안
			j = (JPanel)e.getSource(); 
			j.setBackground(Color.GREEN); 
		}      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseBackground();
	}

}
