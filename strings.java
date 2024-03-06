class Scratch {
    public static void main(String[] args) {
        String name = "Maciej";
        String lowerName = name.toLowerCase();
        int length = name.length();
        String text = "  Java to najelpszy jezyk programowania.  ";
        String text2 = text.replace(" ", "-");
        String text3 = text.strip();

        System.out.println(name);
        System.out.println(lowerName);
        System.out.println(length);
        System.out.println(text2);
        System.out.println(text3);

        boolean startsWith = name.startsWith("M");
        System.out.println(startsWith);

        text = text.strip().toUpperCase().substring(5);
        System.out.println(text);
    }
}