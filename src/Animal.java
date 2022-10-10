public class Animal {
    private final String name;
    private static int counter;

    public Animal(String name){
        this.name = name;
        counter++;
    }

    void run(int distance){
        if (distance > 0) {
            System.out.println(getName() + " пробежал " + distance + " метров");
        } else {
            System.out.println("Неподходящее значение!");
        }
    }

    void swim(int distance){
        if (distance > 0) {
            System.out.println(getName() + " проплыл " + distance + " метров");
        } else {
            System.out.println("Неподходящее значение!");
        }
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }
}
