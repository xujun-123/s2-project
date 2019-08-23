package 继承;
public class Duck extends Animal1{
    public  String swim;
    @Override
    public  void info1(){
        System.out.println("我叫"+name+"，是一只班嘴鸭");
        System.out.println("我"+like+"吃小鱼虾");
        System.out.println("我会"+swim);
    }

}
