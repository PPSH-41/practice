package domain;

public class t_course {
    private int courseid;
    private String coursename;
    private String coursestate;

    @Override
    public String toString() {
        return "T_course{" +
                "courseid=" + courseid +
                ", coursename='" + coursename + '\'' +
                ", coursestate='" + coursestate + '\'' +
                '}';
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursestate() {
        return coursestate;
    }

    public void setCoursestate(String coursestate) {
        this.coursestate = coursestate;
    }
}
