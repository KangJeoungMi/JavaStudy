package lotto;

import java.util.Scanner;
import java.util.Random;

public class Lotto {
    // 사용자가 선택한 번호
    static int[] userNumbers = new int[6];
    // 랜덤으로 생성된 당첨 번호
    static int[] winningNumbers = new int[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 수동 또는 자동 선택 받기
        while (true) {
            System.out.print("1. 자동 | 2. 수동 : ");
            String choice = scanner.nextLine();

            if (choice.equals("자동") || choice.equals("1")) {
                autoSelect();
                break;
            } else if (choice.equals("수동") || choice.equals("2")) {
                manualSelect(scanner);
                break;
            }
        }

        // 당첨 번호 생성 및 출력
        generateWinningNumbers();
        printNumbers("당첨 번호", winningNumbers);

        // 당첨 확인 및 결과 출력
        int matchedCount = countMatches(userNumbers, winningNumbers);
        printResult(matchedCount);

        scanner.close();
    }

    // 자동 선택
    public static void autoSelect() {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            userNumbers[i] = random.nextInt(45) + 1;
        }
    }

    // 수동 선택
    public static void manualSelect(Scanner scanner) {
        System.out.println("6개의 숫자를 선택하세요 (1부터 45까지):");

        for (int i = 0; i < 6; i++) {
            System.out.print("숫자 " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }
    }

    // 당첨 번호 생성
    public static void generateWinningNumbers() {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            winningNumbers[i] = random.nextInt(45) + 1;
        }
    }

    // 숫자 배열 출력
    public static void printNumbers(String label, int[] numbers) {
        System.out.println(label + ":");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // 일치하는 번호 개수 세기
    public static int countMatches(int[] userNumbers, int[] winningNumbers) {
        int count = 0;
        for (int userNumber : userNumbers) {
            for (int winningNumber : winningNumbers) {
                if (userNumber == winningNumber) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // 결과 출력
    public static void printResult(int matchedCount) {
        System.out.println("일치하는 번호 개수: " + matchedCount);

        switch (matchedCount) {
            case 6:
                System.out.println("축하합니다! 1등에 당첨되셨습니다.");
                break;
            case 5:
                System.out.println("축하합니다! 2등에 당첨되셨습니다.");
                break;
            case 4:
                System.out.println("축하합니다! 3등에 당첨되셨습니다.");
                break;
            case 3:
                System.out.println("축하합니다! 4등에 당첨되셨습니다.");
                break;
            default:
                System.out.println("아쉽지만 당첨되지 않았습니다. 다음 기회에 다시 도전해주세요!");
        }
    }
}
