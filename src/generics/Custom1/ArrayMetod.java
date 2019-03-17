package generics.Custom1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayMetod<gg> implements Iterator<gg> {
    private final gg[] mas;
    private int a = 0;

    ArrayMetod(gg[] mas) {
        this.mas = mas;
    }

    @Override
    public boolean hasNext() {
        return a < mas.length;
    }


    public gg next() {
        return mas[a++];
    }

    /**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation).  This method can be called
     * only once per call to {@link #next}.
     * <p>
     * The behavior of an iterator is unspecified if the underlying collection
     * is modified while the iteration is in progress in any way other than by
     * calling this method, unless an overriding class has specified a
     * concurrent modification policy.
     * <p>
     * The behavior of an iterator is unspecified if this method is called
     * after a call to the {@link #forEachRemaining forEachRemaining} method.
     *
     * @throws UnsupportedOperationException if the {@code remove}
     *                                       operation is not supported by this iterator
     * @throws IllegalStateException         if the {@code next} method has not
     *                                       yet been called, or the {@code remove} method has already
     *                                       been called after the last call to the {@code next}
     *                                       method
     * @implSpec The default implementation throws an instance of
     * {@link UnsupportedOperationException} and performs no other action.
     */
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

}
