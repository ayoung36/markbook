package com.markbook.persistence;

import com.markbook.domain.mk_bookVO;

public interface mk_adminDAO {

	// 도서 등록
	public void bookRegister(mk_bookVO bvo) throws Exception;
	
	// 도서 목록
	public void bookList(mk_bookVO lvo) throws Exception;
	
	
	
	
	
	
	
	
}
