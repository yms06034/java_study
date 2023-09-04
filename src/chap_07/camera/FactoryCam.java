package chap_07.camera;

public class FactoryCam extends Camera {
    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void detectFire() {
        System.out.println(this.name + " : 화재를 감지합니다.");
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재감지");
    }
}
