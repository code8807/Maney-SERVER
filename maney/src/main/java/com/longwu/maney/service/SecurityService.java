package com.longwu.maney.service;

import com.longwu.maney.dao.UserInfoMapper;
import com.longwu.maney.model.UserInfo;
import com.longwu.maney.model.UserInfoExample;
import com.longwu.maney.vo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("securityService")
public class SecurityService implements UserDetailsService {
   @Autowired
   UserInfoMapper userInfoMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserInfoExample uie = new UserInfoExample();
        uie.createCriteria().andUserMobileEqualTo(s);
        List<UserInfo> userInfos = this.userInfoMapper.selectByExample(uie);
        if (userInfos.isEmpty()){
            throw new UsernameNotFoundException("用户名不存在。。。");
        }else{
            return new UserLogin(userInfos.get(0).getUserId(),userInfos.get(0).getUserMobile(), "{SHA-256}"+userInfos.get(0).getUserPwd(), userInfos.get(0).getUserStat().equals("1")?true:false);
        }
    }
}
