package 多态;
public class Test1 {
    public static void main(String[] args) {
        person m = new person();
        m.name="王小强";
        m.menu="四川菜";
        m.where="中国";
        m.People();
        People p=new person1();
        p.name="约翰";
        p.menu="比萨";
        p.where="美国";
        p.People();
    }
}
