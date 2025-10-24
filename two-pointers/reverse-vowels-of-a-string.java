class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        Set<Character> example = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        int i = 0;
        int j = word.length-1;
        while(j>i)
        {
            while(i<j&&!example.contains(word[i])) i++;
            while(i<j&&!example.contains(word[j])) j--;
            if(i<j)
            {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;

            }
            

        };
        String result = new String(word);
        return result;
    }
}