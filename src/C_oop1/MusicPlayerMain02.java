package C_oop1;

import B_ref.Data;

/**
 * 음악 플레이어와 관련된 데이터 묶기
 */
public class MusicPlayerMain02 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
//음악 플레이어 켜기
       on(data);
//볼륨 증가
        volumeUp(data);
//볼륨 증가
        volumeUp(data);
//볼륨 감소
        volumeDown(data);
//음악 플레이어 상태
        showStatus(data);
//음악 플레이어 끄기
       off(data);
    }

    
    //메서드 만들기
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
