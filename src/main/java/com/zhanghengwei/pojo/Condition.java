package com.zhanghengwei.pojo;

public class Condition {
	private Integer id;
	private String title;
	private String username;
	private String created;
	private int tousuCnt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public int getTousuCnt() {
		return tousuCnt;
	}
	public void setTousuCnt(int tousuCnt) {
		this.tousuCnt = tousuCnt;
	}
	public Condition(Integer id, String title, String username, String created, int tousuCnt) {
		super();
		this.id = id;
		this.title = title;
		this.username = username;
		this.created = created;
		this.tousuCnt = tousuCnt;
	}
	public Condition() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Condition [id=" + id + ", title=" + title + ", username=" + username + ", created=" + created
				+ ", tousuCnt=" + tousuCnt + "]";
	}
	
}
