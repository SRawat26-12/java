class Upper{
     
    // Method to convert characters 
    // of a string to opposite case
    static void convertOpposite(StringBuilder str)
    {
        int ln = str.Length;
             
        // Conversion according to ASCII values
        for (int i=0; i<ln; i++)
        {
            if (str[i]>='a' && str[i]<='z')
             
                //Convert lowercase to uppercase
                str[i] = (char)(str[i] - 32);
                 
            else if(str[i]>='A' && str[i]<='Z')
             
                //Convert uppercase to lowercase
                str[i] = (char)(str[i] + 32);
        }
    }
     
    // Driver code
    public static void main(String []args) 
    {
        StringBuilder str = new StringBuilder("GeEkSfOrGeEkS");
        // Calling the Method
        convertOpposite(str);
        System.out.println(str);
        }
}