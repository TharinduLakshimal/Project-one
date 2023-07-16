class Book extends LibraryItem
{
	private String author;
	private int numPages;
	
	public Book(String title,String itemID,String author,int numpages)
	{
		super(title,itemID);
		this.author=author;
		this.numpages=numpages;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getNumPages()
	{
		return numPages;
	}
	
	@override
	public void displayItemDetails()
	{
		super.diplayItemDetails()
		{
			super.diplayItemDetails();
			System.out.println("Author :"+ author);
			System.out.println("number of pages"+numPages);
		}
	}
}