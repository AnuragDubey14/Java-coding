import java.util.*;

public class CreationOfHashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> arrlist=new ArrayList<Integer>(0);
        int []arr ={2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        for (int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for (int i: map.keySet()){
            int value=map.getOrDefault(i,0);
            if (value>arr.length/3){
                arrlist.add(i);
            }
        }
        int temp = 0;
        for (int i = 0; i < arrlist.size()-1; i++) {
            if (arrlist.get(i)> arrlist.get(i+1)) {
                temp=arrlist.get(i);
                arrlist.set(i, arrlist.get(i+1));
                arrlist.set(i+1,temp);
            }
        }
        }
    }

