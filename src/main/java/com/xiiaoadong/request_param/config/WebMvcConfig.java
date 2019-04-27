package com.xiiaoadong.request_param.config;

import com.xiiaoadong.request_param.formatter.MyConverter;
import com.xiiaoadong.request_param.formatter.MyDateFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

//    @Bean
//    public Formatter<Date> myDateFormatter(){
//        return new MyDateFormatter();
//    }
//
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addFormatter(myDateFormatter());
//        super.addFormatters(registry);
//    }

    @Bean
    public Converter myConverter(){
        return new MyConverter();
    }

}
