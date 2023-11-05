package j110.lab2.files;

import j110.lab1.Books.Book;

public class Video extends Media {
    private PictureSize pictureSize;

    public Video(String fileName, long size, String format,
                 String description, long durationInMS,
                 int pictureLength, int pictureHeight) {
        super(fileName, size, format, description,  durationInMS);
        setPictureSize(pictureLength, pictureHeight);
    }

    public PictureSize getPictureSize() { return pictureSize; }

    public void setPictureSize(int length, int height) {
        this.pictureSize = new PictureSize(length, height);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.getPictureSize());
    }

    private static class PictureSize {
        private int length;
        private int height;

        private PictureSize(int length, int height) {
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