package in.co.rays.project_3.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import in.co.rays.project_3.dto.CourseDTO;
import in.co.rays.project_3.dto.SubjectDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.util.HibDataSource;


/**
 * HibImlementation of SubjectModel
 * @author ajay
 *
 */
public class SubjectModelHibImp implements SubjectModelInt {

	
	
	public long add(SubjectDTO dto) throws ApplicationException, DuplicateRecordException {

		Session session= HibDataSource.getSession();
		Transaction tx=null;
		CourseModelInt cModel = ModelFactory.getInstance().getCourseModel();
		CourseDTO cDto = cModel.findByPk(dto.getCourseId());
		dto.setCourseName(cDto.getCourseName());
		
		
		SubjectDTO duplicataSub = findByName(dto.getSubjectName());
		System.out.println("subject duplicate    "+duplicataSub);
	    // Check if create Subject already exist
	    if (duplicataSub!= null && duplicataSub.getSubjectName()!=null) {
	        throw new DuplicateRecordException("Subject already exists");}
		try{
			tx=session.beginTransaction();
			session.save(dto);
			tx.commit();
		}catch(HibernateException e){
			if(tx!=null){
				tx.rollback();
			}
			throw new ApplicationException("Exception in getting add subject"+e.getMessage());
		}finally{
			session.close();
		}
		
		return 0;
	}

	public void update(SubjectDTO dto) throws ApplicationException, DuplicateRecordException {

		Session session= HibDataSource.getSession();
		Transaction tx=null;
		CourseModelInt cModel = ModelFactory.getInstance().getCourseModel();
		CourseDTO cDto = cModel.findByPk(dto.getCourseId());
		dto.setCourseName(cDto.getCourseName());
		
		
		SubjectDTO duplicataSub = findByName(dto.getSubjectName());
		System.out.println("subject duplicate    "+duplicataSub);
	    // Check if create Subject already exist
	    if (duplicataSub!= null && duplicataSub.getSubjectName()!=null) {
	        throw new DuplicateRecordException("Subject already exists");}
		try{
			tx=session.beginTransaction();
			session.update(dto);
			tx.commit();
		}catch(HibernateException e){
			if(tx!=null){
				tx.rollback();
			}
			throw new ApplicationException("Exception in update subject"+e.getMessage());
		}finally{
			session.close();
		}
	}

	public void delete(SubjectDTO dto) throws ApplicationException {

		Session session= HibDataSource.getSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();
			session.delete(dto);
			tx.commit();
		}catch(HibernateException e){
			if(tx!=null){
				tx.rollback();
			}
			throw new ApplicationException("Exception in delete subject"+e.getMessage());
		}finally{
			session.close();
		}
	}

	public SubjectDTO findByPk(long pk) throws ApplicationException {

		Session session= HibDataSource.getSession();
		
		SubjectDTO dto=null;
		try{
		dto=(SubjectDTO) session.get(SubjectDTO.class, pk);
		}catch(HibernateException e){
			throw new ApplicationException("Exception in findByPk"+e.getMessage());
		}finally{
			session.close();
		}
		return dto;
	}

	public SubjectDTO findByName(String name) throws ApplicationException {

		Session session= HibDataSource.getSession();
		
		SubjectDTO dto=null;
		List list=null;
		try{
			Criteria criteria=session.createCriteria(SubjectDTO.class);
			criteria.add(Restrictions.eq("subjectName", name));
			list=criteria.list();
			if(list.size()==1){
				dto=(SubjectDTO) list.get(0);		
			}
		}catch (HibernateException e) {
            
            throw new ApplicationException("Exception in getting subject by Login " + e.getMessage());

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

		Session session= HibDataSource.getSession();
		
		List list=null;
		try{
			Criteria criteria=session.createCriteria(SubjectDTO.class);
			if(pageSize>0){
				criteria.setFirstResult(pageNo);
				criteria.setMaxResults(pageSize);
				}
			list=criteria.list();
		} catch (HibernateException e) {

			throw new ApplicationException("Exception : Exception in  course list");
		} finally {
			session.close();
		}
		return list;

	}

	public List search(SubjectDTO dto) throws ApplicationException {
		// TODO Auto-generated method stub
		return search(dto,0,0);
	}

	public List search(SubjectDTO dto, int pageNo, int pageSize) throws ApplicationException {

		Session session= HibDataSource.getSession();
		
		List list=null;
		try{
			Criteria criteria=session.createCriteria(SubjectDTO.class);
			
			if(dto!=null){
				if(dto.getId()!=null){
					criteria.add(Restrictions.eq("id", dto.getId()));
					
				}
				if(dto.getSubjectId()>0){
					criteria.add(Restrictions.eq("subjectId", dto.getSubjectId()));
				}
				if(dto.getCourseId()>0){
					criteria.add(Restrictions.eq("courseId", dto.getCourseId()));
				}
				if(dto.getCourseName()!=null&& dto.getCourseName().length()>0){
					criteria.add(Restrictions.like("courseName", dto.getCourseName()+"%"));
				}
				if(dto.getSubjectName()!=null&& dto.getSubjectName().length()>0){
					criteria.add(Restrictions.like("subjectName", dto.getSubjectName()+"%"));
				}
			}
			
				if(pageSize>0){
					criteria.setFirstResult((pageNo-1)*pageSize);
					criteria.setMaxResults(pageSize);
				}
				list=criteria.list();
			
		}catch (HibernateException e) {

			throw new ApplicationException("Exception : Exception in  subject search");
		} finally {
			session.close();
		}
		return list;
	}
	
	/*public static void main(String[] args) throws ApplicationException {
		
		SubjectModelHibImp s=new SubjectModelHibImp();
		
		SubjectDTO dto=new SubjectDTO();
		dto.setSubjectName("dsfas");
		s.add(dto);
	}*/

}