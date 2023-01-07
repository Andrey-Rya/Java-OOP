ackage Work; // подготовка к считыванию записи файла

public interface WorkWithText <T> {

    void saveText(T object);
    void loadText(T object);

}
