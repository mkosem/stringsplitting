/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkosem;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author mkosem
 */
public class SplitIterator3 implements Iterator<String> {
    private final char[] _source;
    private final char _delim;
    private int _last = -1;

    public SplitIterator3(String argSource, char argDelim) {
        _source = argSource.toCharArray();
        _delim = argDelim;
    }

    @Override
    public boolean hasNext() {
        return _last < _source.length;
    }

    @Override
    public String next() {
        int last = _last + 1;
        int end = last;
        while (_source[end] != _delim && ++end < _source.length) {
        }
        if (last < _source.length) {
                return new String(_source, last, (_last = end) - last);
        }
        throw new NoSuchElementException();
    }
}
