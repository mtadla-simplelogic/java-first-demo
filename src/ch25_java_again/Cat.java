package ch25_java_again;

public class Cat extends Animal  {
    int jumpHeight;

    public Cat(String name, int jumpHeight) {
        super(name);
        this.jumpHeight = jumpHeight;
    }

    public void meow(){
        System.out.println("moow " + name + " " + jumpHeight);
    }
}
