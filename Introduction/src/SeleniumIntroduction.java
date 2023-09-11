import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//chrome- chromeDriver---> Meathod - close get
		//WebDriver is interface
		//only use Driver methods not own created class method
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://63ba8d049e1fcc6872742187--rakesh-portfolio-react.netlify.app/");
		System.out.println(driver.getTitle());
		

	}

}
