package in.co.rays.project_3.model;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;

import in.co.rays.project_3.dto.CourseDTO;
import in.co.rays.project_3.dto.SubjectDTO;
import in.co.rays.project_3.dto.TimeTableDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.model.CourseModelInt;
import in.co.rays.project_3.model.ModelFactory;
import in.co.rays.project_3.model.SubjectModelInt;
import in.co.rays.project_3.util.HibDataSource;


/**
 * HibImlementation of TimeTableModel
 * @author ajay
 *
 */
public class TimeTableModelHibImp implements TimeTableModelInt{

	
	
	
	public long add(TimeTableDTO dto) throws ApplicationException {
		// TODO Auto-generated method stub
		
		Session session=HibDataSource.getSession();
		CourseModelInt model=ModelFactory.getInstance().getCourseModel();
		CourseDTO dto1=model.findByPk(dto.getCourseId());
		String courseName=dto1.getCourseName();
		dto.setCourseName(courseName);
		
		SubjectModelInt model1=ModelFactory.getInstance().getSubjectModel();
		SubjectDTO dto2=model1.findByPk(dto.getSubId());
		dto.setSubName(dto2.getSubjectName());
		
		long pk = 0;
		Transaction tx=null;
	try{
		tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		pk = dto.getId();
	}catch(HibernateException e){
		e.printStackTrace();
		if (tx != null) {
			tx.rollback();
	}
		throw new ApplicationException("Exception in timetable Add " + e.getMessage());
	}		
		return pk;
	}
	
	
	public void delete(TimeTableDTO dto) throws ApplicationException {
		// TODO Auto-generated method stub
		Session session=HibDataSource.getSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();
			session.delete(dto);
			tx.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			// TODO: handle exception
			if (tx != null) {
				tx.rollback();

			}
			throw new ApplicationException("Exception in Timetable delete " + e.getMessage());
		} finally {
			session.close();
		}
	}
	

	public void update(TimeTableDTO dto) throws ApplicationException {
		// TODO Auto-generated method stub
		Session session=HibDataSource.getSession();
		CourseModelInt model=ModelFactory.getInstance().getCourseModel();
		CourseDTO dto1=model.findByPk(dto.getCourseId());
		String courseName=dto1.getCourseName();
		dto.setCourseName(courseName);
		
		SubjectModelInt model1=ModelFactory.getInstance().getSubjectModel();
		SubjectDTO dto2=model1.findByPk(dto.getSubId());
		dto.setSubName(dto2.getSubjectName());
		
		Transaction tx=null;
		try{
			tx=session.beginTransaction();
			session.update(dto);
			tx.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			// TODO: handle exception
			if (tx != null) {
				tx.rollback();

			}
			throw new ApplicationException("Exception in timetable update " + e.getMessage());
		} finally {
			session.close();
	}
	}

	public List list() throws ApplicationException {
		// TODO Auto-generated method stub
		return list(0, 0);
	}

	public List list(int pageNo, int pageSize) throws ApplicationException {
		// TODO Auto-generated method stub
		Session session=HibDataSource.getSession();
		List list=null;
		try{
		Criteria criteria=session.createCriteria(TimeTableDTO.class);
		
		if(pageSize>0){
			pageNo=((pageNo-1)*pageSize)+1;
			criteria.setFirstResult(pageNo);
			criteria.setMaxResults(pageSize);
		}
		list=criteria.list();
		}catch (HibernateException e) {

			throw new ApplicationException("Exception : Exception in  TimetableDTO list");
		} finally {
			session.close();
		}
		
		return list;
	}

	public List search(TimeTableDTO dto) throws ApplicationException {
		// TODO Auto-generated method stub
		return search(dto, 0, 0);
	}

	public List search(TimeTableDTO dto, int pageNo, int pageSize) throws ApplicationException {
		// TODO Auto-generated method stub
		Session session=HibDataSource.getSession();
		List list=null;
		try{
			Criteria criteria=session.createCriteria(TimeTableDTO.class);
			if(dto!=null){
				if(dto.getId()>0){
					criteria.add(Restrictions.eq("id", dto.getId()));
				}
				if(dto.getSubName()!=null&&dto.getSubName().length()>0){
					criteria.add(Restrictions.like("subName", dto.getSubName()+"%"));
				}
				if (dto.getCourseName() != null && dto.getCourseName().length() > 0) {
					criteria.add(Restrictions.like("courseName", dto.getCourseName() + "%"));
				}
				if (dto.getSemester() != null && dto.getSemester().length() > 0) {
					criteria.add(Restrictions.like("semester", dto.getSemester() + "%"));
				}
				if (dto.getExamDate() != null && dto.getExamDate().getDate() > 0) {
					criteria.add(Restrictions.eq("examDate", dto.getExamDate()));
				}
				if (dto.getSubId() > 0) {
					criteria.add(Restrictions.eq("subId", dto.getSubId()));
				}
				if (dto.getCourseId() > 0) {
					criteria.add(Restrictions.eq("courseId", dto.getCourseId()));
				}
			}
			if (pageSize > 0) {
				criteria.setFirstResult((pageNo - 1) * pageSize);
				criteria.setMaxResults(pageSize);
			 
			}
			list=criteria.list();
		}catch (HibernateException e) {

			throw new ApplicationException("Exception in course search");
		} finally {
			session.close();
		}
		return list;
	}


	public TimeTableDTO findByPk(long pk) throws ApplicationException {
		// TODO Auto-generated method stub
		Session session = null;
		TimeTableDTO dto = null;
		try {
			session = HibDataSource.getSession();

			dto = (TimeTableDTO) session.get(TimeTableDTO.class, pk);
		} catch (HibernateException e) {

			throw new ApplicationException("Exception : Exception in getting TimetableDTO by pk");
		} finally {
			session.close();
		}
		return dto;
	}

	public TimeTableDTO checkByCourseName(long courseId, Date examDate) throws ApplicationException {
		// TODO Auto-generated method stub
		long l = examDate.getTime();
		java.sql.Date date = new java.sql.Date(l);
		Session session = null;
		TimeTableDTO dto = null;
		try {
			session = HibDataSource.getSession();
			Criteria criteria = session.createCriteria(TimeTableDTO.class);
			criteria.add(Restrictions.and(Restrictions.eq("courseName", courseId), Restrictions.eq("examDate", date)));
			List list = criteria.list();
			if (list.size() > 0) {
				dto = (TimeTableDTO) list.get(0);
			}
		} catch (HibernateException e) {

			throw new ApplicationException("Exception : Exception in getting TimetableDTO by pk");
		} finally {
			session.close();
		}
		return dto;
	}

	public TimeTableDTO checkBySubjectName(long courseId, long subjectId, Date examDate) throws ApplicationException {
		// TODO Auto-generated method stub
		long l = examDate.getTime();
		java.sql.Date date = new java.sql.Date(l);
		Session session = null;
		TimeTableDTO dto = null;
		try {

			session = HibDataSource.getSession();
			Criteria criteria = session.createCriteria(TimeTableDTO.class);
			Disjunction dis = Restrictions.disjunction();
			dis.add(Restrictions.eq("courseName", courseId));
			dis.add(Restrictions.eq("subjectName", subjectId));
			dis.add(Restrictions.eq("examDate", date));
			criteria.add(dis);
			List list = criteria.list();
			if (list.size() > 0) {
				dto = (TimeTableDTO) list.get(0);
			}
		} catch (HibernateException e) {
			e.printStackTrace();

			throw new ApplicationException("Exception : Exception in getting TimetableDTO by pk");
		} finally {
			session.close();
		}
		return dto;
	}

	public TimeTableDTO checkBySemester(long courseId, long subjectId, String semester, Date examDate) throws ApplicationException {
		// TODO Auto-generated method stub
		long l = examDate.getTime();
		java.sql.Date date = new java.sql.Date(l);
		Session session = null;
		TimeTableDTO dto = null;
		try {
			session = HibDataSource.getSession();
			Criteria criteria = session.createCriteria(TimeTableDTO.class);
			Disjunction dis = Restrictions.disjunction();
			dis.add(Restrictions.eq("courseName", courseId));
			dis.add(Restrictions.eq("subjectName", subjectId));
			dis.add(Restrictions.like("semester", semester));
			dis.add(Restrictions.eq("examDate", date));
			criteria.add(dis);
			List list = criteria.list();
			if (list.size() > 0) {
				dto = (TimeTableDTO) list.get(0);
			}

		} catch (HibernateException e) {
			e.printStackTrace();

			throw new ApplicationException("Exception : Exception in getting TimetableDTO by pk");
		} finally {
			session.close();
		}
		return dto;
	}

	/*public static void main(String[] args) throws ApplicationException {
		
		TimeTableModelHibImp t=new TimeTableModelHibImp();
		
		TimeTableDTO dto=new TimeTableDTO();
		
		dto.setCourseName("ad");
		t.add(dto);
	}*/
	
}
