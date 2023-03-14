package HomeWork39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Food{
  //  Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
//  поле "газированный" (да/нет)
//  поле "алкогольный" (да/нет)
  private boolean gas;
  private boolean alcohol;

  public Drink(String name, int calories, boolean gas, boolean alcohol){
    super(name, calories);
    this.gas = gas;
    this.alcohol = alcohol;
  }
  //  метод "открыть", который:
//  для газированного напитка печатает "пшш",
//  для негазированного - "скр",
//  а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.

  public void openDrink() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int age = Integer.parseInt(br.readLine());

    // Я так поняла по условию:
    // что это один напиток, который может быть алкогольным (или нет)
    // и газированным (или нет)

    if(age > 18){
      String sound = gas ? "пшш" : "скр";
      System.out.println(sound);
    }
  }


}
