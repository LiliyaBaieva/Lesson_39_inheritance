package HomeWork39;

public class Food {
  //  Создать класс Food (еда). В классе должны быть:
//  поле "название"
//  поле "калорийность"

  private String name;
  private int Calories;

  //  конструктор
  public Food(String name, int calories) {
    this.name = name;
    this.Calories = calories;
  }

  //  геттеры
  public String getName() {
    return name;
  }

  public int getCalories() {
    return Calories;
  }

  //  сеттеры
  public void setName(String name) {
    this.name = name;
  }

  public void setCalories(int calories) {
    Calories = calories;
  }

  //  метод "употребить еду" с каким-нибудь выводом
  public void eatFood() {
    System.out.printf("You eat %s (%d calories).", getName(), getCalories());
  }
}
