package edu.iuh.fit.exer3;

public class CourseList {
    private Course[] courses;
    int count = 0;

    public CourseList(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Length of the array must be greater than 0");
        courses = new Course[n];
    }

    public boolean addCourse(Course course) {
        // check NULL
        if (course == null)
            return false;
        // check if already exists
        if (isExists(course))
            return false;
        // if full
        if (count == courses.length)
            return false;
        courses[count++] = course;
        return true;  // Add this return statement
    }

    private boolean isExists(Course course) {  // Corrected method name
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(course.getId()))
                return true;
        }
        return false;
    }

    public Course[] getCourses() {
        return courses;
    }
}