package com.example.linearfitting.service;

import com.example.linearfitting.entity.user.DataVO;
import com.example.linearfitting.entity.user.UserDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author
 */
public interface UserService {
    /**
     * 注册
     *
     * @param user
     * @return
     */
    Boolean register(UserDTO user);

    /**
     * 登录
     *
     * @param user
     * @param request
     * @return
     */
    Boolean login(UserDTO user, HttpServletResponse response, HttpServletRequest request);

    Object data(Integer id);

    Object save(DataVO data);

    Boolean isExist(String name);
}
