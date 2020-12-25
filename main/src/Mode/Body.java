package Mode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Body {
//	static String[] sample=new String[100];
//	static String Sample;
//	static int length=0;
//	static int subject=0;
//	static void election() {
//		Scanner sa=new Scanner(System.in);
//		Scanner Sa=new Scanner(System.in);
//		for(int i=0;i<100;i++) {
//			sample[i]=sa.nextLine();
//			length++;
//			if(sample[i].equals("false")) {
//				break;
//			}
//		}
//		Sample=Sa.next();
//		subject=Sample.length();
////		for(int i=0;i<length;i++) {
////			System.out.println(sample[i].length());
////		}
//	}
	
//	要求包含smaple而且是相连的
	static String[] One(String sample[],String Sample) {
		String[] one=new String[200];
		int index=0,n=0;
		for(int i=0;i<sample.length;i++) {
			index=0;
			for(int j=0;j<sample[i].length();j++) {
				if(sample[i].charAt(j)==Sample.charAt(index)) {
					index++;
				}else {
					index=0;
				}
				if(index==Sample.length()) {
					one[n]=sample[i];
					n++;
					index=0;
				}
			}
		}
		return one;
	}
	
	static String[] two(String sample[],String Sample) {
		String[] one=new String[200];
		int index=0,n=0;
		for(int i=0;i<sample.length;i++) {
			for(int j=0;j<sample[i].length();j++) {index=0;
				if(sample[i].charAt(j)==Sample.charAt(index)) {
					index++;
				}else {
					index=0;
				}
				if(index==Sample.length()){	
					break;
				}if((j+1)==sample[i].length()) {
					one[n]=sample[i];n++;
				}
			}
				
		}
		return one;
	}
	
	static String[] there(String sample[],String Sample) {
		String[] one=new String[200];
		int index=0,n=0;
		for(int i=0;i<sample.length;i++) {
			index=0;
			for(int j=0;j<sample[i].length();j++) {
				if(sample[i].charAt(j)==Sample.charAt(index)) {
					index++;
				}if(index==Sample.length()) {
					one[n]=sample[i];
					n++;
					index=0;
					break;
				}
			}
		}
		return one;
	}
	
	static String[] four(String sample[],String Sample) {
		String[] one=new String[200];
		int index=0,n=0,min=0;
		for(int i=0;i<sample.length;i++) {
			index=0;
			for(int j=0;j<sample[i].length();j++) {
				if(sample[i].charAt(j)==Sample.charAt(index)) {
					index++;min++;
				}if(index==Sample.length()) {
					index=0;
				}
			}
			if(min==0) {
				one[n]=sample[i];
				n++;
				min=0;
			}
		}
		return one;
	}
//---------------------------------------------------------
static StringBuffer b=new StringBuffer();
	
	static String word1;
//cmd
	public static void run() {
        Runtime runtime = Runtime.getRuntime();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(runtime.exec("netsh wlan show profiles").getInputStream()));
            //StringBuffer b = new StringBuffer();
            String line=null;
            while ((line=br.readLine())!=null) {
                b.append(line+"\n");
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        Word();
    }
	
	@SuppressWarnings("null")
	public static void Word() {
		char[] cd1 = new char[1000];
		String c = b.toString();// 先将StringBuffer对象转换成String对象
		char[] cd = c.toCharArray();
		int n=0;
		for(int i=0;i<cd.length;i++) {
			if(cd[i]=='件') {i++;
				if(cd[i]==' ') {i++;
					if(cd[i]==':') {
						for(i+=2;i+1<cd.length;n++) {
							cd1[n]=cd[i++];
							if(cd[i]=='所') {break;}	
						}
					}
				}
		    }
	    }
		word1=new String(cd1);
	}
	
	static String word2a="netsh wlan show profile name=\"";
	static String word2d="\" key=clear";
	public static String word2(String x) {	
		word2a=word2a.concat(x);
		word2d=word2a.concat(word2d);
		StringBuffer b1=new StringBuffer();
		String mm ="原始数据";
		int n=0;
        Runtime runtime = Runtime.getRuntime();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(runtime.exec(word2d).getInputStream()));
            //StringBuffer b = new StringBuffer();
            String line=null;
            while ((line=br.readLine())!=null) {
                b1.append(line+"\n");
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        char[] cd1 = new char[100];
		String c = b1.toString();// 先将StringBuffer对象转换成String对象
		char[] cd = c.toCharArray();
		for(int i=0;i<cd.length;i++) {
			if(cd[i]=='关') {i++;
				if(cd[i]=='键') {i++;
					if(cd[i]=='内') {
						for(i+=16;;n++) {
							cd1[n]=cd[i++];
							if(cd[i]=='\n') {break;}	
						}
					}
				}
		    }
	    }
		mm=new String(cd1);
		System.out.println(mm);
		return mm;
	}
	
//	源码区
	public static String YM(String y,String x) {
		char[] y1 =new char[200];
		String A;
		if(x=="英译码") {
			for(int i=0;i<y.length();i++) {
				if(y.charAt(i)==' ') {
					y1[i]='.';
				}if(y.charAt(i)=='a') {
					y1[i]='+';
				}if(y.charAt(i)=='b') {
					y1[i]='`';
				}if(y.charAt(i)=='c') {
					y1[i]='^';
				}if(y.charAt(i)=='d') {
					y1[i]='^';
				}if(y.charAt(i)=='e') {
					y1[i]='{';
				}if(y.charAt(i)=='f') {
					y1[i]=']';
				}if(y.charAt(i)=='g') {
					y1[i]='@';
				}if(y.charAt(i)=='h') {
					y1[i]='*';
				}if(y.charAt(i)=='i') {
					y1[i]=',';
				}if(y.charAt(i)=='j') {
					y1[i]='?';
				}if(y.charAt(i)=='k') {
					y1[i]='(';
				}if(y.charAt(i)=='i') {
					y1[i]='%';
				}if(y.charAt(i)=='m') {
					y1[i]='$';
				}if(y.charAt(i)=='n') {
					y1[i]='>';
				}if(y.charAt(i)=='o') {
					y1[i]=';';
				}if(y.charAt(i)=='p') {
					y1[i]=':';
				}if(y.charAt(i)=='q') {
					y1[i]='-';
				}if(y.charAt(i)=='r') {
					y1[i]='_';
				}if(y.charAt(i)=='s') {
					y1[i]='~';
				}if(y.charAt(i)=='t') {
					y1[i]='<';
				}if(y.charAt(i)=='u') {
					y1[i]='|';
				}if(y.charAt(i)=='v') {
					y1[i]=')';
				}if(y.charAt(i)=='w') {
					y1[i]='/';
				}if(y.charAt(i)=='x') {
					y1[i]='!';
				}if(y.charAt(i)=='y') {
					y1[i]='#';
				}if(y.charAt(i)=='z') {
					y1[i]='"';
				}
			}	
		}else if(x=="码译英"){
			for(int i=0;i<y.length();i++) {
				if(y.charAt(i)=='.') {
					y1[i]=' ';
				}if(y.charAt(i)=='+') {
					y1[i]='a';
				}if(y.charAt(i)=='`') {
					y1[i]='b';
				}if(y.charAt(i)=='^') {
					y1[i]='c';
				}if(y.charAt(i)=='&') {
					y1[i]='d';
				}if(y.charAt(i)=='{') {
					y1[i]='e';
				}if(y.charAt(i)==']') {
					y1[i]='f';
				}if(y.charAt(i)=='@') {
					y1[i]='g';
				}if(y.charAt(i)=='*') {
					y1[i]='h';
				}if(y.charAt(i)==',') {
					y1[i]='i';
				}if(y.charAt(i)=='?') {
					y1[i]='j';
				}if(y.charAt(i)=='(') {
					y1[i]='k';
				}if(y.charAt(i)=='%') {
					y1[i]='i';
				}if(y.charAt(i)=='$') {
					y1[i]='m';
				}if(y.charAt(i)=='>') {
					y1[i]='n';
				}if(y.charAt(i)==';') {
					y1[i]='o';
				}if(y.charAt(i)==':') {
					y1[i]='p';
				}if(y.charAt(i)=='-') {
					y1[i]='q';
				}if(y.charAt(i)=='_') {
					y1[i]='r';
				}if(y.charAt(i)=='~') {
					y1[i]='s';
				}if(y.charAt(i)=='<') {
					y1[i]='t';
				}if(y.charAt(i)=='|') {
					y1[i]='u';
				}if(y.charAt(i)==')') {
					y1[i]='v';
				}if(y.charAt(i)=='/') {
					y1[i]='w';
				}if(y.charAt(i)=='!') {
					y1[i]='x';
				}if(y.charAt(i)=='#') {
					y1[i]='y';
				}if(y.charAt(i)=='"') {
					y1[i]='z';
				}
			}	
		}
		A=new String(y1);
		return A;
	}
	
//	恶意代码测试区
	public static void shutdown(String y) {
		String a="shutdown -s -t ";
		a=a.concat(y);
		try {
			Runtime.getRuntime().exec(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	}
}

