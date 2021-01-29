public class Statistics
{
  //instance variables
  private static int count = 0;
  double firstNum;
  double secondNum;
  double thirdNum;
  
  //initalizes variables : no param
  public Statistics()
  {
    firstNum = 0;
    secondNum = 0;
    thirdNum = 0;
  }

  //initalizes variables : doubOne = 
  public Statistics(double doubOne, double doubTwo, double doubThree)
  {
    firstNum = doubOne;
    secondNum = doubTwo;
    thirdNum = doubThree;
  }

  //calculates the lowest value : num1 = value, num2 = value
  public double min(double num1, double num2)
  {
    firstNum = num1;
    secondNum = num2;
    double min = 0;
    if(firstNum > secondNum)
    {
      min = secondNum;
    }
    else
    {
      min = firstNum;
    }
    count++;
    return min;
  }

  //calculates the greatest value: num1 = value, num2 = value
  public double max(double num1, double num2)
  {
    firstNum = num1;
    secondNum = num2;
    double max = 0.0;
    if(num2 > num1){
      max = num2;   
    }else{
      max = num1;
    }
    count++;
   return max;
  }
  
  //calculates the average: numOne = one value, numTwo = two value, numThree = third value
  public double average(double numOne, double numTwo, double numThree)
  {
    firstNum = numOne;
    secondNum = numTwo;
    thirdNum = numThree;
    double average = 0;
    average = (firstNum + secondNum + thirdNum) / 3;
    count++;
    return average;
  }
}