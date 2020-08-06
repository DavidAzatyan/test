
//import javaC.shildt.Chapter_8.I__Using_abstract_classes.*;
//class Stack1 {
//
//    int factorial(int i){
//        if(i == 1){
//            return 1;
//        }
//        return i * factorial(i - 1);
//    }
//
//
//    int j = 1000;
//    int s(int i) {
//        if (i%10 == 0) {
//            return 0;
//        }
//        j = j / 10;
//        return i%10 * j + s(i / 10);
//    }
//}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Bender {
    public static List<List<String>> permute(String[] nums) {
        List<List<String>> results = new ArrayList<List<String>>();
        if (nums == null || nums.length == 0) {
            return results;
        }
        List<String> result = new ArrayList<>();
        dfs(nums, results, result);
        return results;
    }

    public static void dfs(String[] nums, List<List<String>> results, List<String> result) {
        if (nums.length == result.size()) {
            List<String> temp = new ArrayList<>(result);
            results.add(temp);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!result.contains(nums[i])) {
                result.add(nums[i]);
                dfs(nums, results, result);
                result.remove(result.size() - 1);
            }
        }
    }


    static int j = 0;

    public static void permute(int[] intArray, int start) {
        for (int i = start; i < intArray.length; i++) {
            int temp = intArray[start];
            intArray[start] = intArray[i];
            intArray[i] = temp;
            permute(intArray, start + 1);
            intArray[i] = intArray[start];
            intArray[start] = temp;
        }

        if (start == intArray.length - 1) {
            System.out.print(Arrays.toString(intArray) + " ");

            System.out.println(++j);
        }
    }

    public static void main(String[] args) {
        String a[] = {"aba", "bbb", "bab"};
        System.out.println(Bender.permute(a));
        boolean t = false;
        int count = 0;
        for (int i = 0; i < Bender.permute(a).size(); i++) {
            for (int j = 0; j < Bender.permute(a).get(i).size() - 1; j++) {
                for (int k = 0; k < Bender.permute(a).get(i).get(j).length(); k++) {
                    if (Bender.permute(a).get(i).get(j).charAt(k) != Bender.permute(a).get(i).get(j + 1).charAt(k)) {
                        count++;
                    }
                    if (count >= 2) {
                        break;
                    }
                }
                if (count < 2) {
                    t = true;
                }
            }
        }
        System.out.println(t);
    }
}

