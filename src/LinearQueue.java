
public class LinearQueue {
    private int[] data;
    private int top,last;

    LinearQueue(int size){
        data=new int[size];
        top=last=-1;
    }


    public void enQueue(int data){
        if(top==-1){
            this.data[++top] =data;
            last++;
        }
        else if(last==this.data.length-1){
            System.out.print("its full");
        } else {
            this.data[++last] =data;
        }
    }

    public int deQueue(){
        if(top==-1){
            throw new NullPointerException("its empty");
        }else {
            int res= data[top++];
            if(top>last){
                top=last=-1;
            }
            return res;
        }

    }

    public void print(){
        for(int i=0; i<data.length ; i++){
            System.out.println(data[i]);
        }
    }


}
