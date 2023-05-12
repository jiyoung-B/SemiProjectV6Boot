package catgirl.springboot.semiprojectv6boot.service;

import catgirl.springboot.semiprojectv6boot.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {

    boolean checkLogin(Member m, HttpSession sess);


}
