package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import java.util.Iterator;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.util.UnmodifiableIteratorTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @see UnmodifiableIteratorTests
 *
 * @since 0.9.5
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmodifiableIterableTests<SUT extends Iterable<E>, E>
extends IterableTests<SUT, E> {

    /**
     * @see UnmodifiableIteratorTests#removeMustThrowUOE()
     */
    @Test(expected = UnsupportedOperationException.class)
    public default void iteratorMustBeUnmodifiable()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Iterator<E> iterator = sut.iterator();
        assertNotNull(iterator);
        final UnmodifiableIteratorTests<Iterator<E>, E> x = () -> iterator;
        x.removeMustThrowUOE();
    }

}
