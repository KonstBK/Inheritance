public class Dog extends Animal {
    private static final int RUNNING_RESTRICTION = 500;
    private static final int SWIMMING_RESTRICTION = 10;
    private static int counter;

    public Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    void run(int distance) {
        if (distance >= RUNNING_RESTRICTION){
            System.out.println("Пёсики не могут столько пробежать =(");
        }else super.run(distance);
    }

    @Override
    void swim(int distance) {
        if (distance >= SWIMMING_RESTRICTION){
            System.out.println("Пёсики не могут столько проплыть =(");
        }else super.swim(distance);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public static int getCounter() {
        return counter;
    }
}
