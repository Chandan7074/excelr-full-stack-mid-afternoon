package pack1;

public class Z1
{

        public static void main(String[] args)
        {
            System.out.println("main begin");
            try
            {
                System.out.println("try begin");
                main(args);
                System.out.println("try end");
            }
            catch (StackOverflowError ex)
            {
                System.out.println("from catch");
            }
            System.out.println("main end");
        }
    }


