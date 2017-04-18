import java.util.ArrayList;
import java.util.List;

public class Deck {
  String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
  List<Card> cardsInDeck;
  int[] nrOfColors = {0, 0, 0, 0};

  public Deck(int numberOfCards) {
    cardsInDeck = new ArrayList<>();
    this.fillDeck(numberOfCards);
    this.shuffle();
  }

  public Deck() {
    cardsInDeck = new ArrayList<>();
  }

  public void fillDeck(int numberOfCards) {
    int fillTill = Math.min(numberOfCards, 52);
    for (int i = 0; i < numberOfCards; i++) {
      cardsInDeck.add(new Card(colors[i % 4], values[i / 4]));
      nrOfColors[i % 4] += 1;
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

  public Card draw() {
    try {
      Card bufferCard = cardsInDeck.get(0);
      cardsInDeck.remove(0);
      return bufferCard;
    }
    catch (Exception e) {
      System.out.println("Deck is empty");
      return null;
    }
  }

  @Override
  public String toString()
  {
    // 12 cards -  3 Clubs, 3 Diamonds, 3 Hearts, 3 Spades
    return this.cardsInDeck.size() + " cards - " + nrOfColors[0] + "Clubs, " + nrOfColors[1] + "Diamonds, " + nrOfColors[2] + "Hearts, " + nrOfColors[3] + "Spades";
  }
}
