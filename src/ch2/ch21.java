/*
 * @Author: Zhaoyikun
 * @Date: 2022-09-02 08:20:58
 * @LastEditors: Zhaoyikun
 * @LastEditTime: 2022-09-07 17:53:28
 * @FilePath: \FIRST\src\ch2\ch21.java
 * @Description: 
 * @custom_string_copyright: Copyright (c) by Zhaoyikun, All Rights Reserved. 
 */
package ch2;

public class ch21 {
    static boolean bool;
    static byte by;
    static char h=(char)6550;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;
    public static void print(int num){
        for(int i=31;i>=0;i--){
            System.out.print((num & 1 << i) == 0 ? "0":"1");
        }	
    }
    
    public static void main(String[] args) {
        System.out.println("Bool:"+bool);
        System.out.println("Byte:"+by);
        System.out.println("Character:"+h);
        print(2);
    
    }
    
}
