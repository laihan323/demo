/* 
* �ļ���: Exp1_3.java 
* �� ��: �����빦�ܵĳ�����ʾ 
* ��д: ���� 
* ��дʱ��: 2018.03.5 
*/ 
import java.io.*;
public class Exp1_3{
	public static void main(String args[]){
		String s="";
		System.out.println("������һ���ַ�����");
		try{ //����Ƿ�������������쳣
			BufferedReader in = new BufferedReader(
															new InputStreamReader(System.in));//����������
		  s=in.readLine();  //�Ӽ��̶�ȡһ�У�����s
		}
		catch(IOException e){
			System.out.println("�������!");
		}	
		System.out.println("���������"+s);
	}
}

