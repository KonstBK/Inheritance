public class Main {
    public static void main(String[] args) {
        Cat barsikCat = new Cat("Барсик");
        barsikCat.run(199);
        barsikCat.swim(5);

        Cat pushokCat = new Cat("Пушок");
        pushokCat.run(200);
        pushokCat.swim(4);

        Cat chernishCat = new Cat("Черныш");
        chernishCat.run(100);
        chernishCat.swim(3);

        Dog sharikDog = new Dog("Шарик");
        sharikDog.run(250);
        sharikDog.swim(9);

        Dog balooDog = new Dog("Балу");
        balooDog.run(500);
        balooDog.swim(5);

        Dog baltoDog = new Dog("Балто");
        baltoDog.run(100);
        baltoDog.swim(10);

        System.out.println("Количество всех животных: " + Animal.getCounter() +  "\nКоличество котов: " +
                Cat.getCounter() +  "\nКоличество собак: " + Dog.getCounter());
    }
}
