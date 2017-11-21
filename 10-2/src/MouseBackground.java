import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseBackground extends JFrame {
	JPanel j = new JPanel();
	public MouseBackground() {
		setTitle("�巡���ϴ� ���� YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(j);
		
		j.addMouseMotionListener(new MouseMotionListener());
		j.setBackground(Color.GREEN); // �ʱ� �÷� ����
		
		setSize(300,200);
		setVisible(true);		
	}
	public class MouseMotionListener extends MouseAdapter {
		public void mouseDragged(MouseEvent e) { //�巡�� �ϴ� ����
			j = (JPanel)e.getSource();
			j.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) { //���콺 �����̴� ����
			j = (JPanel)e.getSource(); 
			j.setBackground(Color.GREEN); 
		}      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseBackground();
	}

}
