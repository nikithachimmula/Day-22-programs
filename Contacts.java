package addressbook;

public class Contacts {
	private int sn;
	private String fn;
	private String ln;
	private String city;
	private String state;
	private String email;
	private String address;
	private int zip;
	private long phone_no;

	// constructor
	Contacts(int sn, String fn, String ln, String city, String state, String email, String address, int zip, long phone_no) {
		this.sn = sn;
		this.fn = fn;
		this.ln = ln;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.address = address;
		this.phone_no = phone_no;

	}

	// method
	public int getsn() {
		return sn;
	}

	public String getfn() {
		return fn;
	}

	public String getln() {
		return ln;
	}

	public String getcity() {
		return city;
	}

	public String getstate() {
		return state;
	}

	public String getemail() {
		return email;
	}

	public String getaddress() {
		return address;
	}

	public int getzip() {
		return zip;
	}

	public double getphone_no() {
		return phone_no;
	}

	@Override
	public String toString() {
		return "sn =" + sn + ",fn =" + fn + ", ln =" + ln + ", address =" + address + ", state=" + state + ", zip=" + zip
				+ ", phone_no=" + phone_no + ", email=" + email;
	}

}
