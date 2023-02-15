import java.util.ArrayList;

public class Cat {
    private int age;
    private String name;
    private ArrayList<Cat> cats=new ArrayList<>();

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat() {

    }

    public void groups(Cat cat){
        cats.add(cat);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat cat(int age){
        for (Cat cat:cats) {
            if(cat.getAge()==age){
                return cat;
            }
        }
        return null;
    }
    public   Cat cat(String name){
        for (Cat cat:cats) {
            if(cat.getName().equals(name)){
                return cat;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cat " +
                " age: " + age +
                " name: " + name ;
    }
}
