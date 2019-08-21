package 第一章练习1.final关键字;
public class People {
    public String name;
    public String sex;
    public static final  String FEMALE="女";  //第一种（静态常量）方法来进行约束和规范它的值   //全局静态常量
    public static final String MALE="男";    //全局静态常量（其后的常量要全部大写）
    public static void main(String[] args) {
      People people=new People();
      people.sex=People.FEMALE;
      people.name=People.MALE;
    }
}
