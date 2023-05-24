import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");
        for(int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        for(int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        sort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        input.close();
    }

    public static void sort(ArrayList<Number> list) {
        Number tmp = 0;
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i).doubleValue() > list.get(j).doubleValue()) {
                    tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
    }
}
