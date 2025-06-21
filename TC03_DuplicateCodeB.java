// TESTCASE 03B: duplicate code block part B (identical to part A)
// Expected:
//   • Sonar duplicated lines / PMD CPD

public class TC03_DuplicateCodeB {
    public int add(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += 1;
        }
        return a + sum;
    }
} 