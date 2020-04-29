package co.lucjay.shop.member;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.lucjay.shop.HomeController;
import co.lucjay.shop.member.VO.MemberVO;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	MemberVO memberVO; // bean으로 등록시키고 사용할때

	@RequestMapping("/login.do")
	public String login(Model model) {
		logger.info("loginForm이 실행됨");
		return "member/loginForm";

	}

//	@RequestMapping("loginCheck.do") // parameter
//	public ModelAndView logincheck(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
//
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("id", id);
//		mav.addObject("pw", pw);
//		if (id.equals("park")) {
//			mav.setViewName("member/loginOk");
//		} else {
//			mav.setViewName("member/loginFail");
//		}
//		logger.info("loginCheck가 실행됨");
//		return mav;
//	}

//	@RequestMapping("loginCheck.do") //request
//	public ModelAndView logincheck(HttpServletRequest request, Model model) {
//	ModelAndView mav = new ModelAndView();
//	mav.addObject("id", request.getParameter("id"));
//	mav.addObject("pw", request.getParameter("pw"));
//	if (request.getParameter("id").equals("park")) {
//		mav.setViewName("member/loginOk");
//	} else {
//		mav.setViewName("member/loginFail");
//	}
//	return mav;

	@RequestMapping("loginCheck.do")
	public ModelAndView logincheck(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
//		MemberVO memberVO = new MemberVO(); 자바이용방법

		memberVO.setId(request.getParameter("id"));
		memberVO.setPw(request.getParameter("pw"));
		mav.addObject("member", memberVO);

		if (request.getParameter("id").equals("park")) {
			mav.setViewName("member/loginOk");
		} else {
			mav.setViewName("member/loginFail");
		}

		return mav;
	}
}
