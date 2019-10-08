package com.cn.castutils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2DateConverter implements Converter<String, Date>{
    @Override
    public Date convert(String s) {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse =null;
        try {
            parse = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
}
