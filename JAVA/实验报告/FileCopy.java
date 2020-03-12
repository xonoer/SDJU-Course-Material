
import java.io.*;

public class FileCopy  {//文本文件拷贝
 
  public static void main(String[] args) throws IOException { 
	  InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader inp=new BufferedReader(isr);
	  System.out.print("请输入源文件：");
      String f1=inp.readLine();
      
     
    // Check if source file exists
    File sourceFile = new File(f1);
    if (!sourceFile.exists()) {
       System.out.println("Source file " + sourceFile 
         + " does not exist");
       System.exit(2);
    }

    System.out.print("请输入目标文件：");
    String f2=inp.readLine();
    // Check if target file exists
    File targetFile = new File(f2);
    if (targetFile.exists()) {
      System.out.println("Target file " + targetFile 
        + " already exists");
      System.exit(3);
    }

    String str=new String();
    try
    {
       BufferedReader in=new BufferedReader(new FileReader(sourceFile));
       BufferedWriter out=new BufferedWriter(new FileWriter(targetFile));
      while ((str=in.readLine())!=null)
      {
        System.out.println(str);
        out.write(str); //将读取到的一行数据写入到缓冲区输出流中
        out.newLine();//写入回车换行符
      }
      out.flush(); 
      in.close();
      out.close();
    }
    catch (IOException ioe)
    {
      System.out.println("错误! "+ioe);
    }
  }
}

