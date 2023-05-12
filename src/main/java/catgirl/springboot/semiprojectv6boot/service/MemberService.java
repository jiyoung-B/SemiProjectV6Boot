package catgirl.springboot.semiprojectv6boot.service;

import catgirl.springboot.semiprojectv5.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {

    boolean checkLogin(Member m, HttpSession sess);


}
