public class ex16 {
	public static void main(String[] args) {
		System.out.println(getCallerClassAndMethodName());
		m1();    }

	static void m1() {
		System.out.println(getCallerClassAndMethodName());
		m2();    }

	static void m2() {
		System.out.println(getCallerClassAndMethodName());
		m3();    }

	static void m3() {
		System.out.println(getCallerClassAndMethodName());
	}

	public static String getCallerClassAndMethodName() {
		try {
			StackTraceElement element = new Throwable().getStackTrace()[2];
			return element.getClassName() + "#" + element.getMethodName();
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
}
