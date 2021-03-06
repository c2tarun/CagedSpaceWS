package com.uncc.cagedspace;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by tarun on 11/8/15.
 */
public class CagedSpaceUtil {

    public static CagedSpace getJSONData() {
        ObjectMapper mapper = new ObjectMapper();
        CagedSpace cs = null;
        try {

            cs = mapper.readValue(new File(CagedSpaceUtil.class.getClassLoader().getResource("cagedspace.json").getFile()), CagedSpace.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cs;
    }


}
