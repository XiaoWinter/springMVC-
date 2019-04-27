package com.xiiaoadong.request_param.formatter;

import com.xiiaoadong.request_param.util.DateUtil;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

/**
 *  A converter converts a source object of type {@code String} to a target of type {@code Date}.
 */
public class MyConverter implements Converter<String,Date>{
    @Override
    public Date convert(String s) {
        try {
            return DateUtil.S_DAY_DATEFORMAT.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
