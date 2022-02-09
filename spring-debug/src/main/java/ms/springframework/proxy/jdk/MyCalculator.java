package ms.springframework.proxy.jdk;

public class MyCalculator implements Calculator {
    public int add(int i, int j) {
		return i + j;
    }

    public int sub(int i, int j) {
        return i - j;
    }

    public int mult(int i, int j) {
        return i * j;
    }

    public int div(int i, int j) {
        return i / j;
    }
}