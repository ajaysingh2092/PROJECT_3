package in.co.rays.project_3.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import in.co.rays.project_3.dto.CollegeDTO;
import in.co.rays.project_3.dto.CourseDTO;
import in.co.rays.project_3.dto.FacultyDTO;
import in.co.rays.project_3.dto.SubjectDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.util.HibDataSource;

/**
 * Hibimlementation of Faculty model
 * @author ajay
 *
 */
public class FacultyModelHibImp implements FacultyModelInt{


	
	
	public long add(FacultyDTO dto) throws ApplicationException, DuplicateRecordException {
		// TODO Auto-generated method stub
	
		Session session=HibDataSource.getSession();
		Transaction tx=null;
		long pk=0;
		CollegeModelInt model= ModelFactory.getInstance().getCollegeModel();
		CollegeDTO dto1=model.findByPK(dto.getCollegeId());
		String collegeName =dto1.getName();
		dto.setCollegeName(collegeName);
		
		CourseModelInt model1=ModelFactory.getInstance().getCourseModel();
		CourseDTO dto2=model1.findByPk(dto.getCourseId());
		String courseName=dto2.getCourseName();
		dto.setCourseName(courseName);
		
		SubjectModelInt model2=ModelFactory.getInstance().getSubjectModel();
		SubjectDTO dto3=model2.findByPk(dto.getSubjectId());
		String subjectName=dto3.getSubjectName();
		dto.setSubjectName(subjectName);
		
		FacultyDTO duplicateName=findByEmailId(dto.getEmailId());
		if(duplicateName!=null&& duplicateName.getId() != dto.getId()){
			throw new DuplicateRecordException("Faculty already exists");
		}
		
	try{
		tx=session.beginTransaction();
		session.save(dto);
		pk=dto.getId();
		tx.commit();
	}catch(HibernateException e){
		if(tx!=null){
			tx.rollback();
		}
		throw new ApplicationException("Exception in faculty Add " + e.getMessage());
	}finally{
		session.close();
	}	
		
		return pk;
	}

	public void update(FacultyDTO dto) throws ApplicationException, DuplicateRecordException {
		// TODO Auto-generated method stub
		Session session=HibDataSource.getSession();
		Transaction tx=null;
		CollegeModelInt model= ModelFactory.getInstance().getCollegeModel();
		CollegeDTO dto1=model.findByPK(dto.getCollegeId());
		String collegeName =dto1.getName();
		dto.setCollegeName(collegeName);
		
		CourseModelInt model1=ModelFactory.getInstance().getCourseModel();
		CourseDTO dto2=model1.findByPk(dto.getCourseId());
		String courseName=dto2.getCourseName();
		dto.setCourseName(courseName);
		
		SubjectModelInt model2=ModelFactory.getInstance().getSubjectModel();
		SubjectDTO dto3=model2.findByPk(dto.getSubjectId());
		String subjectName=dto3.getSubjectName();
		dto.setSubjectName(subjectName);
		
		FacultyDTO duplicateName=findByEmailId(dto.getEmailId());
		if(duplicateName!=null&& duplicateName.getId() != dto.getId()){
			throw new DuplicateRecordException("Faculty already exists");
		}
		
		try{
			tx=session.beginTransaction();
			session.update(dto);
			tx.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			throw new ApplicationException("Exception in faculty update " + e.getMessage());
		} finally {
			session.close();
		}
	}

	public void delete(FacultyDTO dto) throws ApplicationException {
		// TODO Auto-generated method stub
		Session session=HibDataSource.getSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();
			session.delete(dto);
			tx.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();

			}
			throw new ApplicationException("Exception in faculty delete " + e.getMessage());
		} finally {
			session.close();
		}
	}

	public FacultyDTO findByPk(long pk) throws ApplicationException {
		// TODO Auto-generated method stub
		
		FacultyDTO dto=null;
		Session session=HibDataSource.getSession();
		
		try{
			dto=(FacultyDTO) session.get(FacultyDTO.class, pk);
		}catch (HibernateException e) {

			throw new ApplicationException("Exception : Exception in getting faculty by pk");
		} finally {
			session.close();
		}
		return dto;
	}

	public FacultyDTO findByEmailId(String emailId) throws ApplicationException {
		// TODO Auto-generated method stub
		FacultyDTO dto=null;
		Session session=HibDataSource.getSession();
		
		try{
			Criteria criteria=session.createCriteria(FacultyDTO.class);
			criteria.add(Restrictions.eq("emailId", emailId));
			List list= criteria.list();
			if(list.size()>0){
				dto=(FacultyDTO) list.get(0);
			}
		}catch (HibernateException e) {

			throw new ApplicationException("Exception in getting faculty by Login " + e.getMessage());

		} finally {
			session.close();
		}
		return dto;
	}

	public List list() throws ApplicationException {
		// TODO Auto-generated method stub
		
		return list(0,0);
	}

	public List list(int pageNo, int pageSize) throws ApplicationException {
		// TODO Auto-generated method stub
		Session session=HibDataSource.getSession();
		
			List list=null;
			try{
				Criteria criteria=session.createCriteria(FacultyDTO.class);
				
				if(pageSize>0){
					pageNo=(pageNo-1)*pageSize;
					criteria.setFirstResult(pageNo);
					criteria.setMaxResults(pageSize);
				}
				list=criteria.list();
			}catch (HibernateException e) {
	
				throw new ApplicationException("Exception : Exception in  faculty list");
		} finally {
			session.close();
		}

		return list;
	}

	public List search(FacultyDTO dto) throws ApplicationException {
		// TODO Auto-generated method stub
		
		return search(dto,0,0);
	}

	public List search(FacultyDTO dto, int pageNo, int pageSize) throws ApplicationException {
		// TODO Auto-generated method stub
		List list=null;
		Session session=HibDataSource.getSession();
		
		try{
			Criteria criteria =session.createCriteria(FacultyDTO.class);
			
			
			if(dto!=null){
				if(dto.getId()>0){
					criteria.add(Restrictions.eq("id", dto.getId()));
				}
				if(dto.getFirstName()!=null &&dto.getFirstName().length()>0){
					criteria.add(Restrictions.like("firstName", dto.getFirstName() +"%"));
				}
				if (dto.getEmailId() != null && dto.getEmailId().length() > 0) {
	                criteria.add(Restrictions.like("emailId", dto.getEmailId()
	                        + "%"));
	            }
	            if (dto.getLastName() != null && dto.getLastName().length() > 0) {
	                criteria.add(Restrictions.like("lastName", dto.getLastName() + "%"));
	            }
	            if (dto.getCollegeId() > 0) {
	                criteria.add(Restrictions.eq("collegeId", dto.getCollegeId()));
	            }
	            if (dto.getCourseId() > 0) {
	                criteria.add(Restrictions.eq("courseId", dto.getCourseId()));
	            }
	            /*if (dto.getSubjectId() > 0) {
	                criteria.add(Restrictions.eq("subjectId", dto.getSubjectId()));
	            }*/
			}
			if(pageSize>0){
				pageNo=(pageNo-1) * pageSize ;
				criteria.setFirstResult(pageNo);
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
	
	public static void main(String[] args) throws ApplicationException, DuplicateRecordException {
		
		FacultyModelHibImp f=new FacultyModelHibImp();
		
		FacultyDTO dto=new FacultyDTO();
		
		dto.setCollegeName("ad");
		f.add(dto);
	}

}
