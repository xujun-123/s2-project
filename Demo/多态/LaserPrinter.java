package 多态;
public class LaserPrinter extends print {
    @Override
    public void print(){
        System.out.println("这个打印机名字叫"+name);
    }
}
