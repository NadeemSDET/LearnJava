
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
package Session01;

public class students {
	
	String name="Nadeem";
	int num=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadee\\Desktop\\EclipseFolder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*students obj=new students();
		String Name=obj.name;
		int Number=obj.num;
		System.out.println("Name Is :" + Name);
		System.out.println("Number is : " + Number);*/

	}

}
