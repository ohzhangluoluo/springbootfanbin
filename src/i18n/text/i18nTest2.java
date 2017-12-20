package i18n.text;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class i18nTest2 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ResourceBundle rb=null;
		System.out.print(" ‰»Î£∫");
		String bundle=in.next();
		
		if(bundle.equals("en_US")){
			rb=ResourceBundle.getBundle("i18n",Locale.US);
		}else if(bundle.equals("zh_CN")){
			rb=ResourceBundle.getBundle("i18n",Locale.CHINA);
		}
		
		String value=rb.getString("value");
		System.out.println(value);
		
	}

}
