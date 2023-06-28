public class Program {
    public static void main(String[] args) throws Exception {
        Szamit szamit = new Szamit();
        try {

            double eredmeny = szamit.duplaz(-3.8);
            System.out.println("Eredmeny : " + eredmeny);
        } catch (NegativSzamException e) {
            System.out.println(e.getMessage());

        }

    }
}