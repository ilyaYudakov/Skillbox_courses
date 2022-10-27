public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(sumDigits(98765432));
    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here
        int result = 0;
        for(int i = 0;i < number.toString().length(); i++)
        {
            result += Integer.parseInt(Character.toString(number.toString().charAt(i)));
        }
        return result;
    }
}
