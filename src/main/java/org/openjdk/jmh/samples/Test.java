/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjdk.jmh.samples;

import java.util.Iterator;

/**
 * Just a quick test.
 * @author mkosem
 */
public class Test {
    public static void main(String[] args) {
        Iterator<String> iter = new SplitIterator("test,test2,test3,test4,", ',');
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        Iterator<String> iter2 = new SplitIterator2("test,test2,test3,test4,", ',');
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
    }
}
