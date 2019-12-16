import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestTest
{
  @Test
  void testToString1()
  {
    UnitTest first = new UnitTest("Monday", "There is practice.");
    assertEquals("It is Monday. There is practice.", first.toString());
  }

  @Test
  void testToString2()
  {
    UnitTest second = new UnitTest("Wednesday", "There is practice.");
    assertEquals("It is Wednesday. There is practice.", second.toString());
  }

  @Test
  void testToString3()
  {
    UnitTest third = new UnitTest("Tuesday", "There is a club meeting.");
    assertEquals("It is Tuesday. There is a club meeting.", third.toString());
  }

  @Test
  void testToString4()
  {
    UnitTest fourth = new UnitTest("Thursday", "There is a club meeting.");
    assertEquals("It is Thursday. There is a club meeting.", fourth.toString());
  }

  @Test
  void testToString5()
  {
    UnitTest fifth = new UnitTest("Friday", "There is a game.");
    assertEquals("It is Friday. There is a game.", fifth.toString());
  }

  @Test
  void testToString6()
  {
    UnitTest sixth = new UnitTest("Saturday", "It's the weekend.");
    assertEquals("It is Saturday. It's the weekend.", sixth.toString());
  }

  @Test
  void testToString7()
  {
    UnitTest seventh = new UnitTest("Sunday", "It's the weekend.");
    assertEquals("It is Sunday. It's the weekend.", seventh.toString());
  }

  @Test
  void getWeekDay1()
  {
    UnitTest eight = new UnitTest("Sunday", "It's the weekend.");
    assertEquals("Sunday", eight.getWeekDay());
  }

  @Test
  void getWeekDay2()
  {
    UnitTest nine = new UnitTest("Monday", "There is practice.");
    assertEquals("Monday", nine.getWeekDay());
  }

  @Test
  void getWeekDay3()
  {
    UnitTest ten = new UnitTest("Wednesday", "There is practice.");
    assertEquals("Wednesday", ten.getWeekDay());
  }

  @Test
  void getWeekDay4()
  {
    UnitTest eleven = new UnitTest("Tuesday", "There is a club meeting.");
    assertEquals("Tuesday", eleven.getWeekDay());
  }

  @Test
  void getWeekDay5()
  {
    UnitTest tweleve = new UnitTest("Thursday", "There is a club meeting.");
    assertEquals("Thursday", tweleve.getWeekDay());
  }

  @Test
  void getWeekDay6()
  {
    UnitTest thirteen = new UnitTest("Friday", "There is a game.");
    assertEquals("Friday", thirteen.getWeekDay());
  }

  @Test
  void getWeekDay7()
  {
    UnitTest fourteen = new UnitTest("Saturday", "It's the weekend.");
    assertEquals("Saturday", fourteen.getWeekDay());
  }

  @Test
  void getActivity1()
  {
    UnitTest activity1 = new UnitTest("Monday", "There is practice.");
    assertEquals("There is practice.", activity1.getActivity());
  }

  @Test
  void getActivity2()
  {
    UnitTest activity2 = new UnitTest("Wednesday", "There is practice.");
    assertEquals("There is practice.", activity2.getActivity());
  }

  @Test
  void getActivity3()
  {
    UnitTest activity3 = new UnitTest("Tuesday", "There is a meeting.");
    assertEquals("There is a meeting.", activity3.getActivity());
  }

  @Test
  void getActivity4()
  {
    UnitTest activity4 = new UnitTest("Friday", "There is a game.");
    assertEquals("There is a game.", activity4.getActivity());
  }

  @Test
  void getActivity5()
  {
    UnitTest activity5 = new UnitTest("Saturday", "It's the weekend.");
    assertEquals("It's the weekend.", activity5.getActivity());
  }

  @Test
  void getActivity6()
  {
    UnitTest activity6 = new UnitTest("Sunday", "It's the weekend.");
    assertEquals("It's the weekend.", activity6.getActivity());
  }

}