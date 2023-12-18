package pack1;

 class A
{
    public static void main(String[] args)
    {
        System.out.println("done: " + args);
    }
}
//command line arguments
//if you are printing the reference you will get object's memory Location like classname@hascode in the form of hexadecimle
//at the time of running a program, we can pass some arguments to the program, that is  we can call command line argument.
//while running program even jvm also  a default empty String array object as an argument to the main method of a class