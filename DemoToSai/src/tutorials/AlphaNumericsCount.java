package tutorials;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AlphaNumericsCount {
	public static void main(String[] args) {
		String s = "1a23dk3ge5";

		int alphaCount = 0;
		int numberCount = 0;
		StringBuilder alphabets = new StringBuilder();
		StringBuilder numbersBuf = new StringBuilder();
		
		List<String> alphaList=new ArrayList<String>();
		char[] charecters = s.toCharArray();
		
		for (int i = 0; i < charecters.length; i++) {

			if (Character.isAlphabetic(charecters[i])) {
				StringBuilder st=new StringBuilder(charecters[i-1]);
				for(int j=i;j<charecters.length;j++) {
					if(j>0 && Character.isAlphabetic(charecters[j - 1])) {
						//st=st
					}
				}
				
				if (i>0 && Character.isAlphabetic(charecters[i - 1])) {
					alphabets.append(charecters[i]);
				} else {
					alphaCount++;
					alphabets.append(charecters[i]);
				}

			} else {
				if (i>0 && !Character.isAlphabetic(charecters[i - 1])) {
				
					numbersBuf.append(charecters[i]);

				} else {
					numberCount++;
					numbersBuf.append(charecters[i]);
				}
			}

		}
		System.out.println(alphabets);
		System.out.println(numbersBuf);
		System.out.println("Alphs "+alphaCount);
		System.out.println("Nums "+numberCount);

	}
}
