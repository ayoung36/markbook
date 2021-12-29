package com.markbook.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.markbook.domain.book_orderVO;
import com.markbook.domain.mk_2ndhand_bookVO;
import com.markbook.domain.mk_memberVO;
import com.markbook.model.sjCriteria;
import com.markbook.persistence.mk_2ndtransDAO;

@Service
public class mk_2ndtransServiceImpl implements mk_2ndtransService {

	@Inject
	private mk_2ndtransDAO tdao;

	// 중고 책 리스트 조회
	@Override
	public List<mk_2ndhand_bookVO> getBookList() throws Exception {

		System.out.println(" S : getBookList() 호출");

		List<mk_2ndhand_bookVO> bookList = tdao.getBookList();

		return bookList;
	}

	// 중고 책 리스트 페이징
	@Override
	public List<mk_2ndhand_bookVO> getlistCri(sjCriteria cri) throws Exception {

		System.out.println("getListCri(sjCriteria cri) 호출! ");

		return tdao.getlistCri(cri);
	}

	// 중고책 리스트 총 갯수
	@Override
	public int count(sjCriteria cri) throws Exception {

		return tdao.count(cri);
	}

	// 중고책 매물 등록
	@Override
	public void bookRegister(mk_2ndhand_bookVO bvo) throws Exception {

		System.out.println("S : bookRegister(bvo) 호출! ");

		tdao.bookRegister(bvo);

		System.out.println("S : bookRegister(bvo) 등록완료 ");
	}

	// 중고책 상세 페이지 조회
	@Override
	public mk_2ndhand_bookVO getInfo(Integer b2_num) throws Exception {

		System.out.println("S : getinfo() 호출! ");

		mk_2ndhand_bookVO bvo = tdao.getInfo(b2_num);

		System.out.println("S : getinfo() 호출완료 ");

		return bvo;
	}

	// 중고책 상세 페이지 수정
	@Override
	public void bookModify(mk_2ndhand_bookVO bvo) throws Exception {

		System.out.println("S : bookModify() 호출! ");

		tdao.bookModify(bvo);

		System.out.println("S : bookModify() 수정완료 ");

	}

	// 중고책 상세 페이지 삭제
	@Override
	public void bookDelete(Integer b2_num) throws Exception {

		System.out.println("S : bookDelete() 호출! ");

		tdao.bookDelete(b2_num);

		System.out.println("S : bookDelete() 삭제완료 ");

	}

	// 중고책 입찰하기
	@Override
	public void bookBid(mk_2ndhand_bookVO bvo) throws Exception {

		System.out.println("S : bookBid() 호출! ");

		tdao.bookBid(bvo);

		System.out.println("S : 입찰 가격 수정 완료 ");

	}

	// 카트 조회
	@Override
	public List<mk_2ndhand_bookVO> getCart(String b2_buyer_id) throws Exception {

		System.out.println("S : getCart() 호출! ");

		List<mk_2ndhand_bookVO> cartList = tdao.getCart(b2_buyer_id);

		System.out.println("S : getCart() 호출완료 ");

		return cartList;
	}

	// 결제창 멤버 정보 조회
	@Override
	public mk_memberVO getMember(String m_id) throws Exception {

		System.out.println("S : getMember() 호출! ");

		mk_memberVO mvo = tdao.getMember(m_id);

		System.out.println("S : getMember() 호출완료 ");

		return mvo;
	}

	// 판매정보 업데이트
	@Override
	public void soldupdate(Integer b2_num) throws Exception {

		System.out.println("S : soldupdate() 호출! ");

		tdao.soldupdate(b2_num);

		System.out.println("S : 판매정보 수정 완료 ");

	}

	// 주문입력
	@Override
	public void bookchechout(book_orderVO bvo) throws Exception {

		System.out.println("S : bookchechout(bvo) 호출! ");

		tdao.bookchechout(bvo);

		System.out.println("S : bookchechout(bvo) 등록완료 ");
	}

	// 서치 리스트
	@Override
	public List<mk_2ndhand_bookVO> searchListAll(String searchOption, String keyword, sjCriteria cri) throws Exception {

		System.out.println("S : searchListAll() 호출! ");
		System.out.println("S : cri"+cri);

		return tdao.searchListAll(searchOption, keyword, cri);

	}

	// 서치 카운트
	@Override
	public int countSearch(String searchOption, String keyword) throws Exception {

		System.out.println("S : countSearch() 호출! ");

		return tdao.countSearch(searchOption, keyword);

	}

}
