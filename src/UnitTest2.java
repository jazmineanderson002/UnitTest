public class UnitTest2
{

  private int age;
  private boolean teen;

  public UnitTest2(int age, boolean teen)
  {
    this.age = age;
    this.teen = teen;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public boolean isTeen()
  {
    if(age >= 13 && age <= 19)
    {
      teen = true;
      return teen;
    }
    else
      teen = false;
    return teen;
  }

  @Override
  public String toString()
  {
    return age + " " + teen;
  }
}
