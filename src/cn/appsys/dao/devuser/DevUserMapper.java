package cn.appsys.dao.devuser;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.DevUser;

public interface DevUserMapper {

	/**
	 * 开发者登录查询
	 * @param devCode
	 * @return
	 */
	DevUser getDevUserByDevCode(@Param("devCode")String devCode);

}
