
public class Iphone8 extends IOS {
	public static void main(String[] args) {
		Iphone8 ios = new Iphone8();
		System.out.println(ios.AppStore());
		System.out.println(ios.TouchID());
	}

	@Override
	public String AppStore() {
		// TODO Auto-generated method stub
		return super.AppStore();
	}

	public String TouchID() {
		return "TouchID";
	}

}
