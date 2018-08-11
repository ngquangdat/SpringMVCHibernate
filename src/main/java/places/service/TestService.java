package places.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import places.dao.TestDAO;
import places.entity.Test;


@Service
public class TestService {

	@Autowired
	private TestDAO testDAO;


	
	@Transactional
	public List<Test> listTests() {
		return this.testDAO.listTests();
	}
}
