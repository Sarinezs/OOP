class SuperClass {
    private int num = 1;

    protected int getNumber() {
        return num;
    }
}

class Subclass extends SuperClass {
    private int num = 10;

    public int getNumber() {
        return num + 5;
    }

    public static void main(String[] args) {
        Subclass s = new Subclass();
        System.out.println(s.getNumber());
    }
}