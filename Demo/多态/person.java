package 多态;
public class person  extends People{
    @Override
    public void People(){
        System.out.println("我来自"+where+"的朋友"+name+"，他喜欢吃"+menu+"，打橄榄球。");
    }
}
