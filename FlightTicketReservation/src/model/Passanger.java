package model;


public class Passanger {
    private String name;
    private int age;
    private String mailId;
    private String phoneNo;
    private String PNR;
    private int flightNumber;
    private String time;
    public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Passanger (String name,int age,String mailId,String phoneNo,String PNR,int flightNumber,String time) 
    {
    	this.age=age;
    	this.mailId=mailId;
    	this.name=name;
    	this.phoneNo=phoneNo;
    	this.PNR=PNR;
    }
    
	public String getPNR() {
		return PNR;
	}

	public void setPNR(String pNR) {
		PNR = pNR;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
