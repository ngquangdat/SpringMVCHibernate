package places.dao;

import java.util.List;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import places.entity.Test;
import places.util.HibernateUtil;

@Repository
public class TestDAO {
	private static final Logger logger = LoggerFactory.getLogger(TestDAO.class);

	
	
	@SuppressWarnings("unchecked")
	public List<Test> listTests() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Test> personsList = session.createQuery("SELECT t FROM Test t").list();
		for(Test p : personsList){
			logger.info("Test List::"+p);
		}
		return personsList;
	}
	
	public static void main(String[] args) {
		System.out.println(new TestDAO().listTests().size());
	}
}
