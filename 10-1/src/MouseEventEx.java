import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventEx extends JFrame {	
	public MouseEventEx() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		// ���콺 ������ �ޱ�
		label.addMouseListener(new MyMouseListener());
		setSize(250,150);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) { //���콺 �ø���
			JLabel la = (JLabel)e.getSource();
			la.setText("Love Java");
		}			
		public void mouseExited(MouseEvent e) {// ���콺 ������
			JLabel la = (JLabel)e.getSource();
			la.setText("�����");
		}			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventEx();
	}

}
