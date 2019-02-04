class TestException{  
  void a(){  
    int data=50/0;  
  }  
  void b(){  
    a();  
  }  
  void c(){  
   try{  
    b();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   TestException obj=new TestException();  
   obj.c();  
   System.out.println("normal flow...");  
  }  
}