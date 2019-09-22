package 异常.自定义异常.第五章异常;
public class People {
    public void doplay(){
        int [] nums=new int[5];
        throw new ArrayIndexOutOfBoundsException("数组下标越界异常");
    }

    public static void main(String[] args) {
        People p=new People();
        try{
            p.doplay();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }


    }
}
