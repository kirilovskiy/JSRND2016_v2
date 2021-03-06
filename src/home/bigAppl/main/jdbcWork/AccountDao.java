package jdbcWork;

import logic.Account;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.List;

public interface AccountDao {
    void setDataSource(DataSource ds);
    void create(long id, String accNumber, long clientId, BigDecimal saldo);
    Account getAccount(long id);
    List<Account> listAccounts();
    List<Account> listAccounts(long clientId);
    void del(long id);
    void upd(long id, String accNumber, long clientId, BigDecimal saldo);
}
