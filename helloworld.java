class helloworld{
  public static void main(String [] args){
    String s1="ankit";
    test t1=new test();
    t1.greet(s1);
    System.out.print("Hello! World");
  }
}

class test{
    void greet(String msg){
      System.out.println(msg)
    }
}
