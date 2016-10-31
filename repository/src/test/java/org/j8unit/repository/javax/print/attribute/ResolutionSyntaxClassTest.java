package org.j8unit.repository.javax.print.attribute;

import static org.junit.Assert.fail;
import javax.print.attribute.ResolutionSyntax;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResolutionSyntaxClassTest
implements org.j8unit.repository.javax.print.attribute.ResolutionSyntaxClassTests<ResolutionSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.ResolutionSyntax]

    @Override
    public Class<ResolutionSyntax> createNewSUT() {
        return ResolutionSyntax.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.attribute.ResolutionSyntax#ResolutionSyntax(int, int, int) public
     * javax.print.attribute.ResolutionSyntax(int,int,int)}.
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
    public void create_ResolutionSyntax_int_int_int()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.ResolutionSyntax]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.ResolutionSyntax]

}
