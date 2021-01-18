package in.co.rays.project_3.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import in.co.rays.project_3.dto.BaseDTO;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.model.ModelFactory;
import in.co.rays.project_3.model.RoleModelInt;
import in.co.rays.project_3.util.DataUtility;
import in.co.rays.project_3.util.DataValidator;
import in.co.rays.project_3.util.PropertyReader;
import in.co.rays.project_3.util.ServletUtility;

/**
 * role functionality controller.to perform add ,update operation
 * @author ajay
 *
 */
@WebServlet(urlPatterns = { "/ctl/RoleCtl" })
public class RoleCtl extends BaseCtl{

	private static final long serialVersionULD = 1L;

	private static Logger log = Logger.getLogger(RoleCtl.class);

	protected boolean validate(HttpServletRequest request) {

		log.debug("RoleCtl Method validate Started");

		boolean pass = true;
         System.out.println(request.getParameter("name")+"......"+request.getParameter("description"));
		if (DataValidator.isNull(request.getParameter("name"))) {
			request.setAttribute("name", PropertyReader.getValue("error.require", "Name"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("description"))) {
			request.setAttribute("description", PropertyReader.getValue("error.require", "Description"));
			pass = false;
		}

		log.debug("RoleCtl Method validate Ended");

		return pass;
	}
	protected BaseDTO populateDTO(HttpServletRequest request) {
		RoleDTO dto = new RoleDTO();
		
		dto.setId(DataUtility.getLong(request.getParameter("id")));

		dto.setName(DataUtility.getString(request.getParameter("name")));
		dto.setDescription(DataUtility.getString(request.getParameter("description")));
		
		populateDTO(dto,request);
		return dto;

	}
	/**
	 * Contains Display logics
	 */
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		
		log.debug("RoleCtl Method doGet Started");
		
		System.out.println("in do get");
		
		String op=DataUtility.getString(request.getParameter("operation"));
		
		RoleModelInt model=ModelFactory.getInstance().getRoleModel();
		
		long id=DataUtility.getLong(request.getParameter("id"));
		if(id>0){
			RoleDTO bean;
			try{
				bean=model.findByPk(id);
				ServletUtility.setDto(bean,request);
			}catch(ApplicationException e){
				log.error(e);
				ServletUtility.handleException(e, request, response);
				return;
			}
		}
		ServletUtility.forward(getView(), request, response);
		log.debug("RoleCtl Method doGetEnded");
	}
	
	/**
	 * Contains Submit logics
	 */
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		log.debug("RoleCtl Method doGet Started");
		
		System.out.println("to do post");
	
	String op=DataUtility.getString(request.getParameter("operation"));
	
	RoleModelInt model=ModelFactory.getInstance().getRoleModel();
	long id=DataUtility.getLong(request.getParameter("id"));
	
	 
		if (OP_SAVE.equalsIgnoreCase(op)|| OP_UPDATE.equalsIgnoreCase(op)) {

			RoleDTO bean=(RoleDTO)populateDTO(request);

	            try {
	                if (id > 0) {
	                    model.update(bean);
	                    ServletUtility.setSuccessMessage("Data is successfully Update", request);
	                } else {
	                   try {
	                	     long pk = model.add(bean);
	                	     ServletUtility.setSuccessMessage("Data is successfully Saved", request);
//	                         bean.setId(pk);
	                   }catch (ApplicationException e) {
							log.error(e);
							ServletUtility.handleException(e, request, response);
							return;
						} catch (DuplicateRecordException e) {
							ServletUtility.setDto(bean, request);
							ServletUtility.setErrorMessage("Role already exists", request);
						}
	                   
	                
	                }

	                ServletUtility.setDto(bean, request);
	                ServletUtility.setSuccessMessage("Data is successfully saved", request);

	            } catch (ApplicationException e) {
	                log.error(e);
	                ServletUtility.handleException(e, request, response);
	                return;
	            } catch (DuplicateRecordException e) {
	                ServletUtility.setDto(bean, request);
	                ServletUtility.setErrorMessage("Role already exists", request);
	            } 

	        } else if (OP_CANCEL.equalsIgnoreCase(op)) {

	            ServletUtility.redirect(ORSView.ROLE_LIST_CTL, request, response);
	            return;

	        }else if (OP_RESET.equalsIgnoreCase(op)) {

				ServletUtility.redirect(ORSView.ROLE_CTL, request, response);
				return;

			}


	        ServletUtility.forward(getView(), request, response);

	        log.debug("RoleCtl Method doPOst Ended");
	        
	}
	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.ROLE_VIEW;
	}

}
