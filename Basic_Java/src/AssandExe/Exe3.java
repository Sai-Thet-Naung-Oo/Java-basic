package mingalarpar;

import java.util.StringTokenizer;

public class Exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "To be or not to be";
		StringTokenizer stk = new StringTokenizer(word, " ");

		while (stk.hasMoreElements())
			System.out.print(reverse(stk.nextToken()) + " ");
	}

	public static String reverse(String st) {
		int len = st.length();
		StringBuffer sb = new StringBuffer(len);
		for (int i = len - 1; i >= 0; i--)
			sb.append(st.charAt(i));

		return sb.toString();

	}

}
