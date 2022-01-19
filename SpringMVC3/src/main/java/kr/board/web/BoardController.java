package kr.board.web;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.board.domain.Member;
import kr.board.service.BoardService;

@Controller // POJO
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/")
	public String main() {
		return "basic";
	}
	
	@RequestMapping("/login.do")
	public String login(Member vo, HttpSession session) { // memId, memPass
		Member mvo=service.login(vo);
		if(mvo!=null) {  //성공-> 객체바인딩 (HttpServletRequest -> (jsp 한군데에서만 확인하고 다른jsp에서는 확인 불가능.),
						// HttpSession로 사용해야 다른 jsp에서도 정보를 확인 할 수 있다.)
			session.setAttribute("mvo", mvo); // jsp
		}
		return "redirect:/";
	}
}
