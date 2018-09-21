package AllHtmlPages;



public class myaccountpage extends AMasterselenium
{
	
	
	static String ChangePasswordLink = "//*[@id=\"item_details\"]/div[3]/div[1]/div/div[4]/a";
	static String myorderlink = "//*[@id='item_details']/div[3]/div[1]/div/div[1]/a";

	public static void startchangepasswordProcess()
	{
		ClickWebElement(ChangePasswordLink);
		DriverwaitFiveSecond();
	}
	public static void gotoMyorderSection()
	{
		ClickWebElement(myorderlink);
		DriverwaitFiveSecond();

	}



}