package javaC.Schildt.Chapter_14.Limited_types;

class Stats<T extends Number> {
    T[] nums;
    Stats(T[] o){
        nums = o;
    }

    double average(){
        double sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}
