package com.grm.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author grm
 */
public class Test01 {
    private String str;
    private long startTime;
    private long endTime;


    @Before
    public void bofore() {
        str="qweasxzfdhgjhkqwertyfugjbkgkfgjvncnhjdhdhffgkaiuhdfnhvygetdkd,ldoifitff";
        startTime=System.currentTimeMillis();
    }

    @After
    public void after(){
        endTime=System.currentTimeMillis();
        System.out.println("花费的时间为:"+(endTime-startTime));
    }

    @Test
    public void testMaxLength() {
        //保存最后的结果
        int maxLength = 0;
        //如果字符串为空
        if (str== null || "".equals(str.trim())) {
            return;
        }
        //创建存储字符串的集合
        List<Character> list = new ArrayList<Character>();
        //字符串长度
        int len = 0;
        //每次循环开始的索引
        int start = 0;
        while (start < str.length()) {
            if (list.contains(str.charAt(start))) {
                //如果list中包含字符，则把集合清空
                list.clear();
                //重新设置开始索引
                start = start - len + 1;
                if (len > maxLength) {
                    //与原先的最大字符串比较，如果比原先的大，就用当前获得的长度替换
                    maxLength = len;
                }
                len = 0;

            } else {
                //如果list中不包含字符，则集训存入
                list.add(str.charAt(start));
                //开始索引
                start++;
                //当前长度
                len++;
            }

        }
        System.out.println(maxLength);
    }

}
