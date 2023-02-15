public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat(2,"tich2");
        Cat cat2=new Cat(3,"tich3");
        Cat cat3=new Cat(4,"tich4");
        Cat cat4=new Cat(1,"tich1");
        cat.groups(cat);
        cat.groups(cat2);
        cat.groups(cat3);
        cat.groups(cat4);
        System.out.println(cat.cat(2));
        System.out.println(cat.cat("tich3"));
    }
}