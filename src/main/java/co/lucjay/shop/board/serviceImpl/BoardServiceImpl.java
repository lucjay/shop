package co.lucjay.shop.board.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.lucjay.shop.board.dao.BoardDao;
import co.lucjay.shop.board.service.BoardService;
import co.lucjay.shop.board.service.BoardVo;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao BoardDao;

	@Override
	public ArrayList<BoardVo> select() {
		return BoardDao.select();
	}

	@Override
	public BoardVo getSelect(int boardid) {
		return BoardDao.getSelect(boardid);
	}

	@Override
	public int insert(BoardVo boardVo) {
		return BoardDao.insert(boardVo);
	}

	@Override
	public int update(BoardVo boardVo) {
		return BoardDao.update(boardVo);
	}

	@Override
	public int delete(int boardid) {
		return BoardDao.delete(boardid);
	}

}
