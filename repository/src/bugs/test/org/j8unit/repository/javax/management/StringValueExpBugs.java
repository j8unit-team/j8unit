package org.j8unit.repository.javax.management;

import javax.management.StringValueExp;
import org.j8unit.repository.categories.JavaBug;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @since 0.9.4
 */
@Category(JavaBug.class)
public class StringValueExpBugs {

    @Test(expected = NullPointerException.class /* because there is a bug! */)
    public void toStringThrowsAnException() {
        final StringValueExp instance = new StringValueExp();
        instance.toString();
    }

    @Test(expected = NullPointerException.class /* because there is a bug! */)
    public void toStringThrowsAnException2() {
        final StringValueExp instance = new StringValueExp(null);
        instance.toString();
    }

}
