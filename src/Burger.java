public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Склад звичайного бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Склад дієтичного бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayo, String doubleMeat) {
        this.bun = bun;
        this.meat = meat + ", " + doubleMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Склад бургера з подвійним м'ясом: " + bun + ", " + this.meat + ", " + cheese + ", " + greens + ", " + mayo);
    }
}

