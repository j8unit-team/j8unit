package org.j8unit.repository.java.util;

import static java.util.Comparator.comparing;
import static java.util.function.UnaryOperator.identity;
import java.util.List;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @since 0.9.5
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmodifiableListTests<SUT extends List<E>, E>
extends UnmodifiableCollectionTests<SUT, E>, ListTests<SUT, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void replaceAllMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.replaceAll(identity());
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void sortMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.sort(comparing(Object::toString));
    }

}
