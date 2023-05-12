package catgirl.springboot.semiprojectv6boot.service;

import catgirl.springboot.semiprojectv6boot.model.Member;

public interface JoinService {
    String findZipcode(String dong);

    boolean newMember(Member m);
    int checkUserid(String uid);

    boolean loginMember(Member m);



}
