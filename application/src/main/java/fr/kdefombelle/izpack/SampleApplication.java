package fr.kdefombelle.izpack;

/**
 * Hello world!
 */
public class SampleApplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            new SampleApplicationBean("default");
        } else {
            new SampleApplicationBean(args[0]);
        }
    }
}
