package com.space._6_Z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 6. Z 字形变换
 *
 * @author: Feng YuJie
 * @create: 2021/10/27 15:15
 */
public class Main_6_1 {

    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(list.toString());

        //不可变对象
        List<String> list1 = Collections.nCopies(1000, "hello");
        list1.add("1");
        System.out.println(list1);
    }
}
