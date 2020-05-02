package spring.nnamdi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.nnamdi.DAO.EmployeeDAO;
import spring.nnamdi.model.EmployeeVO;

import java.util.List;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
//    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<EmployeeVO> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
