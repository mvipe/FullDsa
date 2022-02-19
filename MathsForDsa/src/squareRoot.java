public class squareRoot {
    //finding a square root of a number in integer value
    public static void main(String[] args) {

        System.out.println(sqrtBinary(39));
    }

    //finding square root of a number in simple way
    static int sqrtSimple(int num){

        for(int i=1;i<=num;i++){
            if(i*i==num) return i;

            if(i*i>num) return -1;
        }

        return -1;
    }

    //finding square root of a number with Binary Search
    static int sqrtBinary(int num){
        int start=1;
        int end=num;

        while(start<end){
            int middle=start+(end-start)/2;
            if(middle*middle==num){
                return middle;
            }else if(middle*middle>num){
                end=middle-1;
            }else{
                start=middle+1;
            }
        }


        return -1;
    }
}
