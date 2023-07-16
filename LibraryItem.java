abstract class LibraryItem
{
	private String title;
	private String itemID;
	private boolean checkedOut;
	
	public LibraryItem(String title,String itemID)
	{
		this.title=title;
		this.itemID=itemID;
		this.checkedOut=false;
	}
	public String getTitle()
	{
		return title;
	}
	public String getItem()
	{
		return itemID;
	}
	public void checkedOut()
	{
		checkedOut=true;
	}
	public void checkIn()
	{
		checkedOut=false;
	}
	
	public void displayItemDetails()
	{
		System.out.println("Title: "+title)
		System.out.println("ITem ID: "+itemID)
		System.out.println("Item Checked out: "+(checkedOut? "yes":"No"));
	}