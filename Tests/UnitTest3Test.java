import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest3Test
{

  @Test
  void findSum()
  {
    int myArray[] = {1,4,9};
    UnitTest3 one = new UnitTest3(myArray);
    assertEquals(14, one.findSum());
  }

  @Test
  void findSum2()
  {
    int myArray[] = {-15,0,-23};
    UnitTest3 two = new UnitTest3(myArray);
    assertEquals(-38, two.findSum());
  }

  @Test
  void findSum3()
  {
    int myArray[] = {4356,9876,5895};
    UnitTest3 three = new UnitTest3(myArray);
    assertEquals(20127, three.findSum());
  }

  @Test
  void smallest()
  {
    String wordArray[][] = {{"dog","frog","elephant"},
                            {"monkey", "crow", "donkey"}};
    UnitTest3 word1 = new UnitTest3(wordArray);
    assertEquals("dog", word1.smallest());
  }
  @Test
  void smallest2()
  {
    String wordArray[][] = {{"Jazmine","Dylan","Sam"}, {"Timothy", "Victor", "Edgar"}};
    UnitTest3 word2 = new UnitTest3(wordArray);
    assertEquals("Sam", word2.smallest());
  }
  @Test
  void smallest3()
  {
    String wordArray[][] = {{"Ms.Rioux","Mr.Coopersmith","Mrs.DiCarlantonio"}, {"Mr.Racatain", "Ms.Johansen", "Mrs.Langley"}};
    UnitTest3 word3 = new UnitTest3(wordArray);
    assertEquals("Ms.Rioux", word3.smallest());
  }
  @Test
  void smallest4()
  {
    String wordArray[][] = {{"to","a","the"}, {"too", "are", "we"}};
    UnitTest3 word4 = new UnitTest3(wordArray);
    assertEquals("a", word4.smallest());
  }
}