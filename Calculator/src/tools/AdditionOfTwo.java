package tools;

public class AdditionOfTwo { //expected to remove, only to test git push
    private int num1;
    private int num2;

    public AdditionOfTwo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getTotal() {
        return getNum1() + getNum2();
    }

    @Override
    public String toString() {
        return "The total is " + getTotal();
    }
}
