class Human1{
    private int age;
    private String name;

    public Human1()
    {
        age=12;
        name="john";
    }
    public Human1(int age,String name){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class constructor {
    public static void main(String[] args) {
    Human1 obj=new Human1();
        System.out.println("Name: "+obj.getName()+" age: "+obj.getAge());
    Human1 obj1=new Human1(21,"anurag");
        System.out.println("Name: "+obj1.getName()+" age: "+obj1.getAge());
    }
}
