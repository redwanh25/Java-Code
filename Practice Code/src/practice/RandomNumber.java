package practice;

import java.util.Random;

public class RandomNumber {
	
	private static final int MAX_LENGTH = 100;

	public static void main(String[] args) {
		System.out.println(random());

	}
	
    public static String random() {
        Random generator = new Random();
        StringBuilder randomStringBuilder = new StringBuilder();
        int randomLength = 1 + generator.nextInt(MAX_LENGTH);
        char tempChar;
        for (int i = 0; i < randomLength; i++){
            tempChar = (char) (generator.nextInt(75) + 48);
            randomStringBuilder.append(tempChar);
        }

        StringBuilder randomStringBuilder1 = new StringBuilder();
        char tempChar1;
        for (int i = 0; i < randomLength; i++){
            tempChar1 = (char) (generator.nextInt(75) + 48);
            randomStringBuilder1.append(tempChar1);
            randomStringBuilder1.append(randomStringBuilder.charAt(i));
        }
        return randomStringBuilder1.toString();
    }

}
