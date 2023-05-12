package catgirl.springboot.semiprojectv6boot.dao;

import catgirl.springboot.semiprojectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
