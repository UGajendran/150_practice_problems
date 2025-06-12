// E D C B A
//   D C B A
//     C B A
//       B A
//         A
class Pattern2{
    public static void main(String[] args){
        int n = 5;
        int a = 65;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i <= j){
                    char c = (char) (a + (n - j));
                    System.out.print(c + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// }
// class Pattern2{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n; j++){
//                 if(i <= j){
//                     System.out.print(j + " ");
//                 }
                
//             }
//             System.out.println();
//         }
//     }
// }