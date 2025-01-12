package sets;

public class StudentMarks implements Comparable<StudentMarks> {
    private int M_marks;
    private int P_marks;

    public StudentMarks(int m_marks, int p_marks) {
        M_marks = m_marks;
        P_marks = p_marks;
    }

    public int getM_marks() {
        return M_marks;
    }

    public void setM_marks(int m_marks) {
        M_marks = m_marks;
    }

    public int getP_marks() {
        return P_marks;
    }

    public void setP_marks(int p_marks) {
        P_marks = p_marks;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "M_marks=" + M_marks +
                ", P_marks=" + P_marks +
                '}' + "\n";
    }

    @Override
    public int compareTo(StudentMarks o) {
            return this.M_marks - o.M_marks;
    }
}
