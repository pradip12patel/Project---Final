package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectPage {
	
	WebDriver driver;
	
	//header
	public By nb=By.xpath("(//ul//span)[1]");
	public By account=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");
	public By register=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li[1]");
	public By first=By.xpath("//input[@id='input-firstname']");
	public By last=By.xpath("//input[@id='input-lastname']");
	public By email=By.xpath("//input[@id='input-email']");
	public By teph=By.xpath("//input[@id='input-telephone']");
	public By password=By.xpath("//input[@id='input-password']");
	public By pass_again=By.xpath("//input[@id='input-confirm']");
	public By radio=By.xpath("//input[@type='radio']");
	public By policy=By.xpath("//input[@name='agree']");
	public By contiue=By.xpath("//input[@value='Continue']");
	public By contiue1=By.xpath("//div[@class='pull-right']");
	public By wish=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");
	public By email1=By.xpath("//input[@name='email']");
	public By pass=By.xpath("//input[@name='password']");
	public By login=By.xpath("//input[@type='submit']");
	public By contie=By.xpath("//div[@class='pull-right']");
	public By shooping=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[5]");
	public By continue1=By.xpath("//a[@class='btn btn-primary']");
	public By checkout=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]");
	public By assertheader=By.xpath("//h1[normalize-space()='Shopping Cart']");
	//addcart
	public By search=By.xpath("//input[@placeholder='Search']");
	public By click=By.xpath("//button[@class='btn btn-default btn-lg']");
	public By price=By.xpath("//p[@class='price']");
	public By addcard=By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]");
	public By price1=By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[1]//p[2]");
	public By addcard1=By.xpath("(//div[@class='button-group'])[1]//button[1]");
	public By crtadd=By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	public By sum=By.xpath("(//tbody//tr//td)[18]");
	public By assertaddcart=By.xpath("//h2[normalize-space()='Products meeting the search criteria']");
	//footer
	public By link=By.xpath("(//div[@class='col-sm-3'])[2]");
	public By link1=By.xpath("(//div[@class='col-sm-3'])[3]");
	public By link2=By.xpath("(//div[@class='col-sm-3'])[4]");
	public By link3=By.xpath("(//div[@class='col-sm-3'])[5]");
	public By tag=By.tagName("a");    
	//MenuBar
	public By Desktop=By.xpath("//a[normalize-space()='Desktops']");
	public By showall=By.xpath("//a[normalize-space()='Show All Desktops']");
	public By shorts=By.xpath("//select[@class='form-control']");
	public By view=By.xpath("//select[@id='input-limit']");
	public By Appleprice=By.xpath("//p[@class='price']");
	public By addcart=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[1]");
	public By radiobtn=By.xpath("//input[@name='option[218]']");
	public By checkbox=By.xpath("//input[@name='option[223][]']");
	public By selectone=By.xpath("//select[@name='option[217]']");
	public By text=By.xpath("//textarea[@placeholder='Textarea']");
	public By date1=By.xpath("//input[@id='input-option220']");
	public By date=By.xpath("//input[@id='input-option219']");
	public By file=By.xpath("//button[@id='button-upload222']");
	public By addcart2=By.xpath("//button[@id='button-cart']");
	public By cartsum=By.xpath("//div[@class='btn-group btn-block']//button[1]");
	public By total=By.xpath("//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
	public By cancel=By.xpath("(//button[@type='button'])[6]");
	public By tablet=By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Tablets')]");
	public By grabprices=By.xpath("//p[@class='price']");
	public By addtocart=By.xpath("(//button[@type='button'])[9]");
	public By cartadd=By.xpath("//span[@id='cart-total']");
	public By totals=By.xpath("//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
	public By assertmenubar=By.xpath("//h2[normalize-space()='Tablets']");
	
	public ObjectPage(WebDriver driver2) {
		this.driver=driver2;
	}


	public WebElement verifynb()  {
		
		return driver.findElement(nb);
		
	}
	
   public WebElement verifysearch()  {
		
		return driver.findElement(search);
		
	}

	
   public WebElement clickon()  {
		
		return driver.findElement(click);
		
	}
   
   public WebElement clickprice()  {
		
		return driver.findElement(price);
		
	}
   
   public WebElement clickaddcart()  {
		
		return driver.findElement(addcard);
		
	}
  
   public WebElement clickprice1()  {
		
		return driver.findElement(price1);
		
	}
   
   public WebElement clickaddcart1()  {
		
		return driver.findElement(addcard1);
		
	}
   
   public WebElement clickcrtadd()  {
		
		return driver.findElement(crtadd);
		
	}
   
   public WebElement verifysum()  {
		
		return driver.findElement(sum);
		
	}
   
   public WebElement clicklink()  {
		
		return driver.findElement(link);
		
	}
   
   public WebElement clicklink1()  {
		
		return driver.findElement(link1);
		
	}
   
   public WebElement clicklink2()  {
		
		return driver.findElement(link2);
		
	}
   
   public WebElement clicklink3()  {
		
		return driver.findElement(link3);
		
	}
   
   public WebElement clicktag()  {
		
		return driver.findElement(tag);
		
	}
   
   public WebElement clickaccount()  {
		
		return driver.findElement(account);
		
	}
   
   public WebElement clickregister()  {
		
		return driver.findElement(register);
		
	}
   
   public WebElement enterfirst()  {
		
		return driver.findElement(first);
		
	}
   
   public WebElement enterlast()  {
		
		return driver.findElement(last);
		
	}
   
   public WebElement enteremail()  {
		
		return driver.findElement(email);
		
	}
   
   public WebElement entertelp()  {
		
		return driver.findElement(teph);
		
	}
   
   public WebElement enterpassword()  {
		
		return driver.findElement(password);
		
	}
   
   public WebElement enterpasswordagain()  {
		
		return driver.findElement(pass_again);
		
	}
   
   public List<WebElement> clickradiobtn()  {
		
		return driver.findElements(radio);
		
	}
   
   public WebElement clickpolicy() {
		
		return driver.findElement(policy);
		
	}
   
   public WebElement clickcontinue()  {
		
		return driver.findElement(contiue);
		
	}
   
   public WebElement clickcontinue1()  {
		
		return driver.findElement(contiue1);
		
	}
   
   public WebElement clickwish()  {
		
		return driver.findElement(wish);
		
	}
   
   public WebElement passemail1()  {
		
		return driver.findElement(email1);
		
	}
   
   public WebElement enterpass()  {
		
		return driver.findElement(pass);
		
	}
   
   public WebElement clicklogin()  {
		
		return driver.findElement(login);
		
	}
   
   public WebElement clickcontie()  {
		
		return driver.findElement(contie);
		
	}
   
   public WebElement clickshooping()  {
		
		return driver.findElement(shooping);
		
	}
   
   public WebElement Clickcontinue()  {
		
		return driver.findElement(continue1);
		
	}
   
   public WebElement Clickcheckout()  {
		
		return driver.findElement(checkout);
		
	}
   
   public WebElement verifyassetheader()  {
		
		return driver.findElement(assertheader);
		
	}
  
  
   public WebElement clickdesktop()  {
		
		return driver.findElement(Desktop);	
	}
   
   public WebElement clickshowall()  {
		
		return driver.findElement(showall);
		
	}
   
   public WebElement clickshorts()  {
		
		return driver.findElement(shorts);
		
	}
   
   public WebElement clickview()  {
		
		return driver.findElement(view);
		
	}
   
   public WebElement grabprice()  {
		
		return driver.findElement(Appleprice);
		
	}
   
   public WebElement clickaddcarts()  {
		
		return driver.findElement(addcart);
		
	}
   
   public List<WebElement> pickradio()  {
		
		return driver.findElements(radiobtn);
		
	}
   
   public List<WebElement> pickcheckbox()  {
		
		return driver.findElements(checkbox);
		
	}
   
   public WebElement selectones()  {
		
		return driver.findElement(selectone);
		
	}
	
   public WebElement textarea()  {
		
		return driver.findElement(text);
		
	}
   
   public WebElement pickdate1()  {
		
		return driver.findElement(date1);
		
	}
	
   public WebElement pickdate()  {
		
		return driver.findElement(date);
		
	}
   
   public WebElement clickfile()  {
		
		return driver.findElement(file);
		
	}
   
   public WebElement clickaddcart2()  {
		
		return driver.findElement(addcart2);
		
	}
   
   public WebElement clickcartsum()  {
		
		return driver.findElement(cartsum);
		
	}
   
   public WebElement verifytotal()  {
		
		return driver.findElement(total);
		
	}
   
   public WebElement verifyassertaddcart()  {
		
		return driver.findElement(assertaddcart);
		
	}
   
   public WebElement clickcancel()  {
		
		return driver.findElement(cancel);
		
	}
   
   public WebElement clicktablet()  {
		
		return driver.findElement(tablet);
		
	}
   
   public WebElement handleprice()  {
		
		return driver.findElement(grabprices);
		
	}
   
   public WebElement clickaddtocart()  {
		
		return driver.findElement(addtocart);
		
	}
   
   public WebElement clickcartadd()  {
		
		return driver.findElement(cartadd);
		
	}
   
   public WebElement verifytotals()  {
		
		return driver.findElement(totals);
		
	}
   
   public WebElement verifyassertmenubar()  {
		
		return driver.findElement(assertmenubar);
		
	}
}

