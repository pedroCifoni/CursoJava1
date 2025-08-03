package entities;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Client {
	private String name;
	private String email;
	private Date birthday;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client() {
		
	}

	public Client(String name, String email, Date birthday) {
		super();
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(": ");
		sb.append(sdf.format(birthday));
		sb.append(") - ");
		sb.append(email);
		return sb.toString();

	}
}
