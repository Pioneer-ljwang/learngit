/**
 * Created by ${ljwang} on 2016/9/21.
 */
class Person2{
    private String name;
    private int age;
    public String country = "CN";
    // public String name1;
    Person2(){
        name = "王小二";
        age = 16;
    }

    Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
    Person2(String name){
        this.name = name;
        age = 18;
    }

    public void speak(){
        System.out.println(country+":"+name+":"+age);
    }

}
public class testDemo2 {
    public static  void main(String[] args){
        Person2 p = new Person2();
        p.speak();
        Person2 p1 = new Person2("丁小二",16);
        p1.speak();
        Person2 p2 = new Person2("professor");
        p2.speak();
    }
}