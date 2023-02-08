package day3;

public class HandleString {

    public HandleString() {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("length: " + txt.length());
        System.out.println("replace: " + txt.replace("AB", "ab"));
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("MNOP"));

        String x = "10";
        int y = 20;
        System.out.println(x + y);
    }
}
