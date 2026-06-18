class PowerAB{
    public static void main(String[] args) {
        int a = 2, b = 3;
int result = 1;

for (int i = 0; i < b; i++) {
    result *= a;
}

System.out.println(a + "^" + b + " = " + result);  // Output: 2^3 = 8
    }
}