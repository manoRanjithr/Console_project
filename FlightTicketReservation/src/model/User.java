package model;

public class User {
    private String name;
    private String passWord;
	private int age;
    private String mailId;
    private String phoneNo;
    private int id;
    private int idGentrate=67453620;
    public User(String name,int age,String mailId,String phoneNo) 
    {
    	this.age=age;
    	this.mailId=mailId;
    	this.name=name;
    	this.phoneNo=phoneNo;
    	this.id=idGentrate++;
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

    

}
