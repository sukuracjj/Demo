package 面向对象;

public class Person extends Animals{
    public Person(int a,double b,String c){
        super(a,b,c);
    }
    private String Name;
    
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    
}
