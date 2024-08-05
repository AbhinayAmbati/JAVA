package IteratorPattern;

public class EndUser {
    public static void main(String[] args) {
        String[] e = {"Hi","Hello","Hey"};
        KLList<String> kl1 = new KLList<String>(e);
        Iterator<String> klit1 = kl1.iterator();
        String n;
        while (klit1.hasNext()) {
            n=klit1.next();
            System.out.println(n);
        }
    }
}
