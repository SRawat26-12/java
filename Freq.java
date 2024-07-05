public class Freq {

    public static void main(String[] args) {
        String str = "This is a test string.";
        char ch = 'i';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}