
	package ecom;

	import org.openqa.selenium.remote.DesiredCapabilities;

	import java.net.MalformedURLException;
	import java.net.URL;

	public class LaunchStandalone {

	    public static void main(String[] args) throws MalformedURLException {

	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability("platformName", "Windows");
	        cap.setCapability("deviceName", "Windows PC");
	        cap.setCapability("app", "Microsoft.WindowsNotepad_8wekyb3d8bbwe!App");

	        WindowsDriver driver = new WindowsDriver(new URL("http://localhost:4723/wd/hub"), cap);


	    }
	


}
