package stepdefinitionseppem;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Seppeamstep {
	

	WebDriver driver;
	
	@Given("login user")
	public void login_user() throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://scandex.seppam.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}	
		
	    // Write code here that turns the phrase above into concrete actions
	    
	
@Then("enter the username")
	public void enter_the_username() {
	WebElement username=driver.findElement(By.id("emailAddress"));
	username.sendKeys("farid_scan@yahoo.com");
}
	    
		
@Then("enter the password")
	public void enter_the_password() {
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Otomate@123");
    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
@And("enter submit button")
	public void enter_submit_button() throws InterruptedException {
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(10000);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

@And("click the createtask button")
public void click_the_createtask_button() {
    // Write code here that turns the phrase above into concrete actions
 WebElement createtask= driver.findElement(By.xpath("//p[text()='Create task']"));
 createtask.click();
 
}

@And("enter task 	heading")
public void enter_task_heading() {
	WebElement taskheading=driver.findElement(By.xpath("//input[contains(@class,'text-black font-bold')]"));
	taskheading.sendKeys("Automation testing phase 1");
}
    
@And("Select the project")
public void select_the_project() {
    // Write code here that turns the phrase above into concrete actions
	Select project=new Select(driver.findElement(By.name("projectId")));
	project.selectByVisibleText("Accounts Activi...");
	
}
//@And("Select the initiator")
//public void select_the_initiator() throws InterruptedException {
//    // Write code here that turns the phrase above into concrete actions
//    Select initiator= new Select(driver.findElement(By.name("initiatorId")));
//    initiator.selectByVisibleText("Farid Ahmed");}
  @And ("Select the Priority")  
  public void select_the_priority() {
    Select priority=new Select(driver.findElement(By.name("priorityId")));
    priority.selectByVisibleText("OverWhelming");
}
@And("select the date")
public void select_the_date() {
    // Write code here that turns the phrase above into concrete actions
    WebElement sedate=driver.findElement(By.id("myDateInput"));
    sedate.sendKeys("15-05-2024");
}
@And("Enter the description")
public void enter_the_description() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    WebElement desc=driver.findElement(By.xpath("//textarea[contains(@class,'w-[536px] h-[86px]')]"));
    desc.sendKeys("test automation phase 2");
    Thread.sleep(7000);
}
@Then("Click create button")
public void click_create_button() {
    // Write code here that turns the phrase above into concrete actions
    WebElement ctask=driver.findElement(By.xpath("//button[text()='Create Task']"));
    ctask.click();
}

    @And("enter the message and send")
    public void enter_the_message_and_send() throws InterruptedException{
    	 FluentWait<WebDriver> wait = new FluentWait<>(driver);
    	 WebElement mes = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h2[text()='TESTPHASE2'])[2]")));
         mes.click();

         WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[contains(@class,'bg-white w-full')]")));
         message.sendKeys("hi jeevi i am AI");

         WebElement enter = driver.findElement(By.xpath("//img[@alt='composeIcon']"));
         enter.click();
        
    }
    	
//    	WebElement mes=driver.findElement(By.xpath("(//h2[text()='TESTPHASE2'])[2]"));
//    	mes.click();
//    	WebElement message=driver.findElement(By.xpath("//textarea[contains(@class,'bg-white w-full')]"));
//    	message.sendKeys("hi jeevi i am AI");
//    	WebElement enter=driver.findElement(By.xpath("//img[@alt='composeIcon']"));
//    	enter.click();
    //Add attachment
    @And("Add attachment")
    public void add_attachment() {
    	WebElement att=driver.findElement(By.xpath("(//div[@class='cursor-pointer']//div)[1]"));
    	att.sendKeys("\"C:\\Users\\Admin\\Downloads\\Seppam-Semantic (3) (1).csv\"");
    	att.click();
}
    @Given("click Tasktab")
    public void click_tasktab() {
    	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/section[2]/div[2]/a/div/div")).click();
    	}
        
    
    @Given("click start button and stop")
    public void click_start_button_and_stop() throws InterruptedException {
    	
        driver.findElement(By.xpath("(//span[contains(@class,'font-semibold min-w-[110px]')])[1]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'bg-white p-4')]//textarea[1]")).sendKeys("test automation");
       driver.findElement(By.xpath("//button[text()='Start']")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//span[text()='Stop']")).click();
       driver.findElement(By.name("comments")).sendKeys("test stop");
       driver.findElement(By.xpath("//button[text()='Stop']")).click();
       Thread.sleep(5000);
       
       
        
    }
    @Given("Click view button")
    public void click_view_button() throws InterruptedException {
    	
    	
    	System.out.println("view sucesss");
    	driver.findElement(By.xpath("(//span[contains(@class,'font-semibold inline')])[1]")).click();
    	
    }     
//    @Given("click subtask button")
//    public void click_subtask_button() {
//    	driver.findElement(By.xpath("//div[contains(@class,'cursor-pointer bg-secondary')]")).click();
//    	
//        
//    }
    @And("drop down thecard to change the status")
    public void drop_down_thecard_to_change_the_status() {

        WebElement to=driver.findElement(By.xpath("(//div[contains(@class,'flex flex-col')])[1]"));
        
    }
    @Given("Click the Timesheet tab")
    public void click_the_timesheet_tab() {
       WebElement timesheet=driver.findElement(By.xpath("(//div[contains(@class,'clipped-element w-[224px]')])[3]"));
       timesheet.click();
       
    }
    @Given("Select the Employee details")
   
    public void select_the_employee_details() throws InterruptedException {
        // Write code herese that turns the phrase above into concrete actions
        Select empoloyeename=new Select(driver.findElement(By.name("employeeName")));
        empoloyeename.selectByVisibleText("Farid Ahmed");
        Thread.sleep(2000);
    }
    @Given("Choose from date to date")
    public void choose_from_date_to_date() throws InterruptedException {
    	driver.findElement(By.xpath("(//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]//input)[1]")).sendKeys("05/09/2024");
  Thread.sleep(2000);
    	driver.findElement(By.xpath("(//label[text()='To Date']/following::input)[1]")).sendKeys("05/09/2024");
        
    }
    @Given("Click export button")
    public void click_export_button() {
    	WebElement export=driver.findElement(By.xpath("//button[text()='Export']"));
    	export.click();
    	WebElement download=driver.findElement(By.xpath("//li[text()='Download as CSV']"));
        download.click();
        
    }


}


    
