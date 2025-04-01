class armstrong{
    public static void main(String args[])
    {
        int num = 153;
        int rem = 0 , sum = 0 ,onum = num ;

        while( num > 0)
        {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if( sum == onum)
        {
            System.out.println(sum + " is a armstrong number!");
        }
        else{
            System.out.println(sum + " is not a armstrong number!");
        }
    }
}