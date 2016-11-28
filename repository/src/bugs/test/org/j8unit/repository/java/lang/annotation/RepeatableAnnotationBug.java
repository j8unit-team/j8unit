package org.j8unit.repository.java.lang.annotation;

import static org.j8unit.repository.java.lang.annotation.Author.INITIALS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.annotation.AnnotationFormatError;
import org.junit.Test;

@Author("stefan gasterstädt")
@Author("sascha zak")
public class RepeatableAnnotationBug {

    @Test(expected = AnnotationFormatError.class /* because there is a bug! */)
    public void repeatableAnnotationIsAnInvalidContainer() {
        try {
            // assert presence of the containing annotation type
            assertTrue(RepeatableAnnotationBug.class.isAnnotationPresent(Authors.class));
            // query both authors
            final Author[] authors = RepeatableAnnotationBug.class.getAnnotationsByType(Author.class);
            assertEquals(2, authors.length);
            // assert values of 1st author
            final String sgName = "stefan gasterstädt";
            assertEquals(sgName, authors[0].value());
            final String sgAcronym = INITIALS.apply(authors[0]);
            assertEquals("SG", sgAcronym);
            // assert values of 2nd author
            final String szName = "sascha zak";
            assertEquals(szName, authors[1].value());
            final String szAcronym = INITIALS.apply(authors[1]);
            assertEquals("SZ", szAcronym);
        } catch (final AnnotationFormatError bug) {
            // OMG! The exception type and its cause message are really misleading!
            assertEquals("@org.j8unit.repository.java.lang.annotation.Authors(value=[null, null]) is an invalid container for repeating annotations of type: interface org.j8unit.repository.java.lang.annotation.Author",
                         bug.getMessage());
            throw bug;
        }
    }

}
