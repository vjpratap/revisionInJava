class Revision{
	public static String reverse(String newStr){
		int length = newStr.length(),i;
		String s = "";
		for(i = length - 1; i >= 0; i--)
			s += newStr.substring(i, i + 1);
		return s;
	}
	public static int fibonacci(int term){
	// if (term == 1)
	// 	return 0;
	// if (term == 2)
	// 	return 1;
	// return fibonacci(term - 1) + fibonacci(term - 2);
		return (term == 1) ? 0 : (term == 2) ? 1 : fibonacci(term - 1) + fibonacci(term - 2);
	}
}