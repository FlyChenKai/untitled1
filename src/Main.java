import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Map<String,String> map=new HashMap<>(5);
        for(int i=0;i<5;i++)
            map.put(String.valueOf(i),String.valueOf(i*i));
        for(Map.Entry<String,String> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(map.get("1"));
        System.out.println(map.keySet());

        Set<String> set=new HashSet<>();
        for(int i=0;i<7;i++){
            set.add(String.valueOf(i));
        }
        set.add("1");
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.shuffle(list);
       for(int i:list)
           System.out.print(i);

    }
}
