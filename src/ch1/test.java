package ch1;

/*
 * @Author: Zhaoyikun
 * @Date: 2022-08-31 11:24:00
 * @LastEditors: Zhaoyikun
 * @LastEditTime: 2022-09-02 08:22:22
 * @FilePath: \FIRST\src\ch1\test.java
 * @Description: 
 * @custom_string_copyright: Copyright (c) by Zhaoyikun, All Rights Reserved. 
 */

//package ch1.test;

public class test {
    int testAge;

    public test(String name) {
        // 类的构造器只需要一个名字参数:name
        System.out.println("小狗的名字是：" + name);
    }

    public void setAge(int age) {
        testAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为：" + testAge);
        return testAge;
    }

    public static void main(String[] args) {
        if(args.length==0)
        {
            test Mytest = new test("lucy");
            Mytest.setAge(10);
            Mytest.getAge();
            System.out.println("变量值："+Mytest.testAge);
        }
        else
        {
            String dog_name = args.toString();
            test Mytest = new test(dog_name);
            Mytest.setAge(8);
            Mytest.getAge();
            System.out.println("变量值："+Mytest.testAge);
        }

    }
}