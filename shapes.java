public class shapes {
  static int r;

  static void Display(int num) {
      for (int i = 0; i < num; i++) {
          System.out.print("* ");
      }
      System.out.println();
  }

  static int Shape(int num) {
      if (num == 0) {
          return 0;
      }
      Display(num);
      return Shape(num - 1);
  }

  public static void main(String[] args) {
      int num = 4;
      Shape(num);
  }
}
