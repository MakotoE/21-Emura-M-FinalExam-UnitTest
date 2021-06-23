public class StringCalculator {
	public static int add(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",|\n");
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				var n = Integer.parseInt(number.trim());
				if (n < 0) {
					throw new RuntimeException("negative number");
				}

				if (n < 1000) {
					returnValue += n;
				}
			}
		}
		return returnValue;
	}
}