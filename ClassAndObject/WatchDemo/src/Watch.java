public class Watch{
	// member fileds
	 private int hr;
	 private int min;
	 private int sec;

	 public Watch(){ 
	 	//
	 	System.out.println(hr +" "+ min +"  "+sec);
	 	hr=min=sec=10;
	 }
	 // 
	 public Watch(int hr,int min,int sec){
	 	 	System.out.println(hr +" "+ min +"  "+sec);
	 	this.hr=hr; this.min=min; this.sec=sec;
	 }

	 public void setHr(int hr){ this.hr=hr;}
	 public void setMin(int min){ this.min=min;}
	 public void setSec(int sec){ this.sec=sec;}

	 public int getHr() { return this.hr; }
	 public int getMin() { return this.min; }
	 public int getSec() { return this.sec; }

	 public void displayWatch(){
	 	System.out.println(hr +" : "+min+"  :  "+sec);
	 }
}