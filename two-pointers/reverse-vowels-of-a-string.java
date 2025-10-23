class Solution {
    public String reverseVowels(String s) {
        char[] temp = s.toCharArray();
        String example = "aeiouAEIOU";
        int js = temp.length-1;
        for(int i = 0; i<temp.length-2;i++) 
        {
            char target = temp[i];
            if(example.indexOf(target) != -1)
            {
                for(int j = js;i<j;j--)
                {
                    js--;
                    char target2 = temp[j];
                    if(example.indexOf(target2) != -1)
                    {
                        char temp2 = temp[i];
                        temp[i] = temp[j];
                        temp[j] = temp2;
                        break;
                    }
                }

            }
        }
        s = new String(temp);
        return s;
    }
}