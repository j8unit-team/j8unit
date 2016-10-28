package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationService;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationServiceClassTest
implements org.j8unit.repository.javax.management.relation.RelationServiceClassTests<RelationService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationService]

    @Override
    public Class<RelationService> createNewSUT() {
        return RelationService.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RelationService#RelationService(boolean) public
     * javax.management.relation.RelationService(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_RelationService_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationService sut = null; // = new RelationService(boolean);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationService]

}
