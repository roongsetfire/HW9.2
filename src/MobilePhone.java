
public class MobilePhone {
	public static void main(String[] args) {
		System.out.println(PhoneCall());
		System.out.println(SMS());
		System.out.println(InternetSurfing());
	}
	public MobilePhone() {}
	
	public static String PhoneCall() {
		return "PhoneCall";
	}
	public static String SMS() {
		return "SMS";
	}
	public static String InternetSurfing() {
		return "InternetSurfing";
	}
}
