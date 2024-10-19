package 面向对象;

public class Person extends Animals{//继承
    public Person(int a,double b,String c){
        super(a,b,c);
    }
    public void benn(){
        System.out.println("我们该怎么称呼您？");
    }
    private String Name; //封装
    public String getName(){
        return Name;
    }
    public void setName(String Name){//内部类
        this.Name = Name;
    }

    
}
