import java.util.*;

public class ClassRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        ArrayList StudentD = new ArrayList();
//        StudentD.add("Id: "+11805521);
//        StudentD.add("Name: Shaik Azeer Saheb");
//        StudentD.add("Roll No: "+56);
//        StudentD.add(true);
//        StudentD.add(false);
//        System.out.println(StudentD);

//        int a = input.nextInt();
//        ArrayList list = new ArrayList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        ArrayList list1 = new ArrayList();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//        list1.add(40);
//        list1.add(50);
//        list.remove(0);
//        list.add(0,a);
//        list1.remove(list1.size()-1);
//        list1.add(list1.size(),a);
//        System.out.println(list);
//        System.out.println(list1);

//        String a = input.nextLine();
//        ArrayList list = new ArrayList();
//        int len = a.length();
//        for(int i=0; i<len; i++){
//            list.add(a.charAt(i));
//        }
//        System.out.println(list);
//        int a = input.nextInt();
//        String[] list = {"Red","Orange","Yellow","Pink","Green","Blue","Purple","Black","White"};
//        char[] b = list[a].toCharArray();
//        System.out.println(Arrays.toString(b));

//        String[] list = {"Red","Orange","Yellow","Pink","Green","Blue","Purple","Black","White"};
//        ArrayList newList = new ArrayList();
//
//        int a = input.nextInt();
//        for(int i=0; i<a; i++){
//            int b = input.nextInt();
//            newList.add(b);
//
//        }
//        for(int j=0; j<newList.size(); j++){
//            System.out.println(list[newList.indexOf(j)]);
//
//        }

//        int a = input.nextInt();
//        int b = input.nextInt();
//        ArrayList list = new ArrayList();
//        String c = String.valueOf(a);
//        System.out.println(c.repeat(b));
//        for(int i=0; i<b; i++){
//            list.add(a);
//        }
//        System.out.println(list);

//        int[] arr = {12,30,-56,72,11,98,38,76,50,60};
//        int a = input.nextInt();
//        ArrayList list = new ArrayList();
//        for(int i=0; i<arr.length; i++){
//            if (arr[i]>a){
//                list.add(arr[i]);
//            }
//        }
//        System.out.println(list);
//        System.out.println(Arrays.toString(arr));

//        int a = input.nextInt();
//        ArrayList<String> list = new ArrayList<>();
//        for(int i=0; i<=a;){
//            String arrIn = input.nextLine();
//            list.add(arrIn);
//            i++;
//        }
//        System.out.println(list.remove(0));
//        System.out.println(list);

//        int a = input.nextInt();
//        ArrayList<String> arr = new ArrayList<>();
//        for(int i=0; i<=a; i++){
//            String inp = input.nextLine();
//            arr.add(inp);
//
//        }
//        arr.remove(0);
//
//        for(int j=1; j<=a; j++){
//            System.out.println(arr.get((arr.size())-j));
//        }

//        int a = input.nextInt();
//        int[] arr = new int[a];
//        ArrayList<String> list = new ArrayList<>();
//        for(int i=0; i<a; i++){
//            arr[i] = input.nextInt();
//            list.add(Arrays.toString(arr));
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(list);

        int a = input.nextInt();
        int b = input.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0; j<b; j++){
            int k = input.nextInt();
            System.out.println(arr[k]);
        }
        int[] arr1 = Arrays.copyOfRange(arr,1,3);
        System.out.println(Arrays.toString(arr1));
    }
}
