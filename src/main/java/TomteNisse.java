public class TomteNisse {
    static String namn;
    int years;

    public TomteNisse(String namn, int years) {
        this.namn = namn;
        this.years = years;
    }

    public String getName() {
        return namn;
    }

    public int getYears() {
        return years;
    }

    public void changeName(String newName) {
        this.namn = newName;
    }
}
