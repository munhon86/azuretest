import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by HP on 6/9/2017.
 */
public class Testing {
    public static void main(String[] args )
    {
        HashMap<Integer,List<String>> newMap = new HashMap<>();
        List<String> newList = new ArrayList<>();
        newMap.put(0, newList);
        int newVal = newMap.get(0).size();
        //Task task = new Task();
        //int newVal = task.getMonth();
        System.out.println("newVal is " + newVal);
    }
}

class TaskInfo {
    private int mMonth;
    private List<String> mMonthlyTaskList;

    public int getmMonth() {
        return mMonth;
    }

    public void setmMonth(int mMonth) {
        this.mMonth = mMonth;
    }

    public List<String> getmMonthlyTaskList() {
        return mMonthlyTaskList;
    }

    public void setmMonthlyTaskList(List<String> mMonthlyTaskList) {
        this.mMonthlyTaskList = mMonthlyTaskList;
    }


    public int getTaskListCount()
    {
        return this.mMonthlyTaskList.size();
    }
}

class Task
{
    private int month = 2;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
