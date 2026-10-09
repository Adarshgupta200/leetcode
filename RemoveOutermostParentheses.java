class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    res.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    res.append(c);
                }
            }
        }

        return res.toString();
    }
    public static void main(String[] args) {
        RemoveOutermostParentheses obj = new RemoveOutermostParentheses();
        String s = "(()())(())";
        String result = obj.removeOuterParentheses(s);
        
        // Print the result
        System.out.println(result); // Output: "()()()"
    }
}