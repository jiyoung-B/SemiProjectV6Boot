package catgirl.springboot.semiprojectv6boot.dao;

import catgirl.springboot.semiprojectv6boot.model.Board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {

    List<Board> selectBoard(int stbno);
    List<Board> selectBoard(Map<String, Object> params);
   // List<Board> selectBoard(int stbno, String ftype, String fkey);

    int countBoard();
    int countBoard(Map<String, Object> params);

    //int countBoard(int stbno, String ftype, String fkey);
    int insertBoard(Board bd);

    Board selecOneBoard(String bno);

}
