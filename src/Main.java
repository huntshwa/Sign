public class Main {
    public static void main(String[] args) {
        String str;
        int x;

        Sign[] signList = new Sign[5];
        signList[0] = new Sign("ABC222DE", 3);
        signList[1] = new Sign("ABCD", 10);
        signList[2] = new Sign("ABCDEF", 6);
        signList[3] = new Sign("", 4);
        signList[4] = new Sign("AB_CD_EF", 2);
        for (int i = 0; i < 5; i++) {
            x = signList[i].numberOfLines();
            str = signList[i].getLines();

            System.out.println(x + ": " + str);
        }
    }
}
