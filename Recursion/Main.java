class Main {
    static void fun(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        fun(n - 1);
        fun(n - 1);
    }

    public static void main(String[] args) {
        fun(2);
    }
}