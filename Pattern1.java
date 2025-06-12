// 1 1 1 1 1
// 2       5
// 3       5
// 4       5
// 1 1 1 1 1
class Pattern{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n){
                    System.out.print("1 ");
                }
                else if(j != 1 && j != 5){
                    System.out.print("  ");
                }
                else if(j == 5){
                    System.out.print(n + " ");
                }
                else if(i != 1 && i != 5){
                    if(j == 1){
                        System.out.print(j + " ");
                    }
                }
                
            }
            System.out.println();
        }
    }
}