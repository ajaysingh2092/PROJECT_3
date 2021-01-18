package in.co.rays.project_3.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.model.ModelFactory;
import in.co.rays.project_3.model.RoleModelHibImp;
import in.co.rays.project_3.model.RoleModelInt;
import in.co.rays.project_3.model.RoleModelJDBCImp;

public abstract class RoleModelTest {

//	RoleModelHibImp model=(RoleModelHibImp) ModelFactory.getInstance().getRoleModel();
	public static RoleModelInt model=new RoleModelJDBCImp();
	public static void main(String[] args) throws Exception {
//		addTest();
		//deleteTest();
//		updateTest();
		findByPkTest();
//		findByNameTest();
//		searchTest();
//		listTest();
	}
	
	public static void listTest() throws ApplicationException {
		// TODO Auto-generated method stub
		List list=model.list(0, 0);
		Iterator it=list.iterator();
		while(it.hasNext()){
			RoleDTO dto=(RoleDTO) it.next();
			System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
		}
		
	}
	public static void searchTest() throws ApplicationException {
		// TODO Auto-generated method stub
		RoleDTO dto1=new RoleDTO();
		dto1.setId(1L);
		dto1.setName("admin");
		List<RoleDTO> a=(List<RoleDTO>) model.search(dto1, 0, 0);
		for(RoleDTO dto: a){
			System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
		}
	}
	public static void findByNameTest() throws ApplicationException {
		// TODO Auto-generated method stub
		RoleDTO dto=model.findByName("admin");
		System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
	}
	public static void updateTest() throws ApplicationException, DuplicateRecordException {
		// TODO Auto-generated method stub
		RoleDTO dto=new RoleDTO();
		dto.setId(2L);
		dto.setName("faculty");
		dto.setDescription("jkhgfdbj");
		dto.setCreatedBy("admin");
		dto.setModifiedBy("admin");
		dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
		model.update(dto);
	}
	public static void findByPkTest() throws ApplicationException {
		// TODO Auto-generated method stub
		RoleDTO dto=model.findByPk(2L);
		System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getDescription());
	}
	public static void deleteTest() throws ApplicationException {
		// TODO Auto-generated method stub
		RoleDTO dto=new RoleDTO();
		dto.setId(2L);
		model.delete(dto);
	}
	public static void addTest() throws Exception{
		// TODO Auto-generated method stub
		RoleDTO dto=new RoleDTO();
		dto.setName("student");
		dto.setDescription("asfasfaf");
		dto.setCreatedBy("admin");
		dto.setModifiedBy("admin");
		dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));
		model.add(dto);
	}
}
