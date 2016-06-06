package edu.nefu.gdms.domain;

/**
 * Title entity. @author MyEclipse Persistence Tools
 */

public class Tetitle implements java.io.Serializable {

	private String id;
	private Title title;
	private Teacher teacher;
	private String rs;
	private String advise;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getRs() {
		return rs;
	}

	public void setRs(String rs) {
		this.rs = rs;
	}

	public String getAdvise() {
		return advise;
	}

	public void setAdvise(String advise) {
		this.advise = advise;
	}
}