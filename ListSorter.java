import java.util.Scanner;

class ListSorter 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    // takes in the array as user input
    System.out.println("Enter a length for your array:");
    int len = input.nextInt();
    
    String myArr[] = new String[len];
    input.nextLine();
  
    for(int i = 0; i < len; i++)
    {
      System.out.println("\nEnter a word for your array:");
      myArr[i] = input.nextLine();
    }
    System.out.println(""); //creats an empty line after last input

    // Sorts the array
    stringSort(myArr, 0, myArr.length-1);
    System.out.println("Sorted Array:");
    for(int i=0;i<myArr.length;i++)
    System.out.print(myArr[i]+ "\t");
  }

  public static void stringSort(String[] array, int start, int end)
  {
    if(start<end)
    {
      stringSort(array, start, (start+end)/2);
      stringSort(array, (start+end)/2+1,end);
      
      int i=(start+end)/2;
      int st=start;
      int j=i+1;
      int x=0;
      String arr[]=new String[end-start+1]; 

      while(start<=i && j<=end)
      {
        if(array[start].compareTo(array[j])<=0)
          arr[x++]=array[start++];
        else
          arr[x++]=array[j++];
      }

      // checks if all the values of the subarray are in temp sorted array
      while(start<=i)
      {
        arr[x++]=array[start++];
      }
      while(j<=end)
      {
        arr[x++]=array[j++];
      }

      for(int k=0;k<arr.length;k++)
      {
        array[st++]=arr[k];
      }
    }
    return;
  }
}