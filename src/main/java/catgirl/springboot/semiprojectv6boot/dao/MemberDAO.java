package catgirl.springboot.semiprojectv6boot.dao;

import catgirl.springboot.semiprojectv6boot.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
