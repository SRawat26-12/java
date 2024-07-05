class Remove {
    static void remove(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
            {
                t += s.charAt(i);
            }
        }
        System.out.println(t);
    }
 
    public static void main(String[] args) 
    {
        String s = "wel123come456india";
        remove(s);
    }
}