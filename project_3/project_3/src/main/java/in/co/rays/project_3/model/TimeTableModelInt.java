package in.co.rays.project_3.model;
import java.util.List;

import in.co.rays.project_3.dto.TimeTableDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DataBaseException;

public interface TimeTableModelInt {
	
	public long add(TimeTableDTO dto) throws ApplicationException;
	public void delete(TimeTableDTO dto) throws ApplicationException;
	public void update(TimeTableDTO dto) throws ApplicationException, DataBaseException;
	public List list() throws ApplicationException;
	public List list(int pageNo,int pageSize) throws ApplicationException;
	public List search(TimeTableDTO dto) throws ApplicationException;
	public List search(TimeTableDTO dto,int pageNo,int pageSize) throws ApplicationException;
	public TimeTableDTO findByPk(long pk) throws ApplicationException;
	public TimeTableDTO checkByCourseName(long courseId,java.util.Date examDate) throws ApplicationException;
	public TimeTableDTO checkBySubjectName(long courseId,long subjectId,java.util.Date examDate) throws ApplicationException;
	public TimeTableDTO checkBySemester(long courseId,long subjectId,String semester,java.util.Date examDate) throws ApplicationException;

}