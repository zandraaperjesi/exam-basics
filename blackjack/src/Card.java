public class Card {
  String color;
  String value;

  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  @Override
  public String toString()
  {
    return this.value + " " + this.color;
  }
}
