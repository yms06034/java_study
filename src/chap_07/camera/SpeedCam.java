package chap_07.camera;

public class SpeedCam extends Camera {
    public SpeedCam() {
        this.name = "과속단속 카메라";
    }
    public void checkSpeed() {
        System.out.println(this.name + " : 속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println(this.name + " : 차량번호를 인식합니다.");
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 층정, 차량 번호 인식");
    }

}
