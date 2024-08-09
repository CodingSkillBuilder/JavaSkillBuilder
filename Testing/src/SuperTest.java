public abstract class SuperTest {
    private int cat = 1234;

    public SuperTest(int cat){
        this.cat = cat;
    }
}

class newClass extends SuperTest{

    public newClass(int cat) {
        super(cat);
    }
}
