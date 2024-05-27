package Day09;

public class Smartphone {
    public interface Camera{
        void takePhoto();
    }
    public class BasicCamera implements Camera{
        public void takePhoto(){
            System.out.println("사진을 찍습니다.");
        }
    }
    public void activateCamera(){
        Camera camera = new BasicCamera();
        camera.takePhoto();
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.activateCamera();
    }
}
