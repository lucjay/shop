package co.lucjay.shop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.lucjay.shop.product.cal.Calculator;

@Controller
public class ProductController {

	@Autowired
	Calculator Calculator;

	@RequestMapping("/sum.do")
	public String product(Model model) { // 뷰 이름만 지정ㅎㅐ서 돌려 줄때
		int result = Calculator.sum(10, 100);
		model.addAttribute("sum", result);

		return "sumResult";
	}

//	@RequestMapping("")
//	public ModelAndView prdt(Model model) { // 뷰이름고ㅏ 모델을 함께 돌려준다
//		ModelAndView mav = new ModelAndView(); //뷰를 선택해서 돌려주려고 할때
//		mav.addObject("", "");
//		mav.setViewName("뷰네임 너어");
//		return mav;
//	}

}
