import java.util.*;
public class EmployeeAttendanceRanking {
    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {
        Integer[] idx = new Integer[employeeIds.length];
        for(int i=0;i<idx.length;i++) idx[i] = i;

        Arrays.sort(idx, (a,b) -> {
            if(attendance[b] != attendance[a])
                return attendance[b] - attendance[a];
            return Integer.compare(employeeIds[a], employeeIds[b]);
        });

        int[] result = new int[k];
        for(int i=0;i<k;i++) result[i] = employeeIds[idx[i]];
        return result;
    }
}