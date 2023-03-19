package Model.Bean;
import java.util.Date;
import java.util.List;


public class Content {
	private int Content_ID;
	protected String Title;
	protected String Brief;
	protected String Content;
	protected Date CreateDate;
	protected Date UpdateTime;
	protected boolean sort;
	
	public Content(String Title, String Brief, String Content, Date CreateDate, Date UpdateTime, int Content_ID) {
		this.Title = Title;
		this.Brief = Brief;
		this.Content = Content;
		this.CreateDate = CreateDate;
		this.UpdateTime = UpdateTime;
		this.Content_ID = Content_ID;
	}
	public Content() {}
	
    public int getContent_ID() {
		return Content_ID;
	}
	public void setContent_ID(int content_ID) {
		Content_ID = content_ID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getBrief() {
		return Brief;
	}
	public void setBrief(String brief) {
		Brief = brief;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
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
	public boolean isSort() {
		return sort;
	}
	public void setSort(boolean sort) {
		this.sort = sort;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	protected List<Member> members;
}
