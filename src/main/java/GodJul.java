public class GodJul {

    public static void main(String[] args) {


        TomteNisse nisse1 = new TomteNisse("Nisse", 574);
        TomteNisse nisse2 = new TomteNisse("Tomas", 420);
        TomteNisse nisse3 = new TomteNisse("Tamara", 175);

        System.out.println("Dessa nissar har tomten:");
        System.out.println(nisse1.getName() + ", " + nisse1.getAge() + " år");
        System.out.println(nisse2.getName() + ", " + nisse2.getAge() + " år");
        System.out.println(nisse3.getName() + ", " + nisse3.getAge() + " år");

        System.out.println("Ho ho ho");

    }
}
