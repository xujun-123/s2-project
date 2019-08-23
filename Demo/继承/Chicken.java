package 继承;
public class Chicken extends Animal1 {
    public  String shout;
    @Override
    public void info1() {
        System.out.println("我叫"+name+"，是一只芦花鸡");
        System.out.println("我"+like+"吃虫子");
        System.out.println("我会"+shout);
    }
}
