public class Test{
public void demo(String [] list){
try{
         String s=list[list.length+1];
        System.out.println(s);
    }catch(ArrayIndexOutOfBoundsException e){
   return;
  }finally{
      System.out.println("Finally here.");}
}
public static void main(String [] args){
Test t=new Test();
String [] list={"one","two"};
t.demo(list);
System.out.println("Done!");
}
}
