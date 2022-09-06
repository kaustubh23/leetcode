package leetcode;

public class ZingZagString {
	
	public static void main(String[] args) {
		String str="Samurai";
		String ending ="ai";
		String compare= str.substring(str.length()-ending.length(), str.length());
		
		System.out.println(convert("PAYPALISHIRING",3));
	//PAHNAPLSIIGYIR
	//PAHNAPLSIIGYIR
	}

	public static String convert(String s, int numRows) {
			StringBuilder[] sb = new StringBuilder[numRows];

		for (int i = 0; i < numRows; i++) {
			sb[i] = new StringBuilder();
		}

		char[] ch = s.toCharArray();
		int len = ch.length;
		int index = 0;
		while (index < len) {

			for (int j = 0; j < numRows && index < len; j++) {
				sb[j].append(ch[index++]);
			}

			for (int j = numRows - 2;j>0 && index < len; j--) {
				sb[j].append(ch[index++]);
			}
		}

		StringBuilder b = sb[0];
		for (int i = 1; i < numRows ; i++) {
			b.append(sb[i]);
		}
		return b.toString();
	}

}
