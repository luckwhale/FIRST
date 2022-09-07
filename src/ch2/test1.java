/*
 * @Author: Zhaoyikun
 * @Date: 2022-09-07 15:51:59
 * @LastEditors: Zhaoyikun
 * @LastEditTime: 2022-09-07 18:33:25
 * @FilePath: \FIRST\src\ch2\test1.java
 * @Description: 此文件为老师第三次课，课后作业
 * @custom_string_copyright: Copyright (c) by Zhaoyikun, All Rights Reserved. 
 */
package ch2;

import java.util.Scanner;

public class test1 {
    //问题一代码
    public static void countMonth()
    {
        int num[] = {31,29,31,30,31,30,31,31,30,31,31,30};
        int month;
        System.out.println("请输入月份");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        System.out.printf("第%d月的天数为%d\n",month,num[month-1]);
        sc.close();
    }
    //问题二代码（注意断点设置位置要在scanner结束后，否则会报错）
    public static void calculate()
    {
        int num1,num2,answer=0;
        String character;
        char operator;
        System.out.println("请输入两个操作数和操作符");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        character = sc.next();
        sc.close();
        operator = character.charAt(0);
        switch(operator)
        {
            case '+': answer = num1+num2;break;
            case '-': answer = num1-num2;break;
            case '*': answer = num1*num2;break;
            case '/': answer = num1/num2;break;
        }
        System.out.printf("%d %c %d的结果为:%d",num1,operator,num2,answer);
    }
    //问题三代码
    public static void compareValue()
    {
        int num1,num2;
        System.out.println("请输入两个数字");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        System.out.println("比较结果如下：");
        if(num1>num2)
        {
            System.out.printf("%d > %d\n",num1,num2);
        }
        else if(num1==num2)
        {
            System.out.printf("%d = %d\n",num1,num2);
        }
        else
        {
            System.out.printf("%d < %d\n",num1,num2);
        }
    }
    //问题四代码（进行了一定修改，允许阶乘总数变化）
    public static void factorial(int num)
    {
        int answer = 0; //用于存储最后求和的结果
        int save = 1; //用于存储上一次阶乘的结果，简化运算
        for(int i=1;i<=num;i++)
        {
            answer = answer+save;
            save = save*(i+1);
        }
        System.out.printf("阶乘的结果为：%d",answer);
    }
    

    public static void main(String[] args) {
        //countMonth(); //第一问函数
        //calculate(); //第二问函数
        //compareValue(); //第三问函数
        //factorial(10); //第四问函数
    }
    
}
