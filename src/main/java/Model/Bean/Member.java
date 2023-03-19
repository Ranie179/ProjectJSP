package Model.Bean;
import java.util.Date;

public class Member {
	private int Member_ID;
	protected String Firstname;
	protected String Lastname;
	private String Username;
	private String Pass;
	private String Phone;
	protected String Email;
	protected String Description;
	protected Date CreateDate;
	protected Date UpdateTime;
	public Member(String FirstName, String LastName, String Phone, String Email, String Description) {
		this.Firstname = FirstName;
		this.Lastname = LastName;
		this.Phone = Phone;
		this.Email = Email;
		this.Description = Description;
	}
	public Member() {};
	public int getMember_ID() {
		return Member_ID;
	}
	public void setMember_ID(int member_ID) {
		Member_ID = member_ID;
	}
	public String getFirstName() {
		return Firstname;
	}
	public void setFirstName(String firstName) {
		Firstname = firstName;
	}
	public String getLastName() {
		return Lastname;
	}
	public void setLastName(String lastName) {
		Lastname = lastName;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDesctiption() {
		return Description;
	}
	public void setDesctiption(String desctiption) {
		Description = desctiption;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getUpdateTime() {
		return UpdateTime;
	}
	public void setUpdateTime(Date updateTime) {
		UpdateTime = updateTime;
	}
	
	
}
