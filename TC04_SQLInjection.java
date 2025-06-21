// TESTCASE 04: Potential SQL Injection
// Expected:
//   • Sonar Security hotspot (SQL injection)
//   • PMD AvoidDuplicateLiterals maybe, but main is for Sonar

import java.sql.Connection;
import java.sql.Statement;

public class TC04_SQLInjection {
    public void insecureQuery(Connection conn, String userId) throws Exception {
        Statement st = conn.createStatement();
        // Vulnerable concatenation
        String sql = "SELECT * FROM users WHERE id = " + userId;
        st.executeQuery(sql);
    }
} 