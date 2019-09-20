package 异常.自定义异常;
public class Test {
    public static void main(String[] args) {
        NetBar nb=new NetBar();
        try{
            nb.enter(17);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
