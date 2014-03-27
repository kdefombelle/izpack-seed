package fr.kdefombelle.sample;

import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kdefombelle
 */
public class SampleApplicationBean {

    private Logger logger = LoggerFactory.getLogger(SampleApplicationBean.class);

    public SampleApplicationBean(String text) {
        Validate.notNull(text);
        logger.info("application launched");
        logger.info("here is the text: '{}'", text);
    }
}
