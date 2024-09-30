package ecom;

public class splitt {
	public static void main(String[] args) {

		String s = "hi.am,dhanush";
		String[] valuses = s.split("[.//,// ]");
		char[] punch = new char[s.length()];
		int index = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '.' || s.charAt(i) == ',') {

				punch[index++] = s.charAt(i);

			}

		}

		for (int i = 0; i < valuses.length; i++) {

			valuses[i] = new StringBuilder(valuses[i]).reverse().toString();

		}

		StringBuilder ss = new StringBuilder(valuses[0]);
		for (int i = 1; i < valuses.length; i++) {
			ss.append(punch[i - 1]);
			ss.append(valuses[i]);

		}

		String fvalue = ss.toString();
		System.out.println(fvalue);

	}

}
