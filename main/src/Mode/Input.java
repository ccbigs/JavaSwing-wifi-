package Mode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import Mode.Begin;
public class Input {
	static String uses=Begin.getput();
	
//进行账号判断
	static boolean getin(String ZhangHao,String PassWord) {
		DateBasic test=new DateBasic();
		String[] DBPS=test.getAllPS();
		String[] DBZH=test.getAllZH();
		String[] Admin= test.getAdmin();
		for(int i=0;i<DBZH.length;i++) {
			if(ZhangHao.equals(DBZH[i])||ZhangHao.equals(Admin[0])) {
				if(PassWord.equals(DBPS[i]) || PassWord.equals(Admin[1])) {
					return true;
				}
			}
		}
		return false;
	}
//密码或者账号输入错误给出的提示
	public static void error() {
		JFrame errorFrame=new JFrame("错误提示");
		errorFrame.setSize(200, 100);
		errorFrame.setDefaultCloseOperation(errorFrame.EXIT_ON_CLOSE);
		JLabel eJLabel=new JLabel("你输入的密码或者账号有错！");
		eJLabel.setBounds(0, 0, 100, 100);
		errorFrame.add(eJLabel);
		errorFrame.setLocation(350, 150);
		errorFrame.setVisible(true);
	}
//点击进入关键字帅选界面
	public static void sure() {
		JFrame ture=new JFrame();
		ture.setSize(800, 600);
		ture.setDefaultCloseOperation(ture.EXIT_ON_CLOSE);
		JTextArea one=new JTextArea();
		JTextArea two=new JTextArea();
		JTextArea three=new JTextArea();
		one.setBounds(30, 50, 200, 500);
		two.setBounds(270, 50,100, 20);
		three.setBounds(420, 50, 200, 500);
		ture.add(one);
		ture.add(two);
		ture.add(three);
//		ture.getContentPane().setBackground(Color.GRAY);
		
		JButton j1=new JButton("精确包含刷选");
		JButton j2=new JButton("不精确包含刷选");
		JButton j3=new JButton("包含刷选");
		JButton j4=new JButton("不包含刷选");
		JButton j5=new JButton("使用说明");
		j1.setBounds(260, 100, 120, 20);
		j2.setBounds(255, 130, 130, 20);
		j3.setBounds(270, 160, 100,20);
		j4.setBounds(270, 190, 100,20);
		j5.setBounds(640, 280, 100, 20);
		ture.add(j1);
		ture.add(j2);
		ture.add(j3);
		ture.add(j4);
		ture.add(j5);
		
		JLabel jl1=new JLabel("在此输入关键字:");
		JLabel jl2=new JLabel("输入关键字主干:");
		JLabel jl3=new JLabel("刷选结果:");
		jl1.setBounds(40, 30, 100, 20);
		jl2.setBounds(270, 30, 100, 20);
		jl3.setBounds(430, 30, 100, 20);
		ture.add(jl1);
		ture.add(jl2);
		ture.add(jl3);
		ture.setLocation(350, 150);
		
        //监听器	1	
		j1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] major=one.getText().split("\n");
				String scend=two.getText();
				for(int i=0;i<Body.One(major, scend).length;i++) {
					three.append(Body.One(major, scend)[i]);
					three.append("\n");
					if(Body.One(major, scend)[i]==null) {
						//进行输出为null时的判断
						break;
					}
				}		
			}
		});
		//监听器 2
		j2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] major=one.getText().split("\n");
				String scend=two.getText();
				for(int i=0;i<Body.two(major, scend).length;i++) {
					three.append(Body.two(major, scend)[i]);
					three.append("\n");
					if(Body.two(major, scend)[i]==null) {
						//进行输出为null时的判断
						break;
					}
				}					
			}
		});
		//监听器3
		j3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] major=one.getText().split("\n");
				String scend=two.getText();
				for(int i=0;i<Body.there(major, scend).length;i++) {
					three.append(Body.there(major, scend)[i]);
					three.append("\n");
					if(Body.there(major, scend)[i]==null) {
						//进行输出为null时的判断
						break;
					}
				}	
			}
		});
		//监听器4
		j4.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] major=one.getText().split("\n");
				String scend=two.getText();
				for(int i=0;i<Body.four(major, scend).length;i++) {
//					在第三个文本域进行输出
					three.append(Body.four(major, scend)[i]);
					three.append("\n");
					if(Body.four(major, scend)[i]==null) {
						//进行输出为null时的判断
						break;
					}
				}	
			}
		});
		//监听器5：使用说明介绍
		j5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.SureExplien();
			}
		});
		
		
		ture.setLayout(null);
		ture.setLocation(150, 50);
		ture.setVisible(true);	
	}
//开发人员显示界面	
	public static void NUmberThree() {
		JFrame thereFrame=new JFrame("开发人员");
		thereFrame.setSize(200, 100);
		thereFrame.setDefaultCloseOperation(thereFrame.EXIT_ON_CLOSE);
		
		JLabel one=new JLabel("开发人员:左定权   审查:左定权");
		one.setBounds(0, 0, 100, 50);
		thereFrame.add(one);
		thereFrame.setLocation(300, 300);
		
		thereFrame.setVisible(true);
	}
//主界面
	public static void majorMax() {
		JFrame jf=new JFrame();
		jf.setSize(533, 340);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setTitle("主界面");
		JLabel jimg=new JLabel();
		JButton j1=new JButton("文字刷选");
		JButton j2=new JButton("WIFI查询");
		JButton j3=new JButton("译码");
		JButton j4=new JButton("恶意指令测试");
		JLabel jl1=new JLabel("当前权限用户:"+uses);
		j1.setBounds(100, 100, 100, 20);
		j2.setBounds(260, 100, 100, 20);
		j3.setBounds(100, 130, 100, 20);
		j4.setBounds(240, 130, 140, 20);
		jl1.setBounds(150, 50, 200, 30);
		j1.setOpaque(true);
		j2.setOpaque(true);
		URL url=Input.class.getResource("background.jpg");
		Icon icon=new ImageIcon(url);
		jimg.setIcon(icon);
		jimg.setBounds(0, 0,518,300);
		jimg.setOpaque(false);	
		jf.add(jl1);		
		jf.add(j1);
		jf.add(j2);
		jf.add(j3);
		jf.add(j4);
		jf.add(jimg);
		jf.setLocation(350, 150);
		jf.setVisible(true);
        //监控器
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sure();
			}
		});
		
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wifi();
			}
		});
		
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Input().YiMa();;
			}
		});
		
		j4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virs();
			}
		});
		
		
		JButton c=new JButton(" ");
		c.setContentAreaFilled(false);		//按键透明
		c.setBorderPainted(false);		//边框透明
		c.setEnabled(false);			//不能点击
		jf.add(c);
		
	}
//   刷选说明界面,可以多看看如何使用界面文字换行的，以及滑动按钮
	public static void SureExplien() {
		JFrame jf=new JFrame();
//		Container container = jf.getContentPane();
		JTextArea tArea = new JTextArea(200, 50);        // 创建文本区域组件
		tArea.setText("   使用说明：\r\n       将对应的关键字填入刷选框中，点击相应的软键，即可得出你所需求的关键字"
				+ "\r\n  1、精确包含刷选:刷选出目标关键字中所包含相连的关键字\r\n  2、不精确包含刷选:只要不包含相连的关键字就会被刷选出来"
				+ "\r\n  3、包含刷选：刷选出目标关键字中含有的关键字\r\n  4、非包含刷选：不包含一个字的关键字都会被刷选"); 
//		JScrollPane sp = new JScrollPane(tArea);
//		container.add(sp);
		 
		jf.add(tArea);
		jf.setVisible(true);
		jf.setSize(500, 250);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	static String ZH;
//	查询Wifi密码的界面
	public static void Wifi() {
		Body.run();
		
		JFrame jf=new JFrame();
		jf.setSize(600, 400);
		jf.setTitle("Wifi密码查看");
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		
		JTextField t1=new JTextField("输入wifi");
		JTextArea t2=new JTextArea();
		JTextArea t3=new JTextArea();
		JButton j1=new JButton("确认");
		JLabel jl1=new JLabel("密码:");
		JLabel jl2=new JLabel("探测器检测到以下Wifi");
		j1.setBounds(160, 95, 80, 20);
		t1.setBounds(100, 60, 200, 25);
		t2.setBounds(140, 140, 150,25);
		t3.setBounds(350, 60, 150, 200);
		jl1.setBounds(100, 140, 30, 20);
		jl2.setBounds(350, 40, 170, 20);
		
		t3.append(Body.word1);
		
	

		jf.add(t1);
		jf.add(j1);
		jf.add(t2);
		jf.add(jl1);
		jf.add(t3);
		jf.add(jl2);
		
//监控器
		j1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				ZH=t1.getText();
				t2.append(Body.word2(ZH));
			}
		});
		
		JButton c=new JButton();
		c.setContentAreaFilled(false);		//按键透明
		c.setBorderPainted(false);		//边框透明
		c.setEnabled(false);
		jf.add(c);
		jf.setLocation(200, 200);
		jf.setVisible(true);
	}
	
//  译码界面
	public void YiMa() {
		JFrame jf=new JFrame();
		jf.setSize(700, 300);
		jf.setTitle("译码");
		JTextArea t1=new JTextArea(500,5);	
		JTextArea t2=new JTextArea(500,5);
		JButton j1=new JButton("确认");
		JComboBox<String> stame=new JComboBox<String>();
		stame.addItem("码译英");
		stame.addItem("二次错位加密");
		stame.addItem("英译码");
		stame.setBounds(50, 90, 100, 20);
		t1.setBounds(50, 30, 600, 40);
		t2.setBounds(50, 130, 600,60);
		j1.setBounds(500, 90, 100, 20);
		jf.add(t1);
		jf.add(j1);
		jf.add(stame);
		jf.add(t2);
		
//		想要点击按钮获取文本域，必须要放入监控器里面
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Y1=t1.getText();
				String Y2=(String)stame.getSelectedItem();
				t2.append(Body.YM(Y1,Y2));
			}
		});
		
		JButton c=new JButton();
		c.setContentAreaFilled(false);		//按键透明
		c.setBorderPainted(false);		//边框透明
		c.setEnabled(false);
		jf.add(c);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	
//	恶意指令测试
	public static void virs() {
		JFrame jf=new JFrame();
		jf.setSize(400, 200);
		jf.setTitle("恶意指令测试");
		JButton j1=new JButton("关机测试");
		JButton j2=new JButton("病毒繁殖");
		JLabel jl1=new JLabel("病毒繁殖暂时关闭：由于避免恶意人员利用病毒造成他人电脑伤害");
		JTextField t1=new JTextField("输入多少秒后关机");
		j1.setBounds(180, 20, 90, 20);
		j2.setBounds(120, 60, 90, 20);
		t1.setBounds(70, 20, 100, 20);
		jl1.setBounds(10, 90, 400,20 );
		jf.add(j1);
		jf.add(j2);
		jf.add(t1);
		jf.add(jl1);
		
//		监控器
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Body.shutdown(t1.getText());
			}
		});
		
		JButton c=new JButton();
		c.setContentAreaFilled(false);		//按键透明
		c.setBorderPainted(false);		//边框透明
		c.setEnabled(false);
		jf.add(c);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		majorMax();

	}

}

