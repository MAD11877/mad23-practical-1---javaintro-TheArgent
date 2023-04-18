import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    System.out.print("Input the number of integers you will be entering: ");
    int integers = in.nextInt();
    int[] nums = new int[integers];
    for(int i=0;i<integers;i++){
      System.out.print("Input your number: ");
      int number = in.nextInt();
      nums[i] = number;
    }

    int count = 0;
    int frequent =0;

    for(int i=0;i<integers;i++){
      int tempcount = 0;
      for(int j=i;j<(integers);j++){

        if(nums[i]==nums[j]){
          tempcount += 1;
        }
      }
      if (tempcount > count){
        count = tempcount;
        frequent = nums[i];
      }
    }

    System.out.println("The most frequent integer is " + frequent);
    
  }
}
