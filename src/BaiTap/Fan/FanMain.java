package BaiTap.Fan;

public class FanMain {
    public static void main(String[] args) {
        Fan onFan = new Fan();
        Fan offFan = new Fan();
        offFan.setOn(true);
        offFan.toStr();
        onFan.toStr();

    }
}
