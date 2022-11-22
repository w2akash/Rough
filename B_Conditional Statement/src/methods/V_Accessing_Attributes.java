package methods;

public class V_Accessing_Attributes {
	int a = 4;
	int b;

	public static void main(String[] args) {
		V_Accessing_Attributes akki /* (Ref-name) */ = new V_Accessing_Attributes(); // created the object
		akki.b = 10; // ++ we can add or modify the attribute value.
		System.out.println(akki.a); // by using the dot syntax (.) we called attribute'a'
		System.out.println(akki.b); // by using the dot syntax (.) we called attribute'b'
	}

}
