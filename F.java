class Addition {
    static void add(int a, int b) { //method overloading
         int c = a + b;
         System.out.println(c);
    }

    static void add(double a, double b) {
         double c = a + b;
         System.out.println(c);
    }

    public static void main(String[] args) {
         add(5, 6);
         add(5.7, 6.2);
    }
}