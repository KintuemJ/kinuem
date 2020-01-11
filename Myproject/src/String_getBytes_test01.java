import java.util.ArrayList;

public class String_getBytes_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getBytes()方法详解
//		在Java中,String的getBytes()方法是得到一个操作系统默认的编码格式的字节数组。这表示在不同的操作系统下,返回的东西不一样!
//		1、 str.getBytes();  如果括号中不写charset，则采用的是Sytem.getProperty("file.encoding"),即当前文件的编码方式， 
//		2、  str.getBytes("charset");//指定charset，即将底层存储的Unicode码解析为charset编码格式的字节数组方式 
//		3、String  str=new String(str.getBytes("utf-8"),"gbk")); //
//		将已经解析出来的字节数据转化为gbk编码格式的字符串，在内存中即为gbk格式的字节数组转为Unicode去交互传递 
		String a ="你好";
		byte[] array =a.getBytes();
		for (byte x:array) {
			System.out.println("x="+x);
			}		

		}


}
