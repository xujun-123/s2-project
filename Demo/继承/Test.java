package 继承;
public class Test {
    public static void main(String[] args) {
        Bird b=new Bird();
        b.color="红色";
        b.age=4;
        b.info();
        b.SayAge();
        Fish f=new Fish();
        f.weight=5;
        f.age=2;
        f.info();
        f.SayAge();
    }
}
