package ms.springframework.proxy.cglib;

public class MyCalculator {
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
