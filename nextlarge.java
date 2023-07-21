
class nextlarge
{
     
    public static void nextgreat(int[] input)
    {

        for (int i = 0; i < input.length; i++)
        {
             int next = -1;
 
            for (int j = i + 1; j < input.length; j++)
            {
                if (input[j] > input[i])
                {
                    next = input[j];
                    break;
                }
            }
 
            System.out.print(next + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int[] input = {1,0,2,1,5,15};
        nextgreat(input);
    }
}