class Main2 {
    static int sumNaturalNumber(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumNaturalNumber(n - 1); 
        }
    }

    public static void main(String[] args) {
        int number = 10;
        int result = sumNaturalNumber(number); 
        System.out.println("Sum of first " + number + " natural numbers is " + result);
    }
}
