public class Test {
	public static void main(String... args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = "A";
		System.err.println(args.length);

		if (args.length != 0 && (!args[0].equals("")))
			className = args[0];

		System.out.println("className: " + className);

		Class cls = Class.forName(className);

		S obj=(S)cls.newInstance(); 
		obj.show();
	}
}
