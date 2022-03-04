package student;

import java.util.ArrayList;

public class CMSC implements Major{

    public boolean qualifyForMajor(ArrayList<Course> courses) {
        int total = 0;
        int advancedCourseTotal = 0;

        for (int i = 0; i <= courses.size() - 1; i++)
        {
            Course temp = courses.get(i);
            if (temp.getDepartment().equals("CMSC")) {
                if (temp.getCourseNumber() >= 200)

                {
                    total++;
                }
            }
        }

        if (total >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString() {
        return "CMSC";
    }
}

