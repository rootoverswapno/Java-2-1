package NKP_ALL_LAB_Problem;
class Ageindividiual extends Exception{
    public Ageindividiual(String message)
    {
        super(message);
    }
}

public class Problem_28 {
    public static void checkage(int age)
        throws Ageindividiual{
        if(age<0||age>120)
        {
            throw new Ageindividiual("Invalid age "+age);
        }
        else
        {
            System.out.println("Valid age "+age);
        }
    }

    public static void main(String[] args) {
        try {
            checkage(-5);
        }
        catch (Ageindividiual e)
        {
            System.out.println("Exception cauth "+e.getMessage());
        }
        try {
            checkage(20);
        }
        catch (Ageindividiual e)
        {
            System.out.println("Exception cauth "+e.getMessage());
        }
    }
}
