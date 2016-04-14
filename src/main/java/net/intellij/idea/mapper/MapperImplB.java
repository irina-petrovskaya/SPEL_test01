package net.intellij.idea.mapper;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: omoser
 * Date: 15.03.11
 * Time: 14:28
 */

@Service("mapperB")
public class MapperImplB implements Mapper {

    @Override
    public Object map(Object source) {
        return "mappedB";
    }
}
