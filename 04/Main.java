import Work.FileTask;
import Work.Priority;
import ReadWrite.Comparison;
import ReadWrite.TextReader;
import ReadWrite.TextWriter;

import java.net.SocketOption;
import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        FileTask fileTask = new FileTask(1,"Алена", Priority.PriorityHigh // высокий приоритет
                , new Date(123, 00,07),"Сделать уборку во всех комнатах");

        FileTask fileTask1 = new FileTask(2,"Елена", Priority.PriorityMedium // средний приоритет
                , new Date(123,00,07),"Помыть полы и сварить обед");

        FileTask fileTask2 = new FileTask(3,"Андрей", Priority.PriorityIsLow // низкий приоритет
                , new Date(123,00,07),"Вынести мусор и сходить в магазин");


        System.out.println("Перечислены все приоритеты без сортировки:");
        List<FileTask> fileTaskList = Arrays.asList(fileTask2,fileTask,fileTask1);
        for (FileTask task : fileTaskList) {
            System.out.println("id " + task.getId() + " * " + task.getDate() + " * " + task.getFio() + " - "+ task.getText());
        }

        System.out.println("\nА теперь показываем приоритеты в порядке убывания:");
        List<FileTask> compareByFileTask = Arrays.asList(fileTask,fileTask1,fileTask2);
        Comparison comparisons = new Comparison();
        fileTaskList.sort(comparisons);

        for (FileTask task : fileTaskList) {
            System.out.println("id " + task.getId() + " * " + task.getDate() + " * " + task.getFio() + " - "+ task.getText());
        }

        TextWriter textWriter = new TextWriter();
        textWriter.textWriter(fileTask);

        System.out.println("\nЧтение из файла 'base.txt' информации о самом высоком приоритете");

        TextReader textReader = new TextReader();
        textReader.textReader("base.txt");

    }

}
