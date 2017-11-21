import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickRandom extends JFrame{
	private JLabel la = new JLabel("C");
	public ClickRandom() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		//컨펜트팬의 배치관리자 삭제
		c.setLayout(null);
		la.setLocation(100,100);
		la.setSize(10,10);
		c.add(la);
		setSize(500,500);
		setVisible(true);
		c.setFocusable(true);
		//컨텐트팬이 키 입력을 받을 수있도록 포커스 강제 지정
		c.requestFocus();		
	}
	class MyMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) { //x,y 범위 지정
			la.setLocation((int)(Math.random()*500),(int)(Math.random()*500));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickRandom();
	}

}
