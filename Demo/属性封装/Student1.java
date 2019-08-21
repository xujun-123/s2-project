package 属性封装;
public class Student1 {
    String name;
    int age;

    public static void main(String[] args) {
        Student1 stu=new Student1("小星",22);
        stu.setAge(17);
        stu.SayHello();
        System.out.println(stu.getAge());
    }
    public void setAge(int age){
        if(age<0||age<16){
            this.age=14;
        }
        else{
            this.age=age;
        }
    }
    public Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
    return age;
    }
    public void SayHello(){
        System.out.println("大家好，我叫"+this.name+"，今年"+this.age+"。");
    }
}
