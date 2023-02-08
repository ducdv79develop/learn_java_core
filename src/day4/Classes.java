package day4;

public class Classes {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public Classes() {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y + myOuter.x);

        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }

    static class OuterClass {
        int x = 10;

        static class InnerClass {
            int y = 5;
        }
    }
}