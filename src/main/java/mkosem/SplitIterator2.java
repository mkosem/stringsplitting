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
public class SplitIterator2 implements Iterator<String> {

    private final String _source;
    private final char _delim;

    private int _start = 0;
    private int _end;

    public SplitIterator2(String argString, char argDelim) {
        _source = argString;
        _delim = argDelim;
        _end = argString.indexOf(_delim);
    }

    @Override
    public boolean hasNext() {
        return _end != -1;
    }

    @Override
    public String next() {
        String value;
        if (_end != -1) {
            value = _source.substring(_start, _end);
            _start = _end + 1;
        } else if (_start != -1) {
            value = _source.substring(_start);
            _start = _end;
        } else {
            throw new NoSuchElementException();
        }
        _end = _source.indexOf(_delim, _start);
        return value;
    }
}
