package com.wtlib.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wtlib.base.dto.UserWebDto;
import com.wtlib.base.pojo.User;

/**
 * @author zongzi
 * @date 2017年1月21日 下午6:14:59
 */
public interface UserMapper extends BaseDao<User> {

	void save(User user);

	UserWebDto selectByLoginId(@Param("loginId") String loginId);
	
	Integer confirm(User user);
}