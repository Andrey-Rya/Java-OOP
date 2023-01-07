package Work;

import java.sql.Date;

public abstract class Text implements WorkWithText {

    private Integer id;
    private String fio;
    private Priority priority;
    private Date date;
    private String task;

    public Text(Integer id, String fio, Priority priority,Date date,String task){

        this.id = id;
        this.fio = fio;
        this.priority = priority;
        this.date = date;
        this.task = task;
    }


    public String getText() {
        return task;
    }

    public void setText(String task) {
        this.task = task;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
