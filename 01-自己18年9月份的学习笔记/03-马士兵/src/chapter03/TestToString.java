package chapter03;

public class TestToString {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		System.out.println("d:=" + d);
	}
}

class Dog1 {
	public String toString() {
		return "I'm a cool dog!";
	}
}