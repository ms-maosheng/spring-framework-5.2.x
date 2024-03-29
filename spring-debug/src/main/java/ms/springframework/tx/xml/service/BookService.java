package ms.springframework.tx.xml.service;

import ms.springframework.tx.xml.dao.BookDao;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    BookDao bookDao;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    
    public void checkout(String username,int id){

        try {
            bookDao.updateStock(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
