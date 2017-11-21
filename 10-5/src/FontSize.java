import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FontSize extends JFrame{
	public FontSize() {
		setTitle("+,- 키로 폰트 크기 조절");
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
			if(e.getKeyChar() == '+') { //+입력 받을경우
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				//사이즈 5픽셀 증가
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			}
			else if(e.getKeyChar() == '-') { // - 입력 받을 경우
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				//폰트사이즈 5보다 작으면 변화 없음
				if(size <= 5)
					return;
				//5픽셀 감소
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
		}	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontSize();
	}

}
