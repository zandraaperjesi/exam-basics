import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddAvgTest {
  OddAvg test = new OddAvg();

  @org.junit.jupiter.api.Test
  void main() {
  }

  @org.junit.jupiter.api.Test
  void testForVaried() {
    List<Integer> varied = new ArrayList<>();
    varied.add(1);
    varied.add(5);
    varied.add(4);
    assertEquals(3.0, test.oddAverage(varied));
  }

  @org.junit.jupiter.api.Test
  void testForOdd() {
    List<Integer> odd = new ArrayList<>();
    odd.add(1);
    odd.add(5);
    odd.add(9);
    assertEquals(5, test.oddAverage(odd));
  }

  @org.junit.jupiter.api.Test
  void testForEven() {
    List<Integer> even = new ArrayList<>();
    even.add(6);
    even.add(8);
    even.add(12);
    assertEquals(0, test.oddAverage(even));
  }

  @org.junit.jupiter.api.Test
  void testForEmpty() {
    List<Integer> empty = new ArrayList<>();
    assertEquals(0, test.oddAverage(empty));
  }
}
