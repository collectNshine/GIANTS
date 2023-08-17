package kr.spring.ticket.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.spring.member.vo.MemberDetailVO;
import kr.spring.ticket.dao.TicketMapper;
import kr.spring.ticket.vo.GameVO;
import kr.spring.ticket.vo.GradeVO;
import kr.spring.ticket.vo.SeatStatusVO;
import kr.spring.ticket.vo.SeatVO;
import kr.spring.ticket.vo.TicketCheckVO;
import kr.spring.ticket.vo.TicketVO;

@Service
@Transactional
public class TicketServiceImpl implements TicketService { 
	@Autowired
	TicketMapper ticketMapper;
	
	/* GRADE */	
	@Override
	public void insertGrade(GradeVO gradeVO) { ticketMapper.insertGrade(gradeVO); }
	
	@Override
	public int selectGradeCount(GradeVO gradeVO) { return ticketMapper.selectGradeCount(gradeVO); }

	@Override
	public List<GradeVO> selectGradeList(GradeVO gradeVO) {return ticketMapper.selectGradeList(gradeVO);}
	
	@Override
	public GradeVO selectGrade(Integer grade_num) { return ticketMapper.selectGrade(grade_num); }
	
	@Override
	public void updateGrade(GradeVO gradeVO) { ticketMapper.updateGrade(gradeVO); }
	
	@Override
	public void deleteGrade(Integer grade_num) {
		ticketMapper.deleteSeat(grade_num);
		ticketMapper.deleteGrade(grade_num);
	}
	
	@Override
	public void updateGradeQuantity(Integer grade_num) { ticketMapper.updateGradeQuantity(grade_num); }
	
	/* SEAT */
	@Override
	public void insertSeat(SeatVO seatVO) { ticketMapper.insertSeat(seatVO); }
	
	@Override
	public int selectSeatCount(SeatVO seatVO) { return ticketMapper.selectSeatCount(seatVO); }

	@Override
	public List<SeatVO> selectSeatList(SeatVO seatVO) { return ticketMapper.selectSeatList(seatVO); }
	
	@Override
	public SeatVO selectSeat(Integer seat_num) { return ticketMapper.selectSeat(seat_num); }
	
	@Override
	public void updateSeat(SeatVO seatVO) { ticketMapper.updateSeat(seatVO); }
	
	@Override
	public Integer selectSeatQuantity(Integer grade_num) { return ticketMapper.selectSeatQuantity(grade_num); }
	
	/* GAME */
	@Override
	public void insertGame(GameVO gameVO) { ticketMapper.insertGame(gameVO); }

	@Override
	public int selectRowCount(GameVO gameVO) { return ticketMapper.selectRowCount(gameVO); }

	@Override
	public List<GameVO> selectTicketGameList(GameVO gameVO) { return ticketMapper.selectTicketGameList(gameVO); }

	@Override
	public GameVO selectGame(Integer game_num) { return ticketMapper.selectGame(game_num); }

	@Override
	public void updateGame(GameVO gameVO) { ticketMapper.updateGame(gameVO); }

	@Override
	public MemberDetailVO selectMemberDetail(Integer mem_num) { return ticketMapper.selectMemberDetail(mem_num); }

	/* Ticket */
	@Override
	public void insertTicketCheck(TicketCheckVO ticketCheckVO) { ticketMapper.insertTicketCheck(ticketCheckVO); }
	
	@Override
	public void insertSeatStatus(SeatStatusVO seatStatusVO) { ticketMapper.insertSeatStatus(seatStatusVO); }
	
	@Override
	public void insertTicket(TicketVO ticket) {
		ticketMapper.insertTicket(ticket);
	}

}
 