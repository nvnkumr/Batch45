package daytwo;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		byte maxbyte = 127;
		byte minbyte = -128;
		System.out.println("byte range from "+minbyte +" to "+maxbyte);
		
		short maxshort = 32767;
		short minshort = -32768;
		System.out.println("short range from "+minshort +" to "+maxshort);
		
		int maxint = 2147483647;
		int minint = -2147483648;
		System.out.println("int range from "+minint +" to "+maxint);
		
		long maxlong=  9223372036854775807L;         
		long minlong = -9223372036854775808L;
		System.out.println("long range from "+minlong +" to "+maxlong);
		
		boolean flag= false;
		System.out.println("boolean value is "+ flag);
	}

}
