public class TomteNisse {

    static String name;
    int years;

    public TomteNisse(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public static String getName() {
        return name;
    }

    public int getAge () {
        return years;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}
