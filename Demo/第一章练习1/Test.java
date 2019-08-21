package 第一章练习1;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到宠物商店！");
        System.out.println("请输入您要领养的宠物的姓名：");
        String name = input.next();
        System.out.println("请选择您要领养的宠物类型 ：（1，小狗 2，企鹅）");
        switch (input.nextInt()) {
            case 1:
                System.out.println("1,请选择您要的小狗品种 ：（1，聪明的拉布拉多犬 2，酷酷的雪纳瑞犬）");
                String strain=null;
                if (input.nextInt() == 2) {
                    strain = "忠诚的拉布拉多犬";
                } else {
                    strain = "酷酷的雪纳瑞犬";
                }
                Dog dog = new Dog();
                dog.name = name;
                dog.strain = strain;
                dog.print();
                break;
            case 2:
                System.out.println("请选择企鹅的性别：（1，Q仔 2，Q妹）");
                String sex=null;
                if (input.nextInt() == 1) {
                     sex = "雄";
                } else {
                     sex = "雌";
                    Penguin pgn = new Penguin();
                    pgn.name = name;
                    pgn.sex = sex;
                    pgn.print();
                }
        }
    }
}
