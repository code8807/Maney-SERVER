package com.longwu.maney.service.user;

import com.longwu.maney.Constant.Constant;
import com.longwu.maney.dao.BaseTableMapper;
import com.longwu.maney.dao.UserInfoMapper;
import com.longwu.maney.model.UserInfo;
import com.longwu.maney.model.UserInfoExample;
import com.longwu.maney.utils.DateUtils;
import com.longwu.maney.utils.ShaUtil;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service("userService")
public class UserService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    BaseTableMapper baseTableMapper;

    /**
     * 新建一个用户
     */
    public void createUser(String usePwd, String userMobile){
        UserInfo userInfo = new UserInfo();
        userInfo.setNickname(userMobile);
        userInfo.setUserPwd(ShaUtil.encode(usePwd));
        userInfo.setManeyBal(new BigDecimal("0.00"));
        userInfo.setUserLevel("1");
        userInfo.setUserStat("1");
        userInfo.setUserMobile(userMobile);
        userInfo.setUserAlipay("");
        userInfo.setUserVarEmail("");
        userInfo.setUserDomain("");
        userInfo.setUserPoint(new BigDecimal("0.00"));
        userInfo.setUserMood("");
        userInfo.setUserHp("");
        DateTime now = new DateTime();
        userInfo.setCreateTime(now.toString(Constant.DATE_yyyyMMddHHmmss));
        userInfo.setUpdateTime(now.toString(Constant.DATE_yyyyMMddHHmmss));
        this.userInfoMapper.insert(userInfo);
    }

    /**
     * 获取下一个uuid
     */
    public String getNextUserInfoId() {
        return this.baseTableMapper.createUUid();
    }

    /**
     * 是否有相同手机号已申请 false-没有相同手机号，可插入记录
     */
    public boolean checkMobileRep(String userMob){
        UserInfoExample uie = new UserInfoExample();
        uie.createCriteria().andUserMobileEqualTo(userMob);
        List<UserInfo> list = this.userInfoMapper.selectByExample(uie);
        if (list.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    // 更新用户
    public int updateUser(UserInfo UserAuth){
        return this.userInfoMapper.updateByPrimaryKey(UserAuth);
    }

    // 删除用户
    public int deleteUser(Long userId){
        return this.userInfoMapper.deleteByPrimaryKey(userId);
    }

    //修改密码
    public void changePassword(Long id, String newPassword){
        UserInfo ui = this.userInfoMapper.selectByPrimaryKey(id);
        ui.setUserPwd(newPassword);
        ui.setUpdateTime(DateUtils.getDateAndTime());
        this.userInfoMapper.updateByPrimaryKey(ui);
    }

    // 根据id查找用户
    public UserInfo findOne(Long id){
        return this.userInfoMapper.selectByPrimaryKey(id);
    }

    // 根据wxoi查找用户
    public UserInfo findOneByWx(String wxoi){
        UserInfoExample uie = new UserInfoExample();
        uie.createCriteria().andUserWxoiEqualTo(wxoi);
        List<UserInfo> list = this.userInfoMapper.selectByExample(uie);
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    // 根据手机号查找用户
    public UserInfo findByUserMob(String userMob){
        UserInfoExample uie = new UserInfoExample();
        uie.createCriteria().andUserMobileEqualTo(userMob);
        List <UserInfo> list = this.userInfoMapper.selectByExample(uie);
        if (list.isEmpty()){
            return null;
        }else{
            return list.get(0);
        }
    }

}
