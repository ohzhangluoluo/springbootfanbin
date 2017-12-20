package i18n.text;

import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		Locale[] locales=Locale.getAvailableLocales();
		
		for (Locale locale : locales) {
			/*System.out.println(locale.getDisplayCountry()+locale.getCountry());*/
			
			System.out.println(locale.getDisplayLanguage()+locale.getLanguage());
		}
	}
}
