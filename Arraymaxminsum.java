public class Arraymaxminsum {


    public static void main(String[] args)
    {
        int[] arr= {0,50,90,-1,70};
        maximumElement(arr);
        minimumElement(arr);
        sumOfElements(arr);

    }

    public static void maximumElement(int[] array)
        {
            int max = array[0];
            for(int i =0; i< array.length ;i++)
            {
                if(array[i]>max)
                {
                    max =array[i];
                }
            }

            System.out.println("largest element is " +max);

        }


    public static void minimumElement(int[] array)
    {
        int min = array[0];
        for(int i =0; i< array.length ;i++)
        {
            if(array[i]< min)
            {
                min =array[i];
            }
        }

        System.out.println("smallest element is " +min);

    }

    public static void sumOfElements(int[] array)
    {
        int sum =0;
        for(int i=0; i< array.length ; i++)
        {
            sum += array[i];
        }

        System.out.println("sum of all elements is " +sum);
    }

}
