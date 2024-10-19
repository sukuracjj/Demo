package 面向对象;
import java.util.Scanner;
public class People {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Person a = new Person(18,175,"男");
        a.benn();
        a.setName(in.nextLine());
        System.out.print(">>已自动生成你的资料<<\n");
        System.out.println("姓名："+a.getName()+"\n"+"年龄： "+a.age);
        System.out.println("性别："+a.sex);
        System.out.println("身高："+a.Height);
        in.close();
    }
}
