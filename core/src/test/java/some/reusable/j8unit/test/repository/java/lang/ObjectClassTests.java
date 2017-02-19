package some.reusable.j8unit.test.repository.java.lang;

import static org.junit.Assert.fail;
import java.lang.reflect.Method;
import org.j8unit.J8UnitTest;
import org.junit.Test;

public abstract interface ObjectClassTests<SUT extends Object>
extends J8UnitTest<Class<SUT>> {

    @Test
    public default void wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode() {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
        try {
            final Method equals = sut.getDeclaredMethod("equals", Object.class);
            assert equals != null;
            try {
                final Method hashCode = sut.getDeclaredMethod("hashCode");
                assert hashCode != null;
            } catch (final NoSuchMethodException | SecurityException notPresent) {
                fail("Overridden [Object#equals(Object)] without corresponding overridden [Object#hashCode()]!");
            }
        } catch (final NoSuchMethodException | SecurityException noDeclaredEquals) {}
    }

}
