import java.awt.event.KeyEvent;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        String[] str1 = {"A","B","C"};
        String[] str2 = {"D","E","F"};
        String[] str3 = {"G","H","I"};
        String[] str4 = {"J","K","L"};
        String[] str5 = {"M","N","O"};
        String[] str6 = {"P","Q","R","S"};
        String[] str7 = {"T","U","V"};
        String[] str8 = {"W","X","Y","Z"};

        Map<Integer,String[]> map = new HashMap<>(16);
        map.put(0,null);
        map.put(1,null);
        map.put(2,str1);
        map.put(3,str2);
        map.put(4,str3);
        map.put(5,str4);
        map.put(6,str5);
        map.put(7,str6);
        map.put(8,str7);
        map.put(9,str8);
        System.out.println("input(输入数字外的其他退出) : ");
        Scanner scanner = new Scanner(System.in);
        List<String[]> list = new ArrayList<>();
        while(scanner.hasNextInt()) {
            String[] strings = map.get(scanner.nextInt());
            list.add(strings);

        }
        switch (list.size()){
            case 1:
                for (String s:list.get(0)) {
                    System.out.println(s);
                }
                break;
            case 2:
                for (int i=0 ; i<list.get(0).length;i++){
                    for (int j = 0 ; j<list.get(1).length;j++){
                        System.out.print(list.get(0)[i]+list.get(1)[j]+" ");
                    }
                }
            case 3:
                for (int i =0 ;i<list.get(0).length ; i++){
                    for (int j=0;j<list.get(1).length ; j++){
                        for (int k = 0;k<list.get(2).length ; k++){
                            System.out.print(list.get(0)[i]+list.get(1)[j]+list.get(2)[k]+" ");
                        }
                    }
                }
        }
    }

}
