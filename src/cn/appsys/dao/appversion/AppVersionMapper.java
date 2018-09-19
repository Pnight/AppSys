package cn.appsys.dao.appversion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.AppVersion;

public interface AppVersionMapper {

	/**
	 * APP版本信息查询
	 * @param appinfoid
	 * @return
	 */
	List<AppVersion> checkVersionList(@Param("appinfoid")Integer appinfoid);

	/**
	 * 删除版本信息
	 * @param appinfoid
	 * @return
	 */
	int delVersion(@Param("appinfoid")Integer appinfoid);


}
