
public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "Programming";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; i < result.length(); j++) {
                if (str.charAt(i) == result.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
