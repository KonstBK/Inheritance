public class Cat extends Animal {
    private static final int RUNNING_RESTRICTION = 200;
    private static final int SWIMMING_RESTRICTION = 0;
    private static int counter;

    public Cat(String name) {
        super(name);
        counter++;
    }

    @Override
    void run(int distance) {
        if (distance >= RUNNING_RESTRICTION){
            System.out.println("Котик не может столько пробежать =(");
        }else super.run(distance);
    }

    @Override
    void swim(int distance) {
        System.out.println("Действие невозможно! Котики не умеют плавать =( SWIMMIN_RESTRICITON = " + SWIMMING_RESTRICTION);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public static int getCounter() {
        return counter;
    }
}
