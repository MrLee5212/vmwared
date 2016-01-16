package com.utron.yw.service.impl;

import com.utron.yw.common.ReturnResult;
import com.utron.yw.common.shiro.ShiroUsernamePasswordToken;
import com.utron.yw.dao.UserMapper;
import com.utron.yw.model.User;
import com.utron.yw.service.UserService;
import javax.annotation.Resource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl
  implements UserService
{

  @Resource
  private UserMapper userMapper;

  public ReturnResult<User> login(String loginName, String password, boolean rememberMe, Integer userType)
  {
    Subject subject = SecurityUtils.getSubject();
    ReturnResult res = new ReturnResult();
    try {
      User temp = new User();
      temp.setAccount(loginName);
      temp.setUserType(userType);
      User u = this.userMapper.getUserByName(temp);
      if (u == null) {
        res.setCode(Integer.valueOf(0));
        res.setMessage("用户[" + loginName + "]不存在！");
      }
      else if (userType == u.getUserType()) {
        ShiroUsernamePasswordToken token = new ShiroUsernamePasswordToken(
          u.getAccount(), password, u.getPassword(), u.getSalt(), 
          null);
        token.setRememberMe(rememberMe);
        subject.login(token);
        if (subject.isAuthenticated()) {
          res.setCode(Integer.valueOf(1));
          res.setMessage("登录成功！");
          res.setResultObject(u);
        } else {
          res.setCode(Integer.valueOf(0));
          res.setMessage("登录失败，密码错误。");
        }
      } else {
        res.setCode(Integer.valueOf(0));
        res.setMessage("您不具备该权限");
      }
    }
    catch (ExcessiveAttemptsException ex) {
      res.setCode(Integer.valueOf(0));
      res.setMessage("登录失败，未知错误。");
    } catch (AuthenticationException ex) {
      res.setCode(Integer.valueOf(0));
      res.setMessage("登录失败，密码错误。");
    }
    return res;
  }
}