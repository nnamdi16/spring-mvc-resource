package spring.nnamdi.DAO;

import org.springframework.stereotype.Repository;
import spring.nnamdi.model.EmployeeVO;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public List<EmployeeVO> getAllEmployees() {
        List<EmployeeVO> employees =  new ArrayList<EmployeeVO>();
        EmployeeVO employeeVO = new EmployeeVO();
        employeeVO.setId(1);
        employeeVO.setFirstName("Shelly");
        employeeVO.setLastName("Bully");
        employees.add(employeeVO);

        EmployeeVO employeeVO1 = new EmployeeVO();
        employeeVO1.setId(2);
        employeeVO1.setFirstName("Jack");
        employeeVO1.setLastName("Jill");
        employees.add(employeeVO1);

        return employees;

    }
}
