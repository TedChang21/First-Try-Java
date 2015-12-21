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
