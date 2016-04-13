package cn.com.cookie.common.controllers;

import cn.com.cookie.common.bean.DataRegiste;
import cn.com.cookie.common.bean.InfoReturn;
import cn.com.cookie.common.reference.ResponseCode;
import cn.com.cookie.common.service.AppUserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("sys")
public class UserController {

    @Autowired
    AppUserEntityService appUserEntityService;

    /**
     * 注册用户,将用户信息写入app_user表中，默认角色为游客
     * @return
     */
    @RequestMapping(value = "user/add.json")
    @ResponseBody
    public InfoReturn getUserList(@RequestBody @Valid DataRegiste dataRegiste, BindingResult result) {
        //返回的信息
        InfoReturn info = new InfoReturn();
        if(result.hasErrors()){
            //校验字段
            StringBuilder builder =new StringBuilder("错误信息：");
            for (FieldError errors : result.getFieldErrors()){
                builder.append(errors.getDefaultMessage()+"\n");
            }
            info.setError(builder.toString(), ResponseCode.校验错误.getKey());
        }else {
            if(!appUserEntityService.registeUser(dataRegiste)){
                //注册用户，若不成功，则设置错误信息，否则反会默认的正确标志
                info.setError(ResponseCode.执行错误.getValue(), ResponseCode.执行错误.getKey());
            }
        }
        return info;
    }

}
