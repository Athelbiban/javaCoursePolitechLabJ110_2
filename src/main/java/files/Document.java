package files;

public class Document extends File {
    private String format;
    private int countPage;

    public Document(String fileName, long size, String format, int countPage) {
        super(fileName, size);
        this.format = format;
        this.countPage = countPage;
    }

    public String getFormat() { return format; }
    public int getCountPage() { return countPage; }

    public void setFormat(String format) {
        Verification.dataVerification(format);
        this.format = format;
    }
    public void setCountPage(int countPage) {
        Verification.dataVerification(countPage);
        this.countPage = countPage;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("%s, %d pages\n", format, countPage);
    }
}