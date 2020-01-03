package org.zxl.springbootdemo.masterslavedb.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by 123456 on 2019/8/5.
 */
public class CollectionTest {
    public static void main(String[] args) {
//        List a = new LinkedList<>();
//        Map b = new HashMap<>();
        int[] c = new int[3];
        for(int i = 0 ; i<c.length; i++){
            System.out.println(c[i]);
        }
        String a = "1232";
        String b = a;
        System.out.println(a+";;;"+b);
        a = "123123222";
        System.out.println(a+";;;"+b);

        Boolean d = new Boolean(false);
        Boolean e =d;
        System.out.println(d+";;;"+e);
        d = true;
        System.out.println(d+";;;"+e);

        int f =0;
        int g = f;
        System.out.println(f+";;;"+g);
        f=9;

        System.out.println(f+";;;"+g);

    }
}
