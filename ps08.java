class ps08 {
    public int removeElement(int[] nums, int val) {
        int contador = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[contador] = nums[i];
                contador++;
            }
        }

        return contador;
    }
}