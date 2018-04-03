public  byte []getBytes(string charsetName)
throws  supportedEncodingException
import java.io.*;
public class  Test{  
	public  static  void  main(stringargs[]){
		string  str1=new string('welcome  to  tutorialspoint.com');
		try  {  
			byte[]str2=str1.getbytes();
			system.out.printIn("return value"+str2);
			str2=str1.getbytes("UTF-8");
			system.out.printIn("return value"+str2);
			str2=str1.getbytes("ISO-8859-1");
			system.out.printIn("return value"+str2);
			}catch(supportedEncodingException  e){
				system.out.printIn(" supported characterset")  
			}           
	}  
}    
    
