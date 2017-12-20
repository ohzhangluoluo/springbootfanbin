package i18n.text;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
	public static void main(String[] args) {
		ResourceBundle rb=ResourceBundle.getBundle("i18n",Locale.US);
		
		String hello=rb.getString("hello");
		System.out.println(hello);
	}
}
