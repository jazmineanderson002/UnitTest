public class UnitTest
{
  private String weekDay;
  private String activity;

  public UnitTest(String weekDay, String activity)
  {
    this.weekDay = weekDay;
    this.activity = activity;
  }

  public String getWeekDay()
  {
    return weekDay;
  }

   public void dayActivity()
   {
     if(weekDay == "Monday" || weekDay == "Wednesday")
     {
        activity = "There is practice.";
     }
     if(weekDay == "Tuesday" || weekDay == "Thursday")
     {
       activity = "There is a club meeting.";
     }
     if(weekDay == "Friday" )
     {
       activity = "There is a game.";
     }
     if(weekDay == "Saturday" || weekDay == "Sunday")
     {
       activity = "It's the weekend.";
     }

   }
  public String getActivity()
  {
    return activity;
  }
  @Override
  public String toString()
  {
    return "It is " + weekDay + ". " +activity;
  }
}
