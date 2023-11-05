package j110.lab2.files;

public class Main {
    public static void main(String[] args) {

        // создайте массив и заполните его объектами всех имеющихся типов
        File[] filesArr = new File[4];
        filesArr[0] = new Document("j110-lab2-hiers.docx", 23212L,
                "docx", 2);
        filesArr[1] = new Image("spb-map.png", 1703527L,
                "image", 1024, 3072);
        filesArr[2] = new Media("06-PrettyGirl.mp3", 7893454L,
                "audio", "Eric Clapton, Pretty Girl",
                328000L);
        filesArr[3] = new Video("BackToTheFuture1.avi", 1470984192L,
                "video", "Back to the future I, 1985",
                6488000L, 640, 352);

        // распечатайте содержимое массива при помощи метода printAll()
        File.printAll(filesArr);

        // создайте массив на базе одного из дочерних типов с несколькими объектами
        Image[] imagesArr = new Image[3];
        imagesArr[0] = new Image("myfoto_1.jpg", 2475922L,
                "image", 2048, 4096);
        imagesArr[1] = new Image("myfoto_2.jpg", 1198404L,
                "image", 1323, 1980);
        imagesArr[2] = new Image("myfoto_3.jpg", 5327209L,
                "image", 4660, 3590);

        // Распечатайте содержимое массива тем же printAll()
        // данный метод подходит для массива дочернего типа
        // т.к. дочерний тип принадлежит типу File
        System.out.println();
        File.printAll(imagesArr);
    }
}
