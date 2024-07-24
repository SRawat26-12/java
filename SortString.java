class SortString 
   {
    public static void main(String[] args)
      {
        String str = "axbycz";
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++)
        {
            for (int j = 0; j < ch.length - 1 - i; j++)
            {
                if (ch[j] > ch[j + 1]) 
               {
                    char temp = ch[j + 1];
                    ch[j + 1] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        for (int i = 0; i < ch.length; i++)
        {
            System.out.print(ch[i]);
        }
    }
}