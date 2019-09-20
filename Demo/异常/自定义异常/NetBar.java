package 异常.自定义异常;
public class NetBar {
    public void enter(int age){
        if(age<18)
        {
            throw new AgeLessThat18Exception();  //也可以自己手动定义AgeLessThat18Exception();
        }
        System.out.println("=========欢迎光临，开始上网");
    }
}
