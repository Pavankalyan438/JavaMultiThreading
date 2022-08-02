package tutorials;

public class SaikrishnaChild {

	public static void main(String[] args) {
		String s = "1a23dk3ge5";
		
		int alphaCount = 0;
		int numberCount = 0;
		StringBuilder alphabets = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		char[] charecters = s.toCharArray();
		Character.isAlphabetic(charecters[1]);
		
		for (int i = 0; i < charecters.length; i++) {
			int a = charecters[i];
			if (96 < a && a < 123) {
				if (i > 0) {
					int prev = charecters[i - 1];
					if (96 < prev && prev < 123) {
						alphabets.append(charecters[i]);
					}else {
						alphabets.append(charecters[i]);
						alphaCount++;
					}
						
				} else {
					alphabets.append(charecters[i]);
					alphaCount++;
				}
			} else {
				if (i > 0) {
					int prev = charecters[i - 1];
					if (49 < prev && prev < 58)
						numbers.append(charecters[i]);
				} else {
					numbers.append(charecters[i]);
					numberCount++;
				}

			}
		}

		System.out.println(numbers);
		System.out.println(alphabets);
		System.out.println("Alphabets count "+ alphaCount);
		System.out.println("NUmbers count "+ numberCount);

	}

}
