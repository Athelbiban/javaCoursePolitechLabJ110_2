package files;

public abstract class File {
    private String fileName;
    private long size;

    public File(String fileName, long size) {
        setFileName(fileName);
        setSize(size);
    }

    public String getFileName() { return fileName; }
    public long getSize() { return size; }

    public void setFileName(String fileName) {
        Verification.dataVerification(fileName);
        this.fileName = fileName;
    }
    public void setSize(long size) {
        Verification.dataVerification(size);
        this.size = size;
    }

    public void print() {
        System.out.printf("%-20s|%10d|", this.getFileName(), this.getSize());
    }

    public static void printAll(File[] files) {
        Verification.dataVerification(files);
        System.out.println("____________________" +
                "____________________" +
                "____________________");
        System.out.printf("%20s|%10s|%s\n", "File name     ", "Size   ", "Details");
        System.out.println("____________________" +
                "____________________" +
                "____________________");
        for (File file : files) {
            file.print();
        }
        System.out.println("____________________" +
                "____________________" +
                "____________________");
    }
}