package 第一章练习1;
public class Penguin {
    String name="无名";
    int health=100;
    int love=0;
    final String SEX_MALE="Q仔";
    final String SEX_FEMALE="Q妹";
    String sex=SEX_MALE;
    public void print(){
        System.out.println("企鹅的自白：\n我的名字叫"+this.name+"，健康值为"+this.health+"，和主人的亲密度为"
                +this.love+"，我的性别为"+this.sex+"性。");
    }
}
