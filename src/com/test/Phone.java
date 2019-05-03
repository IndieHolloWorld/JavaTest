package com.test;

public class Phone {

    public class Camera{
        private Double cameraSize = Phone.this.size;
        private String cameraScreen = screen;

        @Override
        public String toString() {
            return "Camera{" +
                    "cameraSize=" + cameraSize +
                    ", cameraScreen='" + cameraScreen + '\'' +
                    '}';
        }
    }

    private Double size;
    private String screen;

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }


    public Phone(Double size, String screen) {
        this.size = size;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "size=" + size +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Phone iphone = new Phone(5.7, "蓝宝石");
        Camera camera = iphone.new Camera();
        System.out.println(iphone);
        System.out.println(camera);

    }
}
