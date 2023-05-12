package catgirl.springboot.semiprojectv6boot.dao;

import catgirl.springboot.semiprojectv6boot.model.Member;
import catgirl.springboot.semiprojectv6boot.model.Zipcode;

import java.util.List;

public interface JoinDAO {
    List<Zipcode> selectZipcode(String dong);

    int insertMember(Member m);
    int selectOneUserid(String uid);

    int selectOneMember(Member m);

}
