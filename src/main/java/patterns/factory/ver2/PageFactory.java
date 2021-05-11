package patterns.factory.ver2;

public final class PageFactory {

  public static <T extends Page> T getPage(Class<T> clazz) {
    try {
      return clazz.getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }

}
