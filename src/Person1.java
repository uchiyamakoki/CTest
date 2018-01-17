public class Person1 {
    String name;
    int age;


    public  Person1(){

    }
    public  Person1(String n,int a){
        name=n;
        age=a;
    }
    public  void  speak(){
        System.out.println("姓名："+name+"，年龄："+age);
    }
    public void  updateAge(int a){
        age=a;
    }

}

