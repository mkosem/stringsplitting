/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkosem;

import java.util.Iterator;

/**
 * Just a quick test.
 *
 * @author mkosem
 */
public class Test {

    private static final String STRING = "blarg.bloop.blerg.bloooooh.blor.blerrrrrrp.bleep.bloor.blarg.bloon.blerg.bloooooh.blop.blerrrrrrp";

    public static void main(String[] args) {
        int start = 0;
        int end = STRING.indexOf('.');
        while (end != -1) {
            System.out.println(STRING.substring(start, end));
            start = end + 1;
            end = STRING.indexOf('.', start);
        }
        System.out.println(STRING.substring(start));

        System.out.println();
        Iterator<String> iter = new SplitIterator(STRING, '.');
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();
        Iterator<String> iter2 = new SplitIterator2(STRING, '.');
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        System.out.println();
        Iterator<String> iter3 = new SplitIterator3(STRING, '.');
        while (iter3.hasNext()) {
            System.out.println(iter3.next());
        }
    }
}
