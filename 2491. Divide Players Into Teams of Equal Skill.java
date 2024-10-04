class Solution {
    public long dividePlayers(int[] skill) {
        if (skill.length < 2)
            return -1 ;

        Arrays.sort(skill);
        int sum = skill[0] + skill[skill.length-1];
        long ans = 0;
        int left = 0;
        int right = skill.length - 1;

        while (left < right) {
            if (skill[left] + skill[right] != sum)
                return -1;

            ans += skill[left] * skill[right]; 
            left += 1;
            right -= 1;
        }
        return ans;
    }
}
