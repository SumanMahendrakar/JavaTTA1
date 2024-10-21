package OCT_Tasks10;

public class Lab_10_09102024
{
    public static void main(String[] args)
    {
        int age = 24; // local variable
        System.out.println(age);
        {
            int age1 = 10;
            System.out.println(age1);
        }
        //System.out.println(age1); // not accessible
    }
}
