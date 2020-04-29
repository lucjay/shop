package co.lucjay.shop.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.lucjay.shop.board.service.BoardService;
import co.lucjay.shop.board.service.BoardVo;
import co.lucjay.shop.common.Dao;

@Repository("boardDao")
public class BoardDao implements BoardService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Autowired
	private BoardVo boardVo;
	// @Resource(name = "BoardVo")
	// BoardVo vo;

	private final String SELECT_ALL = "SELECT * FROM board";
	private final String SELECT = "SELECT * FROM board WHERE boardid=?";
	private final String INSERT = "INSERT INTO board (boardid,title,contents) values (b_num.nextval,?,?)";

	public ArrayList<BoardVo> select() {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		try {
			conn = Dao.getConnection();
			psmt = conn.prepareStatement(SELECT_ALL);
			rs = psmt.executeQuery();
			while (rs.next()) {
				boardVo = new BoardVo();
				boardVo.setBoardId(rs.getInt("boardid"));
				boardVo.setWriter(rs.getString("writer"));
				boardVo.setTitle(rs.getString("title"));
				boardVo.setHit(rs.getInt("hit"));
				boardVo.setFileName(rs.getString("filename"));
				list.add(boardVo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BoardVo getSelect(int boardid) {
		BoardVo vo = new BoardVo();
		DateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
		try {
			conn = Dao.getConnection();
			psmt = conn.prepareStatement(SELECT);
			psmt.setInt(1, boardid);
			rs = psmt.executeQuery();
			if (rs.next()) {
				vo.setBoardId(rs.getInt("boardid"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setwDate(dateF.format(rs.getDate("wdate")));
				vo.setContents(rs.getString("contents"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int insert(BoardVo boardVo) {
		int n = 0;
		try {
			conn = Dao.getConnection();
			psmt = conn.prepareStatement(INSERT);
			psmt.setInt(1, boardVo.getBoardId());
			psmt.setString(2, boardVo.getTitle());
			psmt.setString(3, boardVo.getContents());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int update(BoardVo boardVo) {
		return 0;
	}

	@Override
	public int delete(int boardid) {
		return 0;
	}

}
