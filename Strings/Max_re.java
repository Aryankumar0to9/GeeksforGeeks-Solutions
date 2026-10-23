package Strings;




public class Max_re {

    public static void main(String[] args) {
        String sequence = "Geeksforgeek";
        String word = "for";

        Max_re obj = new Max_re();
        int result = obj.maxRepeating(sequence, word);

        System.out.print(result);
    }

    public int maxRepeating(String sequence, String word) {
        String repeated = word;
        int count = 0;

        while (sequence.contains(repeated)) {
            count++;
            repeated += word;
        }

        return count;
    }
}


