package kr.board.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.board.domain.Member;

@Controller // POJO
public class BoardController {

	@RequestMapping("/")
	public String main() {
		return "basic";
	}
	
	@RequestMapping("/login.do")
	public String login(Member vo) { // memId, memPass
		// 로그인 처리
		
		return "redirect:/";
	}
}
