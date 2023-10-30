package ro.uoradea;

public class Main() {
    public static void main(String[] args){
        Caine dog = new Caine("rexy","yorkshire");
        Caine dog2 = new Caine("tody","nustiu");
        System.out.println(dog.getNume());
        System.out.println(dog.getRasa());
        System.out.println(dog2.getNume());
        System.out.println(dog2.getRasa());
        dog.setNume("bob");
        System.out.println(dog.getNume());
        System.out.println(dog.getRasa());
    }
}
