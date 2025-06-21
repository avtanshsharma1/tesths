// TESTCASE 01: File name vs class name mismatch + missing class Javadoc
// Expected:
//   • Checkstyle OuterTypeFilename
//   • Checkstyle MissingJavadocType
//   • PMD NoPackage (also caught)

public class WrongName {
    public static void main(String[] args) {
        System.out.println("Mismatch!"); // simple print
    }
} 