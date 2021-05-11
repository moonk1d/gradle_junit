package patterns.factory.ver1;

public abstract class Animal {

  public static Animal createAnimal(Type type) {
    switch (type) {
      case CAT:
        return new Cat();
      case DOG:
        return new Dog();
      default:
        throw new RuntimeException();
    }
  }

  public abstract void talk();

  enum Type {
    CAT,
    DOG
  }

}
