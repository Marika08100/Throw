public class Szamit {
    public double duplaz(double szam) throws NegativSzamException {
        if (szam < 0) {
            throw new NegativSzamException("A szam negativ!");
        }
        return 2 * szam;
    }
}

