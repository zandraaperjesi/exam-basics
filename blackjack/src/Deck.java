import java.util.ArrayList;
import java.util.List;

public class Deck {
  String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
  List<Card> cardsInDeck;

  public Deck(int numberOfCards) {
    cardsInDeck = new ArrayList<>();
  }

  public Deck() {
    cardsInDeck = new ArrayList<>();
  }

  public void fillDeck(int numberOfCards) {
    int fillTill = Math.min(numberOfCards, 52);
    for (int i = 0; i < numberOfCards; i++) {
      cardsInDeck.add(new Card(colors[i % 4], values[i / 4]));
    }
  }

  public void shuffle() {
    List<Card> buffer = new ArrayList<>();
    while(cardsInDeck.size() > 0) {
      int pick = (int) (Math.random() * cardsInDeck.size());
      buffer.add(cardsInDeck.get(pick));
      cardsInDeck.remove(pick);
    }
    cardsInDeck = buffer;
  }
}
