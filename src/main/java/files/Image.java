package j110.lab2.files;

import j110.lab1.Books.Book;

public class Image extends File {
    private String format;
    private ImageSize imageSize;

    public Image(String fileName, long size, String format,
                 int imageLength, int imageHeight) {
        super(fileName, size);
        setFormat(format);
        setImageSize(imageLength, imageHeight);
    }

    public String getFormat() { return format; }
    public ImageSize getImageSize() { return imageSize; }

    public void setFormat(String format) { this.format = format; }
    public void setImageSize(int length, int height) {
        this.imageSize = new ImageSize(length, height);
    }
    public void setImageLength(int length) { this.imageSize.setLength(length);}
    public void setImageHeight(int height) { imageSize.setHeight(height);}

    @Override
    public void print() {
        super.print();
        System.out.printf("%s, %s\n", format, getImageSize());
    }

    private static class ImageSize {
        private int length;
        private int height;

        private ImageSize(int length, int height) {
            setLength(length);
            setHeight(height);
        }

        private int getLength() { return length; }
        private int getHeight() { return height; }

        private void setLength(int length) {
            Book.dataVerification(length);
            this.length = length;
        }
        private void setHeight(int height) {
            Book.dataVerification(height);
            this.height = height;
        }

        public String toString() { return length + "x" + height; }
    }
}