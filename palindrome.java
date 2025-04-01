class palindrome{
    public static void main(String args[])
    {
        int num = 121;
        int rem = 0 , sum = 0 , ono = num;

        while( num > 0)
        {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        if( ono == num)
        {
            System.out.println(ono + " is a palindrome number!");
        }
        else{
            System.out.println(ono + " is not a palindrome number!");
        }
    }
}