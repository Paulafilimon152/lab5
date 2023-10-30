package ro.uoradea;
public class Main{
public static void main(String[] args)
        {
        Dog dog1=new Dog("Cara" , "yorkshire");
        Dog dog2=new Dog(  "Bella",  "visla");
        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(dog2.getName());
        System.out.println(dog2.getBreed());
        dog1.setName("maria");
        dog2.setBreed("ana");
                System.out.println(dog1.getName());
                System.out.println(dog1.getBreed());
                System.out.println(dog2.getName());
                System.out.println(dog2.getBreed());
        }
}