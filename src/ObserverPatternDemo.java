public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new Observer.HexaObserver(subject);
        new OctalObserver(subject);
        new Subject.BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}