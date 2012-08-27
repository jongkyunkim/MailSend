package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class User extends Model {

	private static final long serialVersionUID = 704457736387875254L;

	@Id
	public Long id;

	public String name;

	@Column(unique = true)
	public String email;

	public String password;

	public static Model.Finder<Long, User> find = new Model.Finder<Long, User>(
			Long.class, User.class);

}
