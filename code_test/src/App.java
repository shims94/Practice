import java.util.Scanner;

import backjoon.backjoon2501;

public class App {
    public static void main(String[] args) throws Exception {
        int n,k;

        Scanner sc = new Scanner(System.in);
        backjoon2501 bj2501 = new backjoon2501();

        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println(bj2501.solution(n, k));
    }
}
