public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver ho = new   HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        ho.detach(subject);

        System.out.println("Second state change: 10");
        subject.setState(10);

    }
}