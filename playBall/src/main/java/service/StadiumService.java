package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import vo.Page;
import vo.StadiumVo;
import vo.reservationPageVo;
import vo.reservationVo;

public interface StadiumService {
	public List<StadiumVo> search(Page page);
	public int create(StadiumVo vo);
	public void update(StadiumVo vo);
	public StadiumVo detail(String serial);
	public StadiumVo modify(String serial);
	public int findRecord(String serial);
	public int delete(String serial);
	public String findUserPoint(String mid);
	public List<String> viewRvationDay(reservationVo vo);
	public reservationVo viewReservationTime(reservationVo vo);
	public int reservation(reservationVo vo);
	public List<reservationVo> moveMyReservation(reservationPageVo page);
	public int cancelReservation(reservationVo vo);
}
