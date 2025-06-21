package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*; // Unused wildcard import
import java.util.concurrent.*; // Another unused import

public class QualityIssues {

    public static String PUBLIC_CONSTANT = "shouldBeFinal"; // Public non-final field

    private static List cachedList = new ArrayList(); // Raw type, non-thread-safe static field

    // Long method containing many diverse problems for quality scanners to detect
    public void doEverything(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        int unusedVar = 42; // Unused local variable

        // Deeply nested conditional blocks
        if (a > 0) {
            if (b > 0) {
                if (c > 0) {
                    if (d > 0) {
                        if (e > 0) {
                            if (f > 0) {
                                if (g > 0) {
                                    System.out.println("Too deep");
                                }
                            }
                        }
                    }
                }
            }
        }

        // Magic number and pointless loop body
        for (int k = 0; k < 1234; k++) {
            /* do nothing */
        }

        // TODO: refactor this blocking call
        try {
            Thread.sleep(5000); // Magic number + Thread.sleep in production code
        } catch (InterruptedException ex) {
            // Ignored on purpose (bad practice)
        }

        // Potential NPE because canBeNull is obviously null
        String canBeNull = null;
        if (canBeNull.equals("test")) { // NPE here
            System.out.println("never reached");
        }

        // Duplicate code sample (two identical lines)
        System.out.println("duplication1");
        System.out.println("duplication1");

        // Not using try-with-resources and swallowing exception
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException eio) {
            // Swallowed exception
        }
        // Resource leak: reader not closed

        while (true) { // Infinite loop construct
            break; // Immediately exits but still flagged by some tools
        }

        // Unnecessary call to System.gc()
        System.gc();

        // Ridiculously long line for maximum line-length violations — Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
    }

    // Synchronizing on a non-final field
    private Object lock = new Object();

    public void unsafeSync() {
        synchronized (lock) {
            System.out.println("not safe");
        }
    }

    // Unused private method
    private void unused() {}

    public void genericException() throws Exception { // Throws overly broad Exception
        throw new Exception("Bad");
    }

    // Method with too many return statements and cyclomatic complexity
    public int trickyReturn(int x) {
        if (x == 0) return 0; if (x == 1) return 1; if (x == 2) return 2; if (x == 3) return 3; if (x == 4) return 4; return -1;
    }
} 