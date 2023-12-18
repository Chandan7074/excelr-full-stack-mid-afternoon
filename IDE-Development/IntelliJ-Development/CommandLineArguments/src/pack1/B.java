package pack1;

public class B
{
    public static void main(String[] args)
    {
        System.out.println("done: " + args);
        for (String str : args)
        {
            System.out.println(str);
        }
        System.out.println("Total number of arguments that you have passed: " + args.length);
    }
}
