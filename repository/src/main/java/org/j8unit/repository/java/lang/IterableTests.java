package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IterableTests<SUT extends java.lang.Iterable<T>, T>
extends J8UnitTest<SUT> {

    @Test
    public default void forEachMustConsumeNOOP() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.forEach(e -> {});
    }

    @Test
    public default void iteratorMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.iterator());
    }

}
