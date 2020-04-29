package co.lucjay.shop.board.service;

//@Component("boardVo") 독립적으로 쓰는것
//@Service("boardVo") 이것을 추천함 
public class BoardVo {

	private int boardId;
	private String writer;
	private String wDate;
	private String title;
	private String contents;
	private int hit;
	private String fileName;

	public BoardVo() {
		// TODO Auto-generated constructor stub
	}

	public int getBoardId() {
		return boardId;
	}

	public String getWriter() {
		return writer;
	}

	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}

	public int getHit() {
		return hit;
	}

	public String getFileName() {
		return fileName;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getwDate() {
		return wDate;
	}

	public void setwDate(String wDate) {
		this.wDate = wDate;
	}

}
