public class GodJul {
    public static void main(String[] args) {
        TomteNisse tomas = new TomteNisse("Tomas", 50);
        System.out.println("Den här Nissen heter "+tomas.getName());
        System.out.println(tomas.getName() + " är " +tomas.getYears());
        tomas.changeName("Bob");
        System.out.println("Nu heter Nissen "+tomas.getName());
    }

}
