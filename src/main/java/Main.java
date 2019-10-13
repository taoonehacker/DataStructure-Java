public class Main {
    public static void main(String[] args) {
        Array array = new Array(20);

        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }

        System.out.println(array);

        TArray<Student> tArray = new TArray<>();

        tArray.addLast(new Student("Alice",100));
        tArray.addLast(new Student("Bob",80));
        tArray.addLast(new Student("Charlie",88));

        System.out.println(tArray);

    }
}
