package patterns.builder;

public final class Cat {

  private String name;
  private String color;
  private int age;

  public boolean hasName() {
    return !(this.name == null);
  }

  public boolean hasColor() {
    return !(this.color == null);
  }

  /**
   * Assumes that value exists if values != default values for the type
   */
  public boolean hasAge() {
    return !(this.age == 0);
  }

  public static Builder newBuilder() {
    return new Cat.Builder();
  }

  public Builder toBuilder() {
    return new Cat.Builder().mergeFrom(this);
  }

  @Override
  public String toString() {
    return "patterns.builder.Cat{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", age=" + age +
        '}';
  }

  static class Builder {

    private final Cat cat = new Cat();

    private Builder() {
    }

    protected Builder setName(String name) {
      cat.name = name;
      return this;
    }

    protected boolean hasName() {
      return cat.hasName();
    }

    protected Builder setColor(String color) {
      cat.color = color;
      return this;
    }

    protected boolean hasColor() {
      return cat.hasColor();
    }

    protected Builder setAge(int age) {
      cat.age = age;
      return this;
    }

    protected boolean hasAge() {
      return !(cat.age == 0);
    }

    protected Cat build() {
      return cat;
    }

    private Builder mergeFrom(Cat cat) {
      if (cat.hasName()) {
        setName(cat.name);
      }

      if (cat.hasColor()) {
        setColor(cat.color);
      }

      if (cat.hasAge()) {
        setAge(cat.age);
      }

      return this;
    }

  }

}
