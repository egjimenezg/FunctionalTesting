import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

environments{

  chrome{
    driver = {
      def driverInstance = new ChromeDriver()
      driverInstance.manage().window().maximize()
      driverInstance
    }
  }

  firefox{
    driver = {
      def driverInstance = new FirefoxDriver()
      driverInstance.manage().window().maximize()
      driverInstance
    }
  }

}

baseUrl = "http://makingdevs.com"
