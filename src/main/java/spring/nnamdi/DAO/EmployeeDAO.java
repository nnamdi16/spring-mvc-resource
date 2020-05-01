package spring.nnamdi.DAO;

import spring.nnamdi.model.EmployeeVO;

import java.util.List;

public interface EmployeeDAO {
    public List<EmployeeVO> getAllEmployees();
}
