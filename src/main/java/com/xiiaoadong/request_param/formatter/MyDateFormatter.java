package com.xiiaoadong.request_param.formatter;

import com.xiiaoadong.request_param.util.DateUtil;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class MyDateFormatter implements Formatter<Date>{
    @Override
    public Date parse(String text, Locale locale) throws ParseException {

        return DateUtil.S_DAY_DATEFORMAT.parse(text);
    }

    @Override
    public String print(Date object, Locale locale) {

        return DateUtil.S_DAY_DATEFORMAT.format(object);
    }
}
