

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;


public class txtIO { 

public static void main (String args[]) { 

ReadDate(); 

WriteDate(); 

} 

/** 
* ��ȡ���� 
 * @return 
*/ 
public static void ReadDate() { 
	CompoundCalculator C=new CompoundCalculator();
String url = "F:/gitfile/testgit/historydata.txt"; 
try { 
FileReader read = new FileReader(new File(url)); 
StringBuffer sb = new StringBuffer(); 
char ch[] = new char[1024]; 
int d = read.read(ch); 
while(d!=-1){ 
String str = new String(ch,0,d); 
sb.append(str); 
d = read.read(ch); 
} 
System.out.print(sb.toString()); 
} catch (FileNotFoundException e) { 
e.printStackTrace(); 
} catch (IOException e) { 
e.printStackTrace(); 
}
} 

/** 
* д������ 
*/ 
public static void WriteDate() { 

try{ 
File file = new File("F:/gitfile/testgit/historydata.txt"); 
Writer out = null ;
out = new FileWriter(file,true) ;
if (file.exists()) { 

file.delete(); 
} 
CompoundCalculator C=new CompoundCalculator();
double P=C.P, i=C.i, F=C.F;//F:������ֵ P:���� i:����
int N=C.N, M=C.M, m=C.m;//N:���ʻ�ȡʱ��������� M:�������� m:����
int result=C.result;
int action=C.action;
file.createNewFile(); 


if(action==1){
	out.write("\r\n"+"����"+"\r\n");
	out.write("����:" + P + "\r\n" + "������(%):" + i + "\r\n"
			+ "��������:" + N + "\r\n" + "�긴������:" + M + "\r\n" + "������ֵ:" + F
			+ "\r\n"); 
}
if(action==2){
	out.write("\r\n"+"����"+"\r\n");
	out.write("����:" + P + "\r\n" + "������(%):" + i + "\r\n"
			+ "��������:" + N + "\r\n" + "������ֵ:" + F + "\r\n"); 
}
if(action==3){
	out.write("\r\n"+"�������"+"\r\n");
	out.write("������ֵ:" + F + "\r\n" + "������(%):" + i + "\r\n"
			+ "��������:" + N + "\r\n" + "�긴������:" + M + "\r\n" + "����:" + P
			+ "\r\n"); 
}
if(action==4){
	out.write("\r\n"+"���޹���"+"\r\n");
	out.write("����:" + P + "\r\n" + "������(%):" + i + "\r\n"
			+ "�긴������:" + M + "\r\n" + "������ֵ:" + F + "\r\n" + "����:" + N
			+ "\r\n"); 
}
if(action==5){
	out.write("\r\n"+"���ʹ���"+"\r\n");
	out.write("����:" + P + "\r\n" + "��������:" + N + "\r\n" + "�긴������:"
			+ M + "\r\n" + "������ֵ:" + F + "\r\n" + "������(%):" + i + "\r\n"); 
}
if(action==6){
	out.write("\r\n"+"����Ͷ��(��)"+"\r\n");
	out.write("��Ͷ�ʽ��:" + P + "\r\n" + "������(%):" + i + "\r\n"
			+ "��Ͷ����:" + N + "\r\n" + "��ֵ:" + F + "\r\n"); 
}
if(action==7){
	out.write("\r\n"+"����Ͷ��(��)"+"\n");
	out.write("��Ͷ�ʽ��:" + P + "\r\n" + "������(%):" + i + "\r\n"
			+ "��Ͷ����:" + m + "\r\n" + "��ֵ:" + F + "\r\n"); 
}
if(action==8){
	out.write("\r\n"+"�ȶϢ����"+"\r\n");
	out.write("������:" + P + "\r\n" + "������(%):" + i + "\r\n"
			+ "����:" + N + "\r\n" + "�긴������:" + M + "\r\n" + "�ȶϢ�����:" + F
			+ "\r\n"); 
}
//} 
out.close(); 
} catch (Exception ex) { 
System.out.println(ex); 
} 

} 

}