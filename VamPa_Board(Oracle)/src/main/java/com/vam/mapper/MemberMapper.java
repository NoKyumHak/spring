package com.vam.mapper;

import com.vam.model.MemberVO;

public interface MemberMapper {
	// ȸ������
	public void memberJoin(MemberVO member);
	//id �ߺ� üũ
	public int idCheck(String memberId);
	 /* �α��� */
    public MemberVO memberLogin(MemberVO member);
}
