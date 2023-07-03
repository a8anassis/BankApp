package gr.aueb.cf.dao;

import gr.aueb.cf.model.Account;
import testbed.dao.IAccountDAO;

public class AccountDAOImpl extends AbstractDAO<Account> implements IAccountDAO {

    public AccountDAOImpl() {
        this.setPersistentClass(Account.class);
    }
}
