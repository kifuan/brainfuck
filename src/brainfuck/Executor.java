package brainfuck;

import java.io.IOException;
import java.util.Scanner;

public final class Executor {
    private final int[] data = new int[256];
    private int ptr = 0;

    public int nextRight(char[] codeArr, int i) {
        int leftCnt = 0;
        while (true) {
            if (codeArr[i] == '[') leftCnt++;
            if (codeArr[i] == ']') leftCnt--;
            if (leftCnt == 0) break;
            i++;
        }
        // The pointer will point to next character of ']'
        return i+1;
    }

    public int prevLeft(char[] codeArr, int i) {
        int rightCnt = 0;
        while (true) {
            if (codeArr[i] == '[') rightCnt--;
            if (codeArr[i] == ']') rightCnt++;
            if (rightCnt == 0) break;
            i--;
        }
        // The pointer will point to '['
        return i;
    }

    public void execute(String code) throws IOException {
        char[] codeArr = code.toCharArray();
        int i = 0;
        while (i < codeArr.length) {
            switch (codeArr[i]) {
                case '>':
                    ptr++;
                    break;
                case '<':
                    ptr--;
                    break;
                case '+':
                    data[ptr]++;
                    break;
                case '-':
                    data[ptr]--;
                    break;
                case '.':
                    System.out.print((char) data[ptr]);
                    break;
                case ',':
                    data[ptr] = System.in.read();
                    break;
                case '[': {
                    if (data[ptr] == 0) {
                        i = nextRight(codeArr, i);
                        continue;
                    }
                    break;
                }
                case ']': {
                    i = prevLeft(codeArr, i);
                    continue;
                }
                default:
                    // ignore unsupported characters
                    break;
            }

            i++;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Executor e = new Executor();
        while (in.hasNextLine()) {
            e.execute(in.nextLine());
        }
    }
}
