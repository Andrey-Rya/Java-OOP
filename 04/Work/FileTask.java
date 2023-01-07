package Work;
import java.sql.Date;
public class FileTask extends Text {


    public FileTask(Integer id, String fio, Priority priority, Date date, String task) {
        super(id, fio, priority, date, task);
    }

    @Override
    public void saveText(Object object) {

    }

    @Override
    public void loadText(Object object) {

    }
}
