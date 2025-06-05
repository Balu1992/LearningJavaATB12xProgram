public class MostRepeated {
    public static void main(String[] args)
    {
        int[] arr={1,3,4,1,1};

        int maxcount=0;
        int mostrepeated=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count > maxcount)
            {
                maxcount=count;
                mostrepeated=arr[i];
            }
        }
        System.out.println("Mostrepeated:"+mostrepeated);
        System.out.println("Occurences:"+maxcount);
    }
}
