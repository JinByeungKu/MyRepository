package ch08.example;

public class DaoExample {
	public static void dbWork(DataAccessObject dao){
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}
}

class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		
	}

	@Override
	public String insert() {
		return "Oracle DB에서 삽입";
	}

	@Override
	public String update() {
		return "Oracle DB에서 수정";
	}

	@Override
	public String delete() {
		return "Oracle DB에서 삭제";
	}
	
}

class MysqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");
	}

	@Override
	public String insert() {
		return "Mysql DB에서 삽입";
	}

	@Override
	public String update() {
		return "Mysql DB에서 수정";
	}

	@Override
	public String delete() {
		return "Mysql DB에서 삭제";
	}
	
}
