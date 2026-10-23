

public class Roman_to_int {
    

    public static int romanInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentV = getv(s.charAt(i));

            if (i < s.length() - 1 && currentV < getv(s.charAt(i + 1))) {
                total = total - currentV;
            } else {
                total = total + currentV;
            }
        }
        return total;
    }

    private static int getv(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String s = "XXX";
        int ans = romanInt(s);
        System.out.print(ans); // Output: 30
    }
}

