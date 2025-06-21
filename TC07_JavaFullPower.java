public class BadQuality {

    public static void main(String[] args) {
        String userId = args.length > 0 ? args[0] : "1";
        String query = "SELECT * FROM users WHERE id = " + userId; // SQL injection (security hotspot)
        System.out.println(query);
    }

    public void veryLongMethod() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    System.out.println(i * j);
                } else if (i % 3 == 0 || j % 3 == 0) {
                    System.out.println(i - j);
                } else {
                    if (i == j) {
                        System.out.println("eq");
                    } else {
                        System.out.println("neq");
                    }
                }
            }
        }
        try {
            doSomething();
        } catch (Exception e) { // empty catch – style issue
        }
    }

    private void duplicate() {
        System.out.println("dup");
    }

    private void duplicate2() {
        System.out.println("dup");
    }

    private void doSomething() {
        // intentionally left blank
    }
} 