package singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

  private static final long serialVersionUID = 123123123;

  private static final Singleton instance = new Singleton();

  private Singleton() {}

  public static Singleton getInstance() {
    return instance;
  }

  protected Object readResolve() {
    return getInstance();
  }
}
