class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        result.add(Arrays.asList(nums[0]));

        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> newResult = new ArrayList<>();
            for (List<Integer> cur : result) {
                for (int j = 0; j <= i; j++) {
                    List<Integer> newCur = new ArrayList<>(cur);
                    newCur.add(j, nums[i]);
                    newResult.add(newCur);
                }
            }
            result = newResult;
        }

        return result;
    }
}

//==>Time complexity O(n*n)
//==>space complexity O(n)