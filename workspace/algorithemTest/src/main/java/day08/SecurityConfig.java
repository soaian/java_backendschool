package day08;

public final class SecurityConfig {
    private static final String ENCRYPTION_KEY = "ComplexKey123!";

    private SecurityConfig() {
        // 생성자를 private으로 선언하여 외부에서 인스턴스화 방지
    }

    public static String getEncryptionKey() {
        return ENCRYPTION_KEY;
    }
}



