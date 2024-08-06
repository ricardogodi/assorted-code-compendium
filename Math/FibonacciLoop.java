  // Iterative version of Fibonacci
  public static long fibonacci(int n) {
    if (n==1 || n==2) {
      return 1;
    }
    else {
      int a1 = 1;
      int a2 = 1;
      for (int i = 3; i <= n; i++) {
        int temp = a2;
        a2 = a2 + a1;
        a1 = temp;
      }
      return a2;
    }
  }
  