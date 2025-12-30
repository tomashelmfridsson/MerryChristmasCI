public class TomteNisse {

    static String name;
    int years;

    public TomteNisse(String name, int years) {
        TomteNisse.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public int getAge () {
        return years;
    }

    public void changeName(String newName) {
        name = newName;
    }

}
