package org.j8unit.repository.java.util;

import static org.junit.Assume.assumeTrue;
import java.util.Iterator;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @since 0.9.5
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public interface UnmodifiableIteratorTests<SUT extends Iterator<E>, E>
extends IteratorTests<SUT, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void removeMustThrowUOE()
    throws Exception {
        final SUT sut = createNewSUT();
        assert sut != null;
        assumeTrue("The given Iterable is empty; Thus, this test becomes useless.", sut.hasNext());
        sut.next();
        sut.remove();
    }

}
