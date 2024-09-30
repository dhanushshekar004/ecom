public class RunLengthEncoding {
    public static void main(String[] args) {
        String input = "aaabbccdaa";
        StringBuilder output = new StringBuilder();
        
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                output.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }
        // Append the last set of characters
        output.append(count).append(input.charAt(input.length() - 1));
        
        System.out.println(output.toString());
    }
}
