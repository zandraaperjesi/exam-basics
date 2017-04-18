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
    List<Double> varied = new ArrayList<>();
    varied.add(1.0);
    varied.add(5.0);
    varied.add(4.0);
    assertEquals(3.0, test.oddAverage(varied));
  }

}