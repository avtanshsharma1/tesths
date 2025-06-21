// TESTCASE 03A: duplicate code block part A
// Expected:
//   • Sonar duplicated lines / PMD CPD when paired with part B

public class TC03_DuplicateCodeA {
    public int add(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += 1;
        }
        return a + sum;
    }
} 