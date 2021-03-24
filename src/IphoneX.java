
public class IphoneX extends IOS{
	public static void main(String[] args) {
//		IOS ios1 = new IOS();
		IphoneX ios2 = new IphoneX();
//		System.out.println(ios1.AppStore());
		System.out.println(ios2.AppStore());

		System.out.println(FaceID());
	}

	@Override
	public String AppStore() {
		// TODO Auto-generated method stub
		return super.AppStore();
	}

	public static String FaceID() {
		return "FaceID";
	}
}
