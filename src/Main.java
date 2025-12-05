public class Main {
    public static void main(String[] args) {
        String str;
        int x;

        Sign[] signList = new Sign(5);
        Sign signList[] = new Sign("ABC222DE", 3);
        Sign signList[] = new Sign("ABCD", 10);
        Sign signList[] = new Sign("ABCDEF", 6);
        Sign signList[] = new Sign("", 4);
        Sign signList[] = new Sign("AB_CD_EF", 2);
        for (int i = 0; i < 5; i++) {
            x = sign1.numberOfLines();
            str = sign1.getLines();

            System.out.println(x + "; " + str);
        }




    }
}
