package kr.spring.ticket.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.spring.ticket.vo.TicketGameVO;

@Mapper
public interface TicketMapper {
	/* 경기정보 */
	// 등록
	public void insertGame(TicketGameVO ticketGameVO);
	// 수정
}
