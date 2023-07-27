public class Main {
    public static void main(String[] args) {
        int[][] List = {{1,2,6,},
                        {4,3,6},
                        {9,4,5}
        };

        System.out.println("Matris :" +List );
        for (int [] row:List)
        {
            for (int col :row)
            {
                System.out.print(" " + col + " ");
            }
            System.out.println();
        }
        System.out.println("=============");
        System.out.println("Transpozyonu : ");

        int col = List[0].length;
        for (int i =0;i< col;i++){
            for (int j =0;j<List.length; j++){
                System.out.print( " " +List[j][i] + " ");
            }
            System.out.println();
        }



    }
}