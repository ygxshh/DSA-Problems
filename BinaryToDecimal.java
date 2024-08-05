public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(BinaryToDecimal("101"));
    }
    private static int BinaryToDecimal(String Binary){
        int length = Binary.length();
        int m = 1;
        int res = 0;
        for (int i = length-1; i >= 0; i--) {
            char lastChracter = Binary.charAt(0);
            Integer lastBit = Integer.valueOf(String.valueOf(lastChracter));
            res = res+m*lastBit;
            
        }
        return res;
    }
}