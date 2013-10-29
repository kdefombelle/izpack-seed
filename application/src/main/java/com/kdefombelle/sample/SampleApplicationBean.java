package com.kdefombelle.sample;

import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kdefombelle
 */
public class SampleApplicationBean {

    private Logger logger = LoggerFactory.getLogger(SampleApplicationBean.class);

    public SampleApplicationBean(String name) {
        Validate.notNull(name);
        logger.info("{} application launched", name);
    }
}
