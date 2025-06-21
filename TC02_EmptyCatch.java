// TESTCASE 02: Empty catch block, ignored exception
// Expected:
//   • PMD EmptyCatchBlock
//   • Sonar Empty block
//   • Checkstyle EmptyBlock

public class TC02_EmptyCatch {
    public void risky() {
        try {
            int x = 1/0;
        } catch (Exception e) {
            // empty on purpose
        }
    }
} 