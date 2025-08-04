class Leaders{
    public static void main(String[] args){
        int[] arr = {16,17,4,3,5,2};
        int max = 0;
        StringBuilder res = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                res.insert(0,max + " ");
            }
        }
        System.out.println(res);
    }
    //O(N) Solution Approach
}