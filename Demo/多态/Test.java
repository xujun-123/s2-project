package 多态;
public class Test {
    public static void main(String[] args) {
        print d=new DotMatrixPrinter();
        d.name="针式打印机";
        print I=new InkpetPrinter();
        I.name="喷墨打印机";
        print l=new LaserPrinter();
        l.name="激光打印机";
        d.print();
        I.print();
        l.print();
    }
}
