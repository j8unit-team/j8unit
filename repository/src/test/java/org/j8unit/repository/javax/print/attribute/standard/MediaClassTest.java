package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Media;
import org.j8unit.repository.categories.JavaBug;
import org.j8unit.runners.J8Unit4;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Media} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.print.attribute.standard.MediaClassTests}).
 */
@RunWith(J8Unit4.class)
public class MediaClassTest
implements MediaClassTests<Media> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Media]

    @Override
    public Class<Media> createNewSUT() {
        return Media.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.Media]

    /**
     * @see MediaClassBugs#equalsWithoutHashCode() Overridden {@code #equals(Object)} method without corresponding
     *      overridden {@code #hashCode()}!
     *
     * @since 0.9.7
     */
    @Test
    @Category(JavaBug.class)
    @Override
    public void wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode() {
        MediaClassTests.super.wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Media]

}
