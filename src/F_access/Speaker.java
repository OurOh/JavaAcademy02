package F_access;

public class Speaker {
    private int volume;              // Speaker 클래스의 인스턴스 변수, 멤버변수(필드)이다.

    Speaker(int volume){     // 생성자: Speaker(int volume)
        this.volume = volume;
    }
    //메서드 생성
    void volumeUp(){
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }
    void showVolume(){
        System.out.println("현재음량 :" +volume);
    }
}
