import java.util.*;

public class App{
    public static int factorial(int n) {
        if (n <= 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int somatorio(int n){
        if(n <= 0){
            return 0;
        }
        return n + somatorio(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n tem que ser maior que 0");
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somatorioEntre(int k, int j){
        if (k <= j) {
            return 0;
        }
        return k + somatorioEntre(k - 1, j);
    } 

    public static boolean isPal(String str){
        if (str == null || str.length() <= 1) {
            return true;
        }
        str = str.toLowerCase();
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPal(str.substring(1, str.length() - 1));
    }

    public static String convBase2(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 0");
        }
        if (n == 0) {
            return "0";
        }
        return convBase2(n / 2) + String.valueOf(n % 2);

    }

    public static int arraySum(int[] array, int index) {
        if (index < 0) {
            return 0;
        }
        return array[index] + arraySum(array, index - 1);
    }

    public static int findBiggest(ArrayList<Integer> ar){
        if (ar == null || ar.size() == 0) {
            throw new IllegalArgumentException("ArrayList nao pode estar vazio");
        }
        if (ar.size() == 1) {
            return ar.get(0);
        }
        if(ar.get(0) >= ar.get(1)){
            ar.remove(1);
        } else {   
            ar.remove(0);
        }
        return findBiggest(ar);
    }

    public static boolean findSubStr(String str, String match){
        if (str == null || match == null || str.length() < match.length()){
            return false;
        }
        int i = 0;
        for(char c : match.toCharArray()) {
            if (i >= str.length() || c != str.charAt(i)) {
                return findSubStr(str.substring(1), match);
            }
            i++;
        }
        return true;
    }

    public static int nroDigit(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + nroDigit(n / 10);
    }

    public static ArrayList<String> permuntations(String s){
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Fatorial: "+factorial(5));
        System.out.println("Somatorio: "+somatorio(5));
        System.out.println("Fibonacci: "+fibonacci(6));
        System.out.println("Somatorio Entre 2 Num: "+somatorioEntre(5, 2));
        System.out.println("Palindromo: "+isPal("farigiraf"));
        System.out.println("Conversao para base 2: "+convBase2(10));
        System.out.println("Soma de Array: "+arraySum(new int[]{1, 2, 3, 4, 5}, 4));
        System.out.println("Numero de digitos: "+nroDigit(12345));
        System.out.println("Maior num: "+findBiggest(new ArrayList<>(Arrays.asList(30, 5, 2, 9, 10))));
        System.out.println("Substring: "+findSubStr("hello world", "llo wo"));
        System.out.println("Substring: "+findSubStr("hello world", "worlds"));
    }
}