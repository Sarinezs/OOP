// package week3;

class A{
    int x = 10, y = 5;
    void methodA(int a, int b){
        a = x;
        b = y;

        // System.out.println("var1(in class A) = "+a);
        // System.out.println("var2(in class A) = "+b);

        printA(a, b);
    }

    void printA(int a, int b){
        System.out.println("var1(in class A) = "+a);
        System.out.println("var2(in class A) = "+b);
    }
}

public class test {
    public static void main(String[] args){
        int var1, var2;
        A objA = new A();
        var1 = 5;
        var2 = 5;
        System.out.println("var1(before) = "+var1);
        System.out.println("var2(before) = "+var2);
        objA.methodA(var1, var2);
        // System.out.println("var1(after) = "+var1);
        // System.out.println("var2(after) = "+var2);
        // objA.printA(var1, var2);
    }
}
