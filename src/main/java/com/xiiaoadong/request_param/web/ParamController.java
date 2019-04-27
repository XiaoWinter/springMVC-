package com.xiiaoadong.request_param.web;

import com.xiiaoadong.request_param.pojo.Admin;
import com.xiiaoadong.request_param.pojo.FromAdminList;
import com.xiiaoadong.request_param.pojo.User;
import com.xiiaoadong.request_param.util.DateUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class ParamController {
    /**
     * baseurl/test?age=10
     * @param age
     */
    @GetMapping("test")
    public void testBaseType(Integer age){

    }
    /**
     * baseurl/testObj?username=ewq&password=ewd&age=2
     * @param user
     */
    @PostMapping("testObj")
    public void testObj(User user){

    }

    /**
     * baseurl/testManyObj?user.username=dsd&user.password=wew&admin.username=dsd&admin.password=dsd
     * @param user
     * @param admin
     */
    @PostMapping("testManyObj")
    public void testManyObj(User user, Admin admin){
        System.out.println(user+"\n"+admin);

    }

    /**
     * 解析user.xxx到user单数
     * @param dataBinder
     */
    @InitBinder("user")
    public void initUser(WebDataBinder dataBinder){
        dataBinder.setFieldDefaultPrefix("user.");
    }

    /**
     * 解析admin.xxx到admin参数
     * @param dataBinder
     */
    @InitBinder("admin")
    public void initAdmin(WebDataBinder dataBinder){

        dataBinder.setFieldDefaultPrefix("admin.");
    }

    /**
     *
     * post传输的json
     [
     {
     "username": "John",
     "password": "Doe",
     "age":"11"
     },
     {
     "username": "Anna",
     "password": "Smith",
     "age":"11"
     },
     {
     "username": "Peter",
     "password": "Jones",
     "age":"11"
     }
     ]
     * @param admins
     */

    @PostMapping("admins")
    public void listTypeObj(FromAdminList admins){
        System.out.println(admins);
    }

    /**
     * * post传输的json
     [
     {
     "username": "John",
     "password": "Doe",
     "age":"11"
     },
     {
     "username": "Anna",
     "password": "Smith",
     "age":"11"
     },
     {
     "username": "Peter",
     "password": "Jones",
     "age":"11"
     }
     ]
     * @param admins
     */
    @PostMapping("adminlist")
    public void listTypeObj(@RequestBody List<Admin> admins){
        System.out.println(admins);
    }

    /**
     *
     * * post传输的json
     [
     "adb",
     "xixi",
     "多久啊送到家"
     ]
     * @param info
     */
    @PostMapping("strs")
    public void listTypeStr(@RequestBody List<String> info){
        System.out.println(info);
    }

    /**
     * * post传输的json
     [
     1,
     2,
     3
     ]

     * @param info
     */
    @PostMapping("Ints")
    public void listTypeBase(@RequestBody List<Integer> info){

    }

    /**
     * * post传输的json
     {
     "one":{
     "username": "John",
     "password": "Doe",
     "age":"11"
     },
     "two":{
     "username": "Anna",
     "password": "Smith",
     "age":"11"
     },
     "three":{
     "username": "Peter",
     "password": "Jones",
     "age":"11"
     }
     }
     * @param info
     */
    @PostMapping("mapObj")
    public void mapTypeObj(@RequestBody Map<String,Object> info){
        System.out.println(info);
    }

    /**
     * * post传输的json
     {
     "one":{
     "username": "John",
     "password": "Doe",
     "age":"11"
     },
     "two":{
     "username": "Anna",
     "password": "Smith",
     "age":"11"
     },
     "three":{
     "username": "Peter",
     "password": "Jones",
     "age":"11"
     }
     }
     * @param info
     */
    @PostMapping("mapAdm")
    public void mapTypeAdm(@RequestBody Map<String,Admin> info){
        System.out.println(info);
    }

    /**
     *
     {
     "username": "Peter",
     "password": "Jones",
     "age":"11"
     }
     * @param user
     * @return
     */
    @PostMapping("xmlListObj")
    public User xmlUser(@RequestBody User user){
        System.out.println(user);
        return user;
    }

    /**
     *date:2018-05-24
     * @param date
     */
    @PostMapping("date")
    public void dateType(Date date){
        System.out.println(date);
    }
    /**
     *date2:2018-05-24
     * @param date2
     *
     */
    @PostMapping("date2")
    public void dateType2(Date date2){
        System.out.println(date2);
    }

//    /**
//     * InitBinder注解的value为指定requestParam的name
//     * 此注解的作用范围在自身所在controller内
//     * @param binder
//     */
//    @InitBinder({"date"})
//    public void initDate(WebDataBinder binder){
//        //指定处理类型，自定义数据处理器，处理器允许requestParam值为空
//        binder.registerCustomEditor(Date.class,new CustomDateEditor(DateUtil.S_DAY_DATEFORMAT,true));
//    }
}
