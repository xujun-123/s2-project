package 第一章练习1;
public class Dog {
    String name="无名";
    int health=100;
    int love=0;
     String strain="忠诚的拉布拉多犬";
    public void print(){
        System.out.println("小狗的自白：\n我的名字叫"+this.name+"，健康值为"+this.health+"，和主人的亲密度为"
                +this.love+"，我是一只"+this.strain+"性。");
    }
}
