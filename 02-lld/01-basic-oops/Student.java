public class Student {

    private String name;
    private String courseStatus;

    public void pauseCourse() {
        this.courseStatus = "PAUSED";
    }

    public void resetCourse() {
        this.courseStatus = "ACTIVE";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("name: ");
        sb.append(name);
        sb.append(", ");
        sb.append("courseStatus: ");
        sb.append(courseStatus);
        sb.append("]");
        return sb.toString();
    }
}
