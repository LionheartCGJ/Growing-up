package shiyanlou.reverse.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

class ReverseList<T> extends ArrayList<T> {

    private static final long serialVersionUID = 1L;

    public ReverseList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            int ReverseCursor = size() - 1;

            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    @Override
                    public boolean hasNext() {
                        return ReverseCursor >= 0;
                    }

                    @SuppressWarnings("unchecked")
                    @Override
                    public T next() {
                        int i = ReverseCursor;
                        if (i < 0)
                            throw new NoSuchElementException();
                        Object[] elementData = toArray();
                        return (T) elementData[ReverseCursor--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException("remove");
                    }
                };
            }
        };
    }
}
