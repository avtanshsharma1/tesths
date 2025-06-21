// Bad naming conventions to trigger Checkstyle/PMD rules
public class badNaming { // class not CamelCase
    public static final int Foo = 42; // constant not all caps

    public void BAD_method() { // method name not camelCase
        int A = 0; // variable single uppercase letter
        int very_long_variable_name_that_exceeds_the_limit_of_what_is_reasonable = 123; // overly long
        System.out.println(A + Foo + very_long_variable_name_that_exceeds_the_limit_of_what_is_reasonable);
    }
} 