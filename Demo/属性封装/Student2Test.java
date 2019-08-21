package 属性封装;
public class Student2Test {
    public static void main(String[] args) {
        Student2 student2=new Student2("男生","ACCP");
        student2.SayHello();
        Student2 stu=new Student2("小蝶", 21, "女生", "ACCP");
        stu.SayHello1();
    }
}
