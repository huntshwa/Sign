public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        String iMessage = message;
        int lines = 0;

        while (iMessage.length() != 0) {
            iMessage = iMessage.substring(0, width);
        }
    }

    public String getLines() {

    }

}
