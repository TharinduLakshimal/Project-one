class LibraryMember
{
	private String memberID;
	private String name;
	
	public LibraryMember(String memberID,String name)
	{
		this.memberID=memberID;
		this.name=name;
	}
	public String getMemberID()
	{
		return memberID;
	}
	public void displayMemberDetails()
	{
		System.out.println("Member ID: "memberId);
		System.out.println("Name: "+name);
	}
}