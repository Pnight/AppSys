package cn.appsys.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class Backebdcontroller {
	//@Resource
	//private 
	
	@RequestMapping("/check/{appinfoid}/{versionid}")
	public String toAppcheck(@PathVariable Integer appinfoid,@PathVariable Integer versionid) {
		
		return "backend/appcheck";
	}
	
	/**
	 * 去APP审核页面applist
	 * @return
	 */
	@RequestMapping("/backend/list")
	public String toApplist() {
		
		return "backend/applist";
	}
}
