package day2;

public class Loop {
    public Loop() {
        this.LoopFor();
        this.LoopWhile();
    }

    public void LoopFor()
    {
        String[] cars = {"Xin", "Chào", "Cả", "Nhà"};
        String str = "";

        for (String txt: cars) {
            if (str != "") {
                str = str + " ";
            }
            str = str + txt;
        }
        System.out.println(str);
    }

    public void LoopWhile() {
        String[] cars = {"Xin", "Chào", "Cả", "Nhà"};
        String str = "";
        int i = 0;
        System.out.println("Begin loop do while");
        do {
            if (i != 0) {
                str = str + " -> ";
            }
            str = str + cars[i];
            i++;
        } while (i < cars.length);
        System.out.println(str);

        str = "";
        i = 0;
        System.out.println("Begin loop while");
        while (i < cars.length) {
            if (i != 0) {
                str = str + " ->> ";
            }
            str = str + cars[i];
            i++;
        }
        System.out.println(str);
    }
}
