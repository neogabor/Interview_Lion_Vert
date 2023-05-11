import java.util.*;

public class Main {
    private static Map<Integer, String> numberMap = new HashMap();
    static {
        numberMap.put(1000, "M");
        numberMap.put(900, "CM");
        numberMap.put(500, "D");
        numberMap.put(400, "CD");
        numberMap.put(100, "C");
        numberMap.put(90, "XC");
        numberMap.put(50, "L");
        numberMap.put(40, "XL");
        numberMap.put(10, "X");
        numberMap.put(9, "IX");
        numberMap.put(5, "V");
        numberMap.put(4, "IV");
        numberMap.put(1, "I");
    }

    public static void main(String[] args) {

    }

    public String converter(int number) {
        StringBuilder sb = new StringBuilder();
        List<Integer> divisors = new ArrayList<>();
        divisors.addAll(numberMap.keySet());
        Collections.sort(divisors, Collections.reverseOrder());
        int divisorIndex = 0;
        int divisor;
        int divident = number;
        while(divident >0){
            divisor = divisors.get(divisorIndex);
            int integerResult = divident / divisor;
            if(integerResult > 0) {
                symbolAppender(sb, integerResult, divisor);
                divident -= divisor*integerResult;
            }
            divisorIndex++;
        }
        return sb.toString();
    }

    private void symbolAppender(StringBuilder sb, int repeat, int divisor){
        for (int i = 0; i < repeat; i++) {
            sb.append(numberMap.get(divisor));
        }
    }
}
