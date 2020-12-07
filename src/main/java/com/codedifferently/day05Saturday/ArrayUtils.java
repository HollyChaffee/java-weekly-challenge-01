package com.codedifferently.day05Saturday;

import java.util.ArrayList;
import java.util.Arrays;



public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer num = 0;
        for (Integer i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount)
                num++;
        }
        return num;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int count = 0;
        for (Object number : objectArray) {
            if (number.equals(objectToRemove)) {
                count++;
            }
        }
        if (count == 0) {
            return  objectArray;
        }
        Object[] resultNum = new Object[objectArray.length - count];
        int i = 0;
        for (Object newNum : objectArray) {
            if (newNum != objectToRemove) {
                resultNum[i] = newNum;
                i++;
            }
        }
        return resultNum;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        int count = 1;
        int tempCount = 0;
        Object temp;
        Object mostCommonNum = objectArray[0];

        for (int i = 0; i < objectArray.length - 1; i++) {
            temp = objectArray[i];
            tempCount = 0;

            for(int j = 1; j < objectArray.length;j++) {
                if (temp == objectArray[j]) {
                    tempCount++;
                }
                if (tempCount > count) {
                    mostCommonNum = temp;
                    count = tempCount;
                }
            }
        }
        return mostCommonNum;
    }



        /**
         * @param objectArray an array of any type of Object
         * @return the least frequently occurring object in the array
         * given an array of objects, named `objectArray` return the least frequently occuring object in the array
         */
        public static Object getLeastCommon (Object[]objectArray){
            int count = 1;
            int tempCount = 0;
            Object temp;
            Object leastCommonName = objectArray[0];

            for (int i = 0; i < objectArray.length - 1; i++) {
                temp = objectArray[i];
                tempCount = 0;

                for(int j = 1; j < objectArray.length;j++) {
                    if (temp == objectArray[j]) {
                        tempCount++;
                    }
                    if (tempCount < count) {
                        leastCommonName = temp;
                        count = tempCount;
                    }
                }
            }
            return leastCommonName;
        }
        /**
         * @param objectArray      an array of any type of Object
         * @param objectArrayToAdd an array of Objects to add to the first argument
         * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
         * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
         */
        public static Object[] mergeArrays (Object[]objectArray, Object[]objectArrayToAdd){
            int counter = 0;
            Object[] mergedArray = new Object[objectArray.length + objectArrayToAdd.length];

            for (int i = 0; i < objectArray.length; i++ ) {
                mergedArray[i] = objectArray[i];
                counter++;

            }
            for (int j = 0; j < objectArrayToAdd.length; j++) {
                mergedArray[counter++] = objectArrayToAdd[j];
            }


            return mergedArray;
        }
}

