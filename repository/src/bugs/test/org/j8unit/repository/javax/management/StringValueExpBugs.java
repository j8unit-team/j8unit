package org.j8unit.repository.javax.management;

import javax.management.StringValueExp;
import org.j8unit.repository.JavaBug;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @since 0.9.4
 */
@Category(JavaBug.class)
public class StringValueExpBugs {

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException() {
        final StringValueExpTests<StringValueExp> sve = StringValueExp::new;
        sve.toStringMustReturnNotNull();
    }

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException2() {
        final StringValueExpTests<StringValueExp> sve = () -> new StringValueExp(null);
        sve.toStringMustReturnNotNull();
    }

}
