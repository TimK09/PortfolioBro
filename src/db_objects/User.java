package db_objects;

public class User {
public int user_id;
public String username;
public String vorname;
public String nachname;


public User(int user_id, String username, String vorname, String nachname) {
	this.user_id = user_id;
	this.username = username;
	this.vorname = vorname;
	this.nachname = nachname;
}
}
