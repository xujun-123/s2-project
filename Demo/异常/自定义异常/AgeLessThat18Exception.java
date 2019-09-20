package 异常.自定义异常;
public class AgeLessThat18Exception extends RuntimeException{
    public AgeLessThat18Exception(String message){
        super(message);
    }
    public AgeLessThat18Exception(){
        super("年龄不满18岁，出异常了!");//在子类里面可以默认一条错误消息
    }
}

