public class Dog {

  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
    speak();
  }
  public void speak() {
    System.out.println("i am " + this.name + " and i am " + age + " and " + add2());
  }
  public void setAge(int age) {
    this.age = age;
  }
  private int add2() {
    return this.age + 2;
  }

}
