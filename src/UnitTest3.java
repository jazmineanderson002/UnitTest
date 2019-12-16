public class UnitTest3
{
  private int myArray[];
  private String wordArray[][];

  private int sum;

  public UnitTest3(int myArray[])
  {
    this.myArray = myArray;
  }

  public int findSum()
  {
    for( int i : myArray)
    {
      sum += i;
    }
    return sum;
  }

  public UnitTest3(String wordArray[][])
  {
    this.wordArray = wordArray;
  }

  public String smallest()
  {
    String smallest = wordArray[0][0];
    for (int i = 0 ; i < wordArray.length ; i++)
    {
      for (int j = 0 ; j < wordArray[i].length ; j++)
      {
        if (wordArray[i][j].length() < smallest.length())
        {
          smallest = wordArray[i][j];
        }
      }
    }
    return smallest;
  }


}
