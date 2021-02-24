package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-02-04 22:14
 */
public class TemplatesTest {

    //模板六  prsf  可生成private static final
    private static final Customer cust = new Customer();
    //变形  psf  可生成public static final
    public static final int num = 1;

    //模板一：main方法--psvm
    public static void main(String[] args) {

        //模板二：输出语句 -- sout
        System.out.println();
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));//打印方法的形参
        System.out.println("TemplatesTest.main");//打印方法名字
        System.out.println("args = " + args);//打印变量值（就近选择）
        //模板三 fori
        String[] arr  = new String[]{"tom","jerry","hame","lisja"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter  增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar  普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四 list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        for (Object o : list) {
            System.out.println(list);
        }
        //变形  list.fori普通for循环 正序遍历
        for (int i = 0; i < list.size(); i++) {

        }
        //变形  list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method(){
        //模板五  ifn判断是否为空
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);

        if (list == null) {

        }
        //变形 inn判断是否不为空
        if (list != null) {

        }

    }

}
