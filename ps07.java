class ps07 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int contador = 1;

        for(int i = 1; i < nums.length; i++) {
            int elementoActual = nums[i];
            int elementoAnterior = nums[i - 1];

            if(elementoActual != elementoAnterior){
                nums[contador] = nums[i];
                contador++;
            }
        }
        return contador;
    }
}
