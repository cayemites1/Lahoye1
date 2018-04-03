class  captcha{
	public  static  void  main(string[]args){
		char []ran_chars=new  char[6];
		int i=0;
		while(i!=6){
			int c=(int)(Math.random()*122)+65;
			if((c>='A'&&c <='Z')||(c>='a'&&c <='z')){
				ran_chars [i]=(char)c;
				i++;  
			}
		} 
		string captcha = new string(ran_chars);
		system.out.print("CAPTCHA"+captcha);         
	}  
}  