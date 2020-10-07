public class RegExExperiment {
    public static void main(String[] args) {
        String validPhone ="(705) 555-1234";
        String invalidPhone = "123-456-7890";
        String regExPhone = "\\(?[2-9]\\d{2}\\)?[-\\s]?[2-9]\\d{2}[-\\s]?\\d{4}";
        System.out.printf("%s is valid: %b%n",validPhone,validPhone.matches(regExPhone));
        System.out.printf("%s is valid: %b%n",invalidPhone, invalidPhone.matches(regExPhone));
    }
}
