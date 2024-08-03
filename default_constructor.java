public class default_constructor
{
    int addnumbers()
    {
        int x=5;
        int y=10;
        int z=25;
        int sum=x+y+z;
        return sum;

    }
    public static void main(String[] args)
    {
        default_constructor obj=new default_constructor();
        System.out.println(""+obj.addnumbers());
        


    }
}