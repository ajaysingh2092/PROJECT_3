package in.co.rays.project_3.model;

import java.util.List;

import in.co.rays.project_3.dto.CourseDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;

public interface CourseModelInt {
	
	public long add(CourseDTO dto) throws ApplicationException, DuplicateRecordException;
	public void update(CourseDTO dto) throws ApplicationException, DuplicateRecordException;
	public void delete(CourseDTO dto) throws ApplicationException;
	public CourseDTO findByPk(long pk) throws ApplicationException;
	public CourseDTO findByName(String name) throws ApplicationException;
	public List list() throws ApplicationException;
	public List list(int pageNo,int pageSize) throws ApplicationException;
	public List search(CourseDTO dto) throws ApplicationException;
	public List search(CourseDTO dto,int pageNo,int pageSize) throws ApplicationException;
	
	

}
