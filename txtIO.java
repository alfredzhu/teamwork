

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
* 读取数据 
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
* 写入数据 
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
double P=C.P, i=C.i, F=C.F;//F:复利终值 P:本金 i:利率
int N=C.N, M=C.M, m=C.m;//N:利率获取时间的整数倍 M:复利次数 m:月数
int result=C.result;
int action=C.action;
file.createNewFile(); 


if(action==1){
	out.write("\r\n"+"复利"+"\r\n");
	out.write("本金:" + P + "\r\n" + "年利率(%):" + i + "\r\n"
			+ "存入年限:" + N + "\r\n" + "年复利次数:" + M + "\r\n" + "复利终值:" + F
			+ "\r\n"); 
}
if(action==2){
	out.write("\r\n"+"单利"+"\r\n");
	out.write("本金:" + P + "\r\n" + "年利率(%):" + i + "\r\n"
			+ "存入年限:" + N + "\r\n" + "复利终值:" + F + "\r\n"); 
}
if(action==3){
	out.write("\r\n"+"本金估算"+"\r\n");
	out.write("复利终值:" + F + "\r\n" + "年利率(%):" + i + "\r\n"
			+ "存入年限:" + N + "\r\n" + "年复利次数:" + M + "\r\n" + "本金:" + P
			+ "\r\n"); 
}
if(action==4){
	out.write("\r\n"+"年限估算"+"\r\n");
	out.write("本金:" + P + "\r\n" + "年利率(%):" + i + "\r\n"
			+ "年复利次数:" + M + "\r\n" + "复利终值:" + F + "\r\n" + "年限:" + N
			+ "\r\n"); 
}
if(action==5){
	out.write("\r\n"+"利率估算"+"\r\n");
	out.write("本金:" + P + "\r\n" + "存入年限:" + N + "\r\n" + "年复利次数:"
			+ M + "\r\n" + "复利终值:" + F + "\r\n" + "年利率(%):" + i + "\r\n"); 
}
if(action==6){
	out.write("\r\n"+"定期投资(年)"+"\r\n");
	out.write("年投资金额:" + P + "\r\n" + "年利率(%):" + i + "\r\n"
			+ "定投年数:" + N + "\r\n" + "终值:" + F + "\r\n"); 
}
if(action==7){
	out.write("\r\n"+"定期投资(月)"+"\n");
	out.write("月投资金额:" + P + "\r\n" + "年利率(%):" + i + "\r\n"
			+ "定投月数:" + m + "\r\n" + "终值:" + F + "\r\n"); 
}
if(action==8){
	out.write("\r\n"+"等额本息还款"+"\r\n");
	out.write("贷款金额:" + P + "\r\n" + "年利率(%):" + i + "\r\n"
			+ "年限:" + N + "\r\n" + "年复利次数:" + M + "\r\n" + "等额本息还款额:" + F
			+ "\r\n"); 
}
//} 
out.close(); 
} catch (Exception ex) { 
System.out.println(ex); 
} 

} 

}