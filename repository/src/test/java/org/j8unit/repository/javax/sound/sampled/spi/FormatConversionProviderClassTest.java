package org.j8unit.repository.javax.sound.sampled.spi;

import static org.junit.Assert.fail;
import javax.sound.sampled.spi.FormatConversionProvider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FormatConversionProvider} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.sound.sampled.spi.FormatConversionProviderClassTests}).
 */
@RunWith(J8Unit4.class)
public class FormatConversionProviderClassTest
implements FormatConversionProviderClassTests<FormatConversionProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.spi.FormatConversionProvider]

    @Override
    public Class<FormatConversionProvider> createNewSUT() {
        return FormatConversionProvider.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.sampled.spi.FormatConversionProvider#FormatConversionProvider() public
     * javax.sound.sampled.spi.FormatConversionProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_FormatConversionProvider()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.spi.FormatConversionProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.spi.FormatConversionProvider]

}
