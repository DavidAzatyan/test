package Exp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class B {
    public static void main(String[] args) {
        int arr[] = {1};
//        int n = 2;
//        int count = 0;
//        int count1 = 0;
//        if(arr.length > 2) {
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = i; j <= n; j++) {
////                System.out.print(arr[j] + " ");
//
//                    count = 0;
//                    for (int x = i; x <= n; x++) {
//                        if (x != j && arr[x] == arr[j]) {
//                            count++;
//                        }
//                    }
//                    if (count == 1) {
//                        count1++;
//                        break;
//                    }
//                }
//
//                n++;
//                if (n == arr.length) {
//                    break;
//                }
//            }
//            System.out.println(count1);
//        }
//        else{
//            System.out.println(0);
//        }
//        "1990-10-32T17:56:35.422+04:00"

        String birthdate = "1990-10-3";
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = simpleDateFormat.parse(birthdate);
            birthdate = date.toString();
        } catch (ParseException e) {
            birthdate = "false";
        }
        System.out.println(birthdate);
    }
}