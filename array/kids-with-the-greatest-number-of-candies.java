class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int n: candies)
        {
            if(n>max)
                max = n;
        }

        List<Boolean> result = new ArrayList<Boolean>();

        for(int n: candies)
        {
            if(n+extraCandies >= max)
                result.add(true);
            else
                result.add(false);

        }

        return result;
    }
}