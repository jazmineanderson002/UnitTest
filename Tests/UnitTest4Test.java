import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest4Test
{
  @Test
  void reverseOrder()
  {

    UnitTest4 one = new UnitTest4("19", "21", "35");
    assertEquals("35", one.reverseOrder());

  }

}