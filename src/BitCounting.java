public class BitCounting {
    public static int countBits(int n) {
        String s = Integer.toBinaryString(n);
        char[] strToArray = s.toCharArray();
        int result = 0;
        for(int i = 0; i < strToArray.length; i++) {
            String g = strToArray[i] + "";
            int o = Integer.parseInt(g);
            result += o;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countBits(5));
    }

}
