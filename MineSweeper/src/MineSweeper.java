import java.util.Random;
import java.util.Scanner;

public class MineSweeper  {

    int rowNumber;
    int colNumber;
    int map[][];
    int board[][];
    int size;
    boolean game =true;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

        MineSweeper(int rowNumber , int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size =rowNumber * colNumber;
    }
    public void  run(){
            int row,col , succes= 0;
          prepareGame();
          print(map); // Bir defa yazdırıyorum sonrasında yorum satırına alırım.
        System.out.println("Oyun Başladı !");
        while (game){
            print(board);
            System.out.print("Satır :");
            row = scan.nextInt();
            System.out.print("Sütun :");
            col =scan.nextInt();
            if (row<0 || row > rowNumber-1){
                System.out.println("Geçersiz Sayı ");
                continue;
            }
            if (col<0 || col>colNumber-1){
                System.out.println("Geçersiz Sayı ");
                continue;
            }
            if (map[row][col] !=-1){
                checkMine(row,col);
                succes++;
                if(succes == (size -(size/4))){
                    System.out.println("Tebrikler başardınız !");
                    break;
                }
            }else {
                game =false;
                System.out.println("GAME OVER !");
            }
        }
    }
    public void checkMine(int r , int c){
            if (map[r][c]==0){
            if ((c<colNumber-1) && (map[r][c+1] ==- -1)){
                board[r][c]++;
        }   if ((r<rowNumber-1)&& (map[r+1][c] == -1)){
                board[r][c]++;
        }   if ((r>0) && (map[r-1][c] == -1)){
                board[r][c]++;
        }   if ((c>0) && (map[r][c-1]== -1)) {
                    board[r][c]++;
            }
            if (board[r][c] ==0){
                board[r][c] = -1;
            }
        }
    }
    public void prepareGame(){
          int randRow,randCol, count=0 ;
          while (count !=(size/4)){
              randRow=random.nextInt(rowNumber);
              randCol =random.nextInt(colNumber);
              if (map[randRow][randCol] != -1){
                  map[randRow][randCol] = -1;
                  count++;
              }
          }
    }
    public void print(int[][] arr){
          for(int i = 0; i<arr.length;i++){
              for (int j =0; j<arr[0].length;j++){
                  if(arr[i][j]>=0)
                      System.out.print(" ");

                  System.out.print(arr[i][j] + "");
              }
              System.out.println();
          }
    }

}
