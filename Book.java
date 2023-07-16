class Book extends LibraryItem
{
	private String author;
	private int numPages;
	
	public Book(String title,String itemID,String author,int numPages)
	{
		super(title,itemID);
		this.author=author;
		this.numPages=numPages;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getNumPages()
	{
		return numPages;
	}
	
	@Override
	public void displayItemDetails()
	{
		super.diplayItemDetails();
		{
			super.diplayItemDetails();
			System.out.println("Author :"+ author);
			System.out.println("number of pages"+numPages);
		}
	}
}