//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
class ps01 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1 ; i ++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }

                //Recorre el arreglo hasta encontrar dos ints que se suman
        }
        return new int[]{};

        
    }
}