public class Runner {
    public static void main(String[] args) {
        AdditionPattern test = new AdditionPattern(5, 6);
        System.out.print(test.currentNum());
        test.next();
        test.next();
        System.out.print(test.currentNum());
        test.prev();
    }
}
