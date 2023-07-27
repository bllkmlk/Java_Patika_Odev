import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] List = {10,50,60,50,10,15,89,61,37,61};
        Arrays.sort(List);
        System.out.println("Diziyi Sıralayalım : " +Arrays.toString(List));
        int count = 1;
        for (int i =0;i< List.length;i++){
            if(i ==0){
                for (int j=0;j<List.length;j++){
                    if((i!=j) && (List[i] == List[j])){
                        count++;
                        System.out.println(List[i] + " sayısı " + count + " tekrar edildi.");
                    }
                }
            }else if(List[i] != List[i-1]){
                for (int j =0;j<List.length;j++){
                    if ((i!=j) && List[i] ==List[i-1]){
                        count++;
                    }
                }
                System.out.println(List[i] + " sayısı " + count + " tekrar edildi.");
            }
            count =1; // min tekrar
        }
    }
}