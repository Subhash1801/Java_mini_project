public class User {
  private String name;
  private int age;
  private double height;
  private double weight;
  private String gender;

  public User(String name, int age, double height, double weight, String gender) {
      this.name = name;
      this.age = age;
      this.height = height;
      this.weight = weight;
      this.gender = gender;
  }

  // Getters and Setters
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public int getAge() { return age; }
  public void setAge(int age) { this.age = age; }

  public double getHeight() { return height; }
  public void setHeight(double height) { this.height = height; }

  public double getWeight() { return weight; }
  public void setWeight(double weight) { this.weight = weight; }

  public String getGender() { return gender; }
  public void setGender(String gender) { this.gender = gender; }
}
