package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeOff(data);
        powerControl(data);
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeOff(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void powerControl(MusicPlayerData data) {
        System.out.println("플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
