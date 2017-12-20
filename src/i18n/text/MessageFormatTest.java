package i18n.text;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 * 占位符
 * @author Administrator
 *
 */
public class MessageFormatTest {

	public static void main(String[] args) {
		ResourceBundle rs=ResourceBundle.getBundle("i18n", Locale.CHINA);
		
		String hello=rs.getString("hello");
		System.out.println(hello);
		hello=MessageFormat.format(hello,new Object[]{"zhangsan"});
		System.out.println(hello);
		
		String world=rs.getString("world");
		System.out.println(world);
		world=MessageFormat.format(world,new Object[]{"李四"});
		System.out.println(world);
	}
}
