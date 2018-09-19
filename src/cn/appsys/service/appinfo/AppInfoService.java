package cn.appsys.service.appinfo;

import java.util.List;

import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.QueryAppInfoVo;
import cn.appsys.util.PageBean;

public interface AppInfoService {

	/**
	 * 查询app列表
	 * @param pageBean
	 * @param queryAppInfoVo
	 */
	public void getAppInfoList(PageBean<AppInfo> pageBean, QueryAppInfoVo queryAppInfoVo);

	/**
	 * 查询APP信息
	 * @param appinfoid
	 * @return
	 */
	public AppInfo checkInfoVerList(Integer appinfoid);

	/**
	 * 删除APP信息
	 * @param appinfoid
	 * @return
	 */
	public boolean delAppInfo(Integer appinfoid);

}
