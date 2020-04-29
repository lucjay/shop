package co.lucjay.shop.board.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.lucjay.shop.board.service.BoardService;
import co.lucjay.shop.board.service.BoardVo;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;

	@RequestMapping("/boardList.do") // 전체리스트
	public String boardList(Model model) {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		list = boardService.select();
		model.addAttribute("board", list);
		return "board/boardList";
	}

	@RequestMapping("/boardgetList.do") // 글 하나 보기
	public String boardgetList(@RequestParam("bid") String id, Model model) {
		BoardVo vo = new BoardVo();
		int boardid = Integer.parseInt(id);
		vo = boardService.getSelect(boardid);
		model.addAttribute("vo", vo);
		return "board/boardgetList"; // 한개의 게시글을 읽는다
	}

	@RequestMapping("/boardInputForm.do")
	public String boardInputForm() {
		return "board/boardInputForm";
	}

	@RequestMapping("/boardInsert.do")
	public String boardWrite(BoardVo vo, Model model) {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		int n = boardService.insert(vo);
		String view;
		if (n != 0) {
			list = boardService.select();
			model.addAttribute("board", list);
			view = "board/boardList";
		} else
			view = "board/insertFail";
		return view;

	}

}
