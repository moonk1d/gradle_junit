package patterns.builder;

public class App {

  public static void main(String[] args) {
    Cat cat = Cat.newBuilder().setColor("green").setName("Kitty").setAge(2).build();
    System.out.println(cat);
    Cat modifiedCat = cat.toBuilder().setName("ModifiedKitty").build();
    System.out.println(modifiedCat);
  }

}
