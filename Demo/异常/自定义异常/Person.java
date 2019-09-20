package 异常.自定义异常;
public class Person {
    public void setAge(int age) throws Common{
        if(age>=100){
            throw new Common("年龄必须在1到100之间！");
        }
    }
}
