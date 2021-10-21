public class patternQuestions {
    public static void main(String[] args) {
        triangle1(4,0);
    }

    static void triangle1(int row,int col){
        if(row==0) return;
        if(col<row){
            System.out.print("*");
            triangle1(row,col+1);
        }else{
            System.out.println();
            triangle1(row-1,0);
        }
    }
}
