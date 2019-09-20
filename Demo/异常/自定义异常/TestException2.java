package 异常.自定义异常;
public class TestException2 {
    public static void main(String[] args) {
         Person p=new Person();
         try{
             p.setAge(101);
         }
        catch (Exception ex){
             ex.printStackTrace();
        }
    }
}
