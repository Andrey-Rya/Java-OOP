package ReadWrite;
import Work.FileTask;
import Work.Priority;
import java.util.Comparator;

public class Comparison implements Comparator<FileTask> {
    @Override
    public int compare(FileTask o1, FileTask o2) {

        return  o1.getPriority() == Priority.PriorityHigh ? o1.getId() : o2.getId();

    }
}
