public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if (tonerLevel > 100){
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (((tonerAmount + tonerAmount) < 0) || ((tonerAmount + tonerAmount) > 100)) {
            return -1;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        if (duplex) {
            pagesPrinted = (pages / 2) + (pages % 2); //make sure that instance where pagesPrinted = 3.4 will not get 3 but 4
            return pagesPrinted;
        } else {
            pagesPrinted = pages;
            return pagesPrinted;
        }
    }
}

    // Boxing
    int primitiveInt = 5;
    Integer wrappedInt = Integer.valueOf(primitiveInt); // or simply Integer wrappedInt = primitiveInt; (autoboxing)

    // Unboxing
    Integer anotherWrappedInt = new Integer(10);
    int anotherPrimitiveInt = anotherWrappedInt.intValue(); // or simply int anotherPrimitiveInt = anotherWrappedInt; (auto-unboxing)
