package StackAndQueue.Basic;

public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); //it will call CustomStack(size)
    }

    @Override
    public boolean push(int item) {
        //if the data is full
        if(this.isFull()){
            //double the array size
            int newArr[]=new int [this.data.length*2];

            //copy all previous items in new data
            for (int i = 0; i <data.length ; i++) {
                newArr[i]=data[i];
            }

            data=newArr;

        }

        //at this point the data is not full
        return super.push(item);
    }
}
