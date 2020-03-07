/* 
* 文件名: Exp1_3.java 
* 功 能: 带输入功能的程序演示 
* 编写: 李四 
* 编写时间: 2018.03.5 
*/ 
import java.io.*;
public class Exp1_3{
	public static void main(String args[]){
		String s="";
		System.out.println("请输入一段字符串！");
		try{ //检查是否会出现输入输出异常
			BufferedReader in = new BufferedReader(
															new InputStreamReader(System.in));//建立输入流
		  s=in.readLine();  //从键盘读取一行，赋给s
		}
		catch(IOException e){
			System.out.println("输入错误!");
		}	
		System.out.println("你输入的是"+s);
	}
}

