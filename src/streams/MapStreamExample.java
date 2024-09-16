package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapStreamExample {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		users.add(new User(1, "Pavan", "p@gmail.com"));
		users.add(new User(2, "Sandeep", "s@gmail.com"));
		users.add(new User(3, "Kumar", "k@gmail.com"));

		users.stream().map(new Function<User, UserDTo>() {
			public UserDTo apply(User user) {
				return new UserDTo(user.getId(), user.getName(), user.getEmail());
			}
		}).forEach((userDto) -> System.out.println(userDto));

	}
}

class UserDTo {

	private int id;
	private String name;
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDTo(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTo [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}

class User {

	private int id;
	private String name;
	private String email;

	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
