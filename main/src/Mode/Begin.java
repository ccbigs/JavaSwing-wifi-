package Mode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Begin {
	static JFrame jf=new JFrame();
	static String user;
	public static String getput() {
		return user;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Begin().Createjf();
		jf.setVisible(true);
	}
	
	public void Createjf() {
		jf.setSize(600, 400);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setTitle("登陆界面");
		
		JLabel weicome=new JLabel("欢迎使用");
		JLabel zh=new JLabel("账号:");
		JLabel mm=new JLabel("密码:");
		weicome.setBounds(280, 50, 100, 30);
		zh.setBounds(200, 130, 50, 20);
		mm.setBounds(200, 160, 50, 20);
		jf.add(weicome);
		jf.add(zh);
		jf.add(mm);
		
		JTextField ah=new JTextField();
		JPasswordField ap=new JPasswordField();
		ah.setBounds(255, 130, 120, 20);
		ap.setBounds(255, 160, 120, 20);
		jf.add(ah);
		jf.add(ap);
		
		JButton one=new JButton("进入");
		JButton two=new JButton("退出");
		JButton three=new JButton("开发人员名单");
		one.setBounds(200, 230, 80, 20);
		two.setBounds(330, 230, 80, 20);
		three.setBounds(250, 300, 120, 20);
		jf.add(one);
		jf.add(two);
		jf.add(three);
		 
		JButton c=new JButton(" ");
		c.setContentAreaFilled(false);		//按键透明
		c.setBorderPainted(false);		//边框透明
		c.setEnabled(false);			//不能点击
		jf.add(c);
		jf.setLocation(350, 150);
//登入监控器		
		one.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				user=ah.getText();
				String password=String.valueOf(ap.getPassword());
				if (Input.getin(user, password)) {
//					Input.sure();
					Input.majorMax();
				}else {
					Input.error();
				}
			}
		});
		

//开发人员监控器
		three.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Input.NUmberThree();
				
			}
		});
	}
	
}