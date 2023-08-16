package Com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.adactin.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
public static WebDriver driver = TestRunner.driver;

@Given("^user Launch The Web Application$")
public void user_Launch_The_Web_Application() throws Throwable {
	driver.get("https://adactinhotelapp.com/");
    
}

@When("^user Enter The Username In Username Field$")
public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Ranjith270697");
}

@When("^user Enter The Password In password Field$")
public void user_Enter_The_Password_In_password_Field() throws Throwable {
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("1W7185");
}

@Then("^user Click The Login Button and Navigates ToSearch Hotel Page$")
public void user_Click_The_Login_Button_and_Navigates_ToSearch_Hotel_Page() throws Throwable {
	WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
	login.click();
}

@When("^user Select The Location$")
public void user_Select_The_Location() throws Throwable {
	WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
	location.click();
	Select tk = new Select(location);
	tk.selectByVisibleText("New York");
}

@When("^user Select The Room Type$")
public void user_Select_The_Room_Type() throws Throwable {
	WebElement roomtype = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
	roomtype.click();
	Select rt = new Select(roomtype);
	rt.selectByVisibleText("Super Deluxe");
}

@When("^user Select The Number of Rooms$")
public void user_Select_The_Number_of_Rooms() throws Throwable {
	WebElement noroom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
	noroom.click();
	Select nr = new Select(noroom);
	nr.selectByVisibleText("4 - Four");
     
}

@When("^user Select The Check In Date$")
public void user_Select_The_Check_In_Date() throws Throwable {
	WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	checkin.clear();
	checkin.sendKeys("25/06/2023");
}

@When("^user Select The Check Out Date$")
public void user_Select_The_Check_Out_Date() throws Throwable {
	WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	checkout.clear();
	checkout.sendKeys("30/06/2023");
}

@When("^user Select Adults per Room$")
public void user_Select_Adults_per_Room() throws Throwable {
	WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
	adultroom.click();
	Select ar = new Select(adultroom);
	ar.selectByVisibleText("3 - Three");
}

@When("^user Select Childrens Per Room$")
public void user_Select_Childrens_Per_Room() throws Throwable {
	WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
	Select cr = new Select(childroom);
	cr.selectByVisibleText("3 - Three");
   
}

@Then("^User Click The Search Button and Navigates To Select Hotel Page$")
public void user_Click_The_Search_Button_and_Navigates_To_Select_Hotel_Page() throws Throwable {
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
}

@When("^user Select Hotel$")
public void user_Select_Hotel() throws Throwable {
	driver.findElement(By.xpath("//input[@name='radiobutton_1']")).click();
}
@Then("^user Click Contiune Button and Navigates To Select The Book A Hotel Page$")
public void user_Click_Contiune_Button_and_Navigates_To_Select_The_Book_A_Hotel_Page() throws Throwable {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@When("^user Enter Firstname In Firstname Field$")
public void user_Enter_Firstname_In_Firstname_Field() throws Throwable {
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ranjith");
}

@When("^user Enter Lastname In Lastname Field$")
public void user_Enter_Lastname_In_Lastname_Field() throws Throwable {
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kumar");
}

@When("^user Enter Billing Addresss In Billing Address Field$")
public void user_Enter_Billing_Addresss_In_Billing_Address_Field() throws Throwable {
	driver.findElement(By.xpath("//textarea[@name='address']"))
	.sendKeys(" 20, cooper Square New York NK 10003,USA");
}

@When("^user Enter  Credit Card No In Credit Card No Field$")
public void user_Enter_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
	driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("3467890765432187");
}

@When("^user Enter Credit Card Type In Credit Card No Field$")
public void user_Enter_Credit_Card_Type_In_Credit_Card_No_Field() throws Throwable {
	WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
	cardtype.click();
	Select ct = new Select(cardtype);
	ct.selectByVisibleText("VISA");
}

@When("^user Enter Expriy Date In Select Month and Select Year$")
public void user_Enter_Expriy_Date_In_Select_Month_and_Select_Year() throws Throwable {
	driver.findElement(By.xpath("//select[@name='cc_exp_month']")).sendKeys("Aug");
	driver.findElement(By.xpath("//select[@name='cc_exp_year']")).sendKeys("2025");
	
}

@When("^user Enter CCV Number In CVV Number Field$")
public void user_Enter_CCV_Number_In_CVV_Number_Field() throws Throwable {
	driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("271");
}

@Then("^Click Book Now Button and  Navigates To Booking Confirmation Page$")
public void click_Book_Now_Button_and_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	driver.findElement(By.xpath("//input[@type='button']")).click();
}

 

}
