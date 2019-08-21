package 属性封装;
public class Student2 {
    String name;
    int age;
    String sex;
    String profession;
     public Student2(String sex,String profession){
         this.sex=sex;
         this.profession=profession;
     }
       public Student2(String name,int age,String sex,String profession){
         this.name=name;
         this.age=age;
         this.sex=sex;
         this.profession=profession;
       }
       public void SayHello(){
           System.out.println("大家好，我是一个"+this.sex+"，我的专业是"+this.profession+"。");
       }
       public void SayHello1(){
           System.out.println("大家好，我是"+this.name+"，我是一名可爱的高中"+this.sex+"，我今年"+this.age+"，我就读于于北京大学的"+this.profession+"专业"+"。");
       }
}
