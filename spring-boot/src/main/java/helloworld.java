

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class helloworld {
		@RequestMapping("/holle")
		@ResponseBody
		public String helloeorld() {
			return "hello world";
		}
}
