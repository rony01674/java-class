package javaclass_08_01_19;

public class TestTV_Page328 {

    public static void main(String[] args) {
        TV_Page327 tv1 = new TV_Page327();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV_Page327 tv2 = new TV_Page327();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
    }
}
