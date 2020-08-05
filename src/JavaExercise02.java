public class JavaExercise02 {

    public static void main(String[] args) {

        boolean a = false;
        boolean b = false;
        boolean c = false;

        System.out.println("(a && b) || c");
        System.out.println(" A    | B    |  C    | ? ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(a + " | " + b + " | " + c + " | ");
                    System.out.println((a && b) || c);
                    c = !c;
                }
                b = !b;
            }
            a = !a;
        }
        System.out.println();
        System.out.println("!(a && b) || c");
        System.out.println(" A    | B    |  C    | ? ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(a + " | " + b + " | " + c + " | ");
                    System.out.println(!(a && b) || c);
                    c = !c;
                }
                b = !b;
            }
            a = !a;
        }
        System.out.println();
        System.out.println("!(a || b || c");
        System.out.println(" A    | B    |  C    | ? ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(a + " | " + b + " | " + c + " | ");
                    System.out.println(!(a || b || c));
                    c = !c;
                }
                b = !b;
            }
            a = !a;
        }
        System.out.println();
        System.out.println("!((a && b) || (b && c))");
        System.out.println(" A    | B    |  C    | ? ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(a + " | " + b + " | " + c + " | ");
                    System.out.println(!((a && b) || (b && c)));
                    c = !c;
                }
                b = !b;
            }
            a = !a;
        }
        System.out.println();
        System.out.println("!(a ^ b)");
        System.out.println(" A    | B    | ? ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a + " | " + b + " | ");
                System.out.println(!(a ^ b));
                b = !b;
            }
            a = !a;
        }
        System.out.println();
        System.out.println("Extra Aufgabe:");

        boolean p = true;
        boolean q = true;

        System.out.println("!p || q)");
        System.out.println(" p    | q    | ? ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(p + " | " + q + " | ");
                System.out.println(!p || q);
                q = !q;
            }
            p = !p;
        }
    }
}


