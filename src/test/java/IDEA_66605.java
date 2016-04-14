import net.intellij.idea.mapper.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by IntelliJ IDEA.
 * User: omoser
 * Date: 15.03.11
 * Time: 14:33
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/**test-application-context.xml"})
public class IDEA_66605 {

    @Value("#{ ${mapper.beanname} }")
    Mapper mapper;


    @Test
    public void testMapper() {
        assertNotNull(mapper);

            //assertEquals("mappedB", mapper.map(new Object())); // if mapper.beanname=mapperB
            assertEquals("mappedA", mapper.map(new Object()));
    }

}
