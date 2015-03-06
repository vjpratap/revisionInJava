class Revision{
	private int giveDecimal(int binary, int base){
		int decimal = 0, power = 0;
		while(binary != 0){
			if(binary%2 == 1)
				decimal += (int)Math.pow(base, power);
			power++;
			binary /= 10;
		}
		return decimal;
	}

	public String reverse(String newStr){
		int length = newStr.length(),i;
		String s = "";
		for(i = length - 1; i >= 0; i--)
			s += newStr.substring(i, i + 1);
		return s;
	}
	public int fibonacci(int term){
		return (term == 1) ? 0 : (term == 2) ? 1 : fibonacci(term - 1) + fibonacci(term - 2);
	}
	public int readBinary(int binary){
		return giveDecimal(binary,2);
	}
	public int readBinary(String binary){
		int textBinary = Integer.parseInt(binary);
		return giveDecimal(textBinary,2);
	}
	public int readOctal(int octal){
		return giveDecimal(octal, 8);
	}
}