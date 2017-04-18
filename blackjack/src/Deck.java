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

  public void countColors(List<Card> cardsToCount) {
    int[] colorBuffer = {0, 0, 0, 0};
    for(Card c : cardsToCount) {
      if (c.color.equals("Clubs")) {
        colorBuffer[0] += 1;
      }
      else if (c.color.equals("Diamonds")) {
        colorBuffer[1] += 1;
      }
      else if (c.color.equals("Hearts")) {
        colorBuffer[2] += 1;
      }
      else {
        colorBuffer[3] += 1;
      }
    }
    nrOfColors = colorBuffer;
  }

  public void fillDeck(int numberOfCards) {
    int fillTill = Math.min(numberOfCards, 52);
    for (int i = 0; i < fillTill; i++) {
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
      this.countColors(cardsInDeck);
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
    return this.cardsInDeck.size() + " cards - " + nrOfColors[0] + " Clubs, " + nrOfColors[1] + " Diamonds, " + nrOfColors[2] + " Hearts, " + nrOfColors[3] + " Spades";
  }
}
