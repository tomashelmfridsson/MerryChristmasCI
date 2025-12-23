public class TomteNisse {
    String namn;
    int years;

    public TomteNisse(String namn, int years) {
        this.namn = namn;
        this.years = years;
    }

    public String getNamn() {
        return namn;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return "TomteNisse{" +
                "namn='" + namn + '\'' +
                ", years=" + years +
                '}';
    }
}
