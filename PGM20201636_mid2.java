import java.util.Scanner;

public class PGM20201636_mid2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("하나빼기 게임을 시작하겠습니다.");
        System.out.println("0.가위 1.바위 2.보 중 두 가지를 숫자로 선택하여 주십시오.");
        String[] choose = {"가위", "바위", "보"};
        int[] gamer = new int[2];
        int[] computer = new int[2];
        int gamerScore = 0;
        int computerScore = 0;

        while (gamerScore < 5 && computerScore < 5) {
            System.out.print("유저 첫 번째 선택: ");
            gamer[0] = user.nextInt();
            while (gamer[0] < 0 || gamer[0] > 2) {
                System.out.println("잘못된 선택입니다. 0, 1, 2 중에서 선택해주세요.");
                System.out.print("유저 첫 번째 선택: ");
                gamer[0] = user.nextInt();
            }

            System.out.print("유저 두 번째 선택: ");
            gamer[1] = user.nextInt();
            while (gamer[1] < 0 || gamer[1] > 2) {
                System.out.println("잘못된 선택입니다. 0, 1, 2 중에서 선택해주세요.");
                System.out.print("유저 두 번째 선택: ");
                gamer[1] = user.nextInt();
            }

            computer[0] = (int) (Math.random() * 3);
            computer[1] = (int) (Math.random() * 3);
            System.out.printf("컴퓨터 첫 번째 선택: %s\n", choose[computer[0]]);
            System.out.printf("컴퓨터 두 번째 선택: %s\n", choose[computer[1]]);
            System.out.printf("유저의 첫 번째 선택(0): %s\n", choose[gamer[0]]);
            System.out.printf("유저의 두 번째 선택(1): %s\n", choose[gamer[1]]);
            System.out.println("한가지만 골라주세요!!");
            int gamerChoice = user.nextInt();
            while (gamerChoice != 0 && gamerChoice != 1) {
                System.out.println("잘못된 선택입니다. 0 또는 1 중에서 선택해주세요.");
                System.out.print("유저 선택: ");
                gamerChoice = user.nextInt();
            }

            System.out.println("유저 선택: " + choose[gamer[gamerChoice]]);
            int computerChoice = (int) (Math.random() * 2);
            System.out.println("컴퓨터 선택: " + choose[computer[computerChoice]]);

            if (gamer[gamerChoice] == computer[computerChoice]) {
                System.out.println("비겼습니다.");
                gamerScore++;
                computerScore++;
            } else if ((gamer[gamerChoice] == 0 && computer[computerChoice] == 2)
                    || (gamer[gamerChoice] == 1 && computer[computerChoice] == 0)
                    || (gamer[gamerChoice] == 2 && computer[computerChoice] == 1)) {
                System.out.println("유저가 이겼습니다.");
                gamerScore++;
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
                computerScore++;
            }

            System.out.println("유저 점수: " + gamerScore);
            System.out.println("컴퓨터 점수: " + computerScore);
            System.out.println("------------------------------------");
        }

        if (gamerScore == 5) {
            System.out.println("당신이 이겼어요!!");
        } else {
            System.out.println("당신이 졌어요!!");
        }
    }
}