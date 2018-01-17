public class ObjectDemo {
    public static void main(String[] args) {
        Person1 xiaoming=new Person1("小明",13);
        xiaoming.speak();
        System.out.println("修改年龄：");
        int newAge=15;
        xiaoming.updateAge(newAge);
        xiaoming.speak();

    }
}
