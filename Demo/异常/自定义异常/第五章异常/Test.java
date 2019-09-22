package 异常.自定义异常.第五章异常;
import org.apache.log4j.*;
public class Test {
    private static final Logger logger=Logger.getLogger(Test.class);
    public static void main(String[] args) {
        try{
            int [] age=new int[5];
            System.out.println(age[5]);
        }
        catch (Exception ex){
            logger.debug("数组下标越界异常");
        }
    }
}
