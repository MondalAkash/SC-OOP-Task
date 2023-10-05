public class Main {
    public static void evenOdd(int[] arr)
    {
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println("Even no.: "+arr[i]);
            }
            else
            {
                System.out.println("Odd no.: "+arr[i]);
            }
        }
    }
    public static void findNemo(String word)
    {
        String[] arrayWord = word.split(" ");
        //String[] split = new String[50];
        for(int i = 0; i< arrayWord.length; i++)
        {
            //System.out.println(arrayWord[i]);
            if(arrayWord[i].contains("Nemo"))
            {
                System.out.println("I found Nemo at: "+(i+1));
                break;
            }
        }
    }
    public static void main(String[] args) {
        findNemo("I am finding Nemo !");
        findNemo("Nemo is me");
        findNemo("I Nemo am");
        int[] arr = {61,20,10,77,30};
        evenOdd(arr);


    }
}
