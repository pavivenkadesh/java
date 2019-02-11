class vowelconsonant {

    public static void main(String[] args) {

        char ch = 'a';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " vowel");
                break;
            default:
                if(ch>='a'&&ch<='z')
                System.out.println(ch + "consonant");
                else
                System.out.println(ch + " invalid");
                }
        
    }
}
