package quiz.Collection;

import java.util.ArrayList;
import java.util.List;

class Board {      // Model
   private String title;
   private String content;
   
   public Board(String title, String content) {
      this.title = title;
      this.content = content;
   }

   public String getTitle() {
      return title;
   }

   public String getContent() {
      return content;
   }   
}

class BoardDao {      // Controller
   private Board board;
   private List<Board> boardList;
   
   public BoardDao() { 
      boardList = new ArrayList<Board>();
   }

   public List<Board> getBoardList() {
      
      for(int i = 1; i <= 3; i++) {
         board = new Board("제목" + i, "내용" + i);
         boardList.add(board);
      }
      
      return boardList;
   }
}

public class Quiz28 {      // View
   public static void main(String[] args) {
      BoardDao dao = new BoardDao();
      
      List<Board> list = dao.getBoardList();
      
      for(int i = 0; i < list.size(); i++) {
         Board board = list.get(i);
         System.out.println(board.getTitle() + "\t" + board.getContent());
      }
   }
}