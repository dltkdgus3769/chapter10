import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FontSize extends JFrame{
	public FontSize() {
		setTitle("+,- Ű�� ��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(la);
		la.addKeyListener(new MykeyListener());
		setSize(300,150);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
		
	}
	class MykeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '+') { //+�Է� �������
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				//������ 5�ȼ� ����
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			}
			else if(e.getKeyChar() == '-') { // - �Է� ���� ���
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				//��Ʈ������ 5���� ������ ��ȭ ����
				if(size <= 5)
					return;
				//5�ȼ� ����
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
		}	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontSize();
	}

}
