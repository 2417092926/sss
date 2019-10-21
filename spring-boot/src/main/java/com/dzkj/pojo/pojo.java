package com.dzkj.pojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class pojo {
	
	
			@RequestMapping("/frist")
			@ResponseBody
			public String helloeorld() {
				return "你好";
			}


}
