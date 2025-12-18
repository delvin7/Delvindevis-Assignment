class CaseConvert {
    public static void main(String[] args) {
        String s = "Java";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                System.out.print((char)(ch - 32));
            else
                System.out.print((char)(ch + 32));
        }
    }
}
