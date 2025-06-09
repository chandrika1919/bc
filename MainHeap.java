import java.util.*;
public class MainHeap {
    public static void main(String[] args){
        PriorityQueue<Integer>mainHeap=new PriorityQueue<>();
        mainHeap.add(10);
        mainHeap.add(5);
        mainHeap.add(20);
        mainHeap.add(3);
        while(!mainHeap.isEmpty()){
            System.out.print(mainHeap.poll()+"");
        }
    }
}
