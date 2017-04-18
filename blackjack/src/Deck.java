import java.util.List;

public class Deck {
  String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
  List<Card> cardsInDeck;

  public Deck(int numberOfCards) {

  }

  public void fillDeck(int numberOfCards) {
    int fillTill = Math.min(numberOfCards, 52);
    for (int i = 0; i < numberOfCards; i++) {
      cardsInDeck.add(new Card(colors[i % 4], values[i / 4]));
    }
  }
}
