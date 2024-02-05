public class heart {
    public static void main(String[] args) {
        int n=18;
        String s = "";
        System.out.println();
           System.out.println();
        for (int i = n/2; i <  n; i++) {
            for (int j =1; j < n-i; j+=2) {
              s += " ";
            }
            for (int j = 1; j< i+1; j++) {
                     s += "❤️";
            }
            for (int j = 1; j< n-i +1; j++) {
                     s += " ";
            }
            for (int j = 1; j< i+1; j++) {
                          s += "❤️";
            }
                           s += "\n";
        }
            for (int i = n; i >  0; i--) {
                 for (int j = 0; j< n-i; j++) {
                 s += " ";
                }
                   for (int j = 1; j< i*2; j++) {
                         s += "❤️";
                }
                  s += "\n";
            }
System.out.print(s);
   System.out.println();
      System.out.println();
    }
}
