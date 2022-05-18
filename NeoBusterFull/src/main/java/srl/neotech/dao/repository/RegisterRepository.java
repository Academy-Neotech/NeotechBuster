package srl.neotech.dao.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import srl.neotech.model.UserDetail;

@Repository
public class RegisterRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	private PlatformTransactionManager transactionManager;
	
	public void addUser(UserDetail userDetail) {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		
		MapSqlParameterSource params= new MapSqlParameterSource();
		params.addValue("usernameUser", userDetail.getUsername());
		params.addValue("passwordUser", userDetail.getPassword());
		params.addValue("enabledUser",1);
		String query = "insert into users (username, password, enabled, authority_id) VALUES(:usernameUser, :passwordUser, :enabledUser,1)";
		
		try {
			jdbcTemplate.update(query, params);
			transactionManager.commit(transactionStatus);
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transactionManager.rollback(transactionStatus);
		}
	}
	
	
}
