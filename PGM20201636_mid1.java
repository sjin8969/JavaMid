import java.util.Scanner;
public class PGM20201636_mid1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("가위 바위 보 게임을 시작하겠습니다.");
        System.out.println("0.가위 1.바위 2.보를 숫자로 선택하여 주십시오.");
        String[] choose = {"가위", "바위", "보"};
        int gamer;
        int computer = (int) (Math.random() * 3);
        while (true) { 														
            gamer = user.nextInt();
            if (gamer < 0 || gamer > 2) {
                System.out.println("잘못된 선택입니다. 0, 1, 2 중에서 선택해주세요.");
            } else {
                break;
            }
        }
        System.out.println("유저 선택: " + choose[gamer]);
        System.out.println("컴퓨터 선택: " + choose[computer]);

        if (gamer == computer) {
            System.out.println("비기셨습니다.");
        } else if ((gamer == 0 && computer == 2) || (gamer == 1 && computer == 0) || (gamer == 2 && computer == 1)) {
            System.out.println("승리하셨습니다.");
        } else {
            System.out.println("패배하셨습니다.");
        }
    }
}