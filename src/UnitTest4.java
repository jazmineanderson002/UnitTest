import java.util.ArrayList;
import java.util.Collections;

public class UnitTest4
{
  String num1, num2, num3;

  public UnitTest4(String num1, String num2, String num3)
  {
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
  }

  public String reverseOrder()
  {
    ArrayList<String> arrL = new ArrayList<String>();
    arrL.add(num1);
    arrL.add(num2);
    arrL.add(num3);
    while (arrL != null)
    {
      Collections.reverse(arrL);
      System.out.println("Results after reverse operation:");
      for (String str : arrL)
      {
        return str;
      }
    }
    return null;
  }
}
