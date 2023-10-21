public class ScrabbleScore {
    // final static means these arrays are constant
    final static String[] POINT_SCORE_LETTERS = {"AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ"};
    final static int[] POINT_SCORES = {1, 2, 3, 4, 5, 8, 10};

    public int getScrabbleScore(String word) {
        int wordScore = 0;

        // take my word and make a list in uppercase and cycle through the letters
        for (char letter : word.toUpperCase().toCharArray()) {
            // look in all the strings in turn
            for (int i=0; i < POINT_SCORE_LETTERS.length; i++) {
                // if the letter is matched use the index to locate the point in the scores list
                if (POINT_SCORE_LETTERS[i].indexOf(letter) != -1)
                    // add that number to the variable holding the overall word score
                    wordScore += POINT_SCORES[i];
            }
        }
        return wordScore;
    }
}