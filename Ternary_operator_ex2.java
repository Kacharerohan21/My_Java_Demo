package JavaProject;

public class Ternary_operator_ex2 {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int t=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.print(t);
	}

}
