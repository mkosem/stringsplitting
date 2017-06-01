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
public class SplitIterator implements Iterator<String> {
    private final String _source;
    private final char _delim;

    private int _nextStart = 0;

    public SplitIterator(String argSource, char argDelim) {
        _source = argSource;
        _delim = argDelim;
    }

    @Override
    public boolean hasNext() {
        return _nextStart != -1;
    }

    @Override
    public String next() {
        int start = _nextStart;
        if (start == -1) {
            throw new NoSuchElementException();
        } else {
            _nextStart  = _source.indexOf(_delim, start);
            return _nextStart == -1 ? _source.substring(start) : _source.substring(start, _nextStart++);
        }
    }
}
