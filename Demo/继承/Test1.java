package 继承;
public class Test1 {
    public static void main(String[] args) {
        Chicken chicken=new Chicken();
         chicken.like="喜欢";
         chicken.name="喔喔";
         chicken.shout="打鸣";
         chicken.info1();
        Duck duck=new Duck();
        duck.like="喜欢";
        duck.name="嘎嘎";
        duck.swim="游泳";
        duck.info1();
    }



}
