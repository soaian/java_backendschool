package day13.problem2;

public class FileReadWriteApp {
    public static void main(String[] args) {
        Thread fileReader = new Thread(new FileReaderTask());
        Thread fileWriter = new Thread(new FileWriterTask());

        fileReader.start();
        fileWriter.start();
    }
}
