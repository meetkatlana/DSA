class Pangram_Sentence {
 public static void main(String[] args) {
     String sentence = "howareyoumyboymeetkatlana";
     boolean b = checkIfPangram(sentence);
     System.out.println(b);
 }
    static boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26) {
			return false;
        }
		for (char i = 'a'; i <= 'z'; i++) {
			if (sentence.indexOf(i) == -1) {
				return false;
			}
		}
		return true;
	}
}