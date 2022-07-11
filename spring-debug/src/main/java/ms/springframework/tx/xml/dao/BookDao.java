package ms.springframework.tx.xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDao {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 减去某个用户的余额
     * @param userName
     * @param price
     */
    public void updateBalance(String userName,int price){
        String sql = "update account set balance = balance - ? where username=?";
        jdbcTemplate.update(sql,price,userName);
    }


    public int getPrice(int id){
        String sql = "select price from book where id=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,id);
    }


    public void updateStock(int id){
        String sql = "update book_stock set stock = stock-1 where id=?";
		for(int i = 5; i > -1; i--){
			System.out.println(12/i);
		}
        jdbcTemplate.update(sql,id);
    }
}
