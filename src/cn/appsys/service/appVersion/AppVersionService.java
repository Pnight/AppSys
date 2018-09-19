package cn.appsys.service.appVersion;

import java.util.List;

import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.AppVersion;

public interface AppVersionService {

	

	/**
	 * 查询版本信息
	 * @param appinfoid
	 * @return
	 */
	List<AppVersion> checkVersionList(Integer appinfoid);

}
