public class Human implements Cloneable {
    int age;
    String name;
    int [] arr;

    public Human(int age,String name) {
        this.age = age;
        this.name=name;
        this.arr=new int[]{3,6,8};
    }

//    public Human(Human other){
//        this.age= other.age;
//        this.name= other.name;
//    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        //this is shallow copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //this is deep copy

        Human twin=(Human) super.clone();//this is actually shallow copying

        //make the deep copying
      twin.arr=new int[twin.arr.length];
      for(int i=0;i<twin.arr.length;i++){
          twin.arr[i]=this.arr[i];
      }
      return twin;
    }
}
