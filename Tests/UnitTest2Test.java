import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest2Test
{

  @Test
  void getAge()
  {
      UnitTest2 age1 = new UnitTest2(14, true);
      assertEquals(14, age1.getAge());
  }

  @Test
  void getAge2()
  {
    UnitTest2 age2 = new UnitTest2(0, true);
    assertEquals(0, age2.getAge());
  }
  @Test
  void getAge3()
  {
    UnitTest2 age3 = new UnitTest2(-67, true);
    assertEquals(-67, age3.getAge());
  }

  @Test
  void getAge4()
  {
    UnitTest2 age4 = new UnitTest2(97, true);
    assertEquals(97, age4.getAge());
  }

  @Test
  void isTeen()
  {
    UnitTest2 teen = new UnitTest2(13, true);
    assertEquals(true, teen.isTeen());
  }
  @Test
  void isTeen2()
  {
    UnitTest2 teen2 = new UnitTest2(45, false);
    assertEquals(false, teen2.isTeen());
  }
  @Test
  void isTeen3()
  {
    UnitTest2 teen3 = new UnitTest2(0, false);
    assertEquals(false, teen3.isTeen());
  }
  @Test
  void isTeen4()
  {
    UnitTest2 teen4 = new UnitTest2(19, true);
    assertEquals(true, teen4.isTeen());
  }
  @Test
  void testToString()
  {
    UnitTest2 one = new UnitTest2(14, true);
    assertEquals("14 true", one.toString());
  }
  @Test
  void testToString2()
  {
    UnitTest2 two = new UnitTest2(-2, false);
    assertEquals("-2 false", two.toString());
  }

  @Test
  void testToString3()
  {
    UnitTest2 three = new UnitTest2(325, false);
    assertEquals("325 false", three.toString());
  }

  @Test
  void testToString4()
  {
    UnitTest2 four = new UnitTest2(1, false);
    assertEquals("1 false", four.toString());
  }

  @Test
  void testToString5()
  {
    UnitTest2 five = new UnitTest2(19, true);
    assertEquals("19 true", five.toString());
  }
}