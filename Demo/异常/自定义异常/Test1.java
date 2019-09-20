package 异常.自定义异常;
import java.io.IOException;
public class Test1 {
    public void add(){
        try{
            int i=5;
            int b=8;
            //throw new IOException()
        }
        catch(Throwable ex){  //Exception,Throwable两个不用申明一个异常（throw new IOException()）就可以使用，不会报错(非受查异常可以不用申明，不会报错)
           ex.printStackTrace();
            }
        }
        public static void main(String[] args) {
        try{
            int a=5;
            int b=0;
            int c=a/b;
        }
        finally {
            System.out.println("------finally------");
        }
        System.out.println("------over------");  //over为程序正常结束,才能到over

    }
}
