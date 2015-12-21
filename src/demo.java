import java.util.ArrayList;  //d0239601 chang che kai 張哲愷 資訊三甲
public class demo{
	public static void main(String[] args ){
		
	}
}

abstract class test{
	abstract void show();
}
class Question extends test{
   String description;
   public Question(String desc) {
      this.description = desc;
   }
   public void print() {
      System.out.println(desc);
   }
   void show() {
	// TODO Auto-generated method stub
	
   }      
}
class exam extends test{
	ArrayList<test> list;
	
	public exam(){
		list = new ArrayList<test>();
	}
	void showtest(test t){
		t.show(t);
	}
	void show() {
		// TODO Auto-generated method stub
		
	}
	
}
