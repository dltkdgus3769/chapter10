import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickRandom extends JFrame{
	private JLabel la = new JLabel("C");
	public ClickRandom() {
		setTitle("Ŭ�� ���� �� �������α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		//����Ʈ���� ��ġ������ ����
		c.setLayout(null);
		la.setLocation(100,100);
		la.setSize(10,10);
		c.add(la);
		setSize(500,500);
		setVisible(true);
		c.setFocusable(true);
		//����Ʈ���� Ű �Է��� ���� ���ֵ��� ��Ŀ�� ���� ����
		c.requestFocus();		
	}
	class MyMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) { //x,y ���� ����
			la.setLocation((int)(Math.random()*500),(int)(Math.random()*500));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickRandom();
	}

}
