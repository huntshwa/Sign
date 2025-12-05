public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        int lines = 0;

        for (int i = 0; i < message.length();i += width)
            lines++;

        return lines;
    }

    public String getLines() {
        int lines = numberOfLines();
        String fMessage = "";

        for (int i = 0; i < lines - 1; i++)
            fMessage += message.substring(i * width, (i + 1) * width) + ";";

        fMessage += message.substring((lines - 1) * width);

        return fMessage;
    }

}
