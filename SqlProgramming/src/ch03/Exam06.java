package ch03;

import java.util.List;

public class Exam06 {

	public static void main(String[] args) {
		Employee emp = getEmployee(1001);
		System.out.println(emp.getEmpno() + ":" + emp.getEname() + ":" + emp.getSal());
		List <Department> result = getDepartment("개발");
		for(Department dept : result) {
			System.out.println(dept.getDeptno() + ":" + dept.getDname() + ":" + dept.getLoc());
		}
	}

	private static Employee getEmployee(int searchEmpno) {
		// select * from emp where empno=?
		return null;
	}
	
	private static List<Department> getDepartment(String searchDname) {
		// select * from dept where dname like ?
		return null;
	}
}
